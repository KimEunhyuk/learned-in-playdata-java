package step02.probono.controller;

import java.util.Optional;

import step02.probono.exception.ProjectNameDuplicationException;
import step02.probono.exception.ProjectNotFoundException;
import step02.probono.model.dto.Beneficiary;
import step02.probono.model.dto.Donator;
import step02.probono.model.dto.TalentDonationProject;
import step02.probono.service.TalentDonationProjectService;
import step02.probono.view.EndFailView;
import step02.probono.view.EndView;

public class TalentDonationProjectController {
	
	private static TalentDonationProjectController instance = new TalentDonationProjectController();
	
	private TalentDonationProjectService service = TalentDonationProjectService.getInstance();
	
	private TalentDonationProjectController() {}
	
	public static TalentDonationProjectController getInstance() {
		return instance;
	}
	
	public void getDonationProject(String projectName) {
		try {
			EndView.projectView(service.getDonationProject(projectName));
			
		} catch (ProjectNotFoundException e) {
			e.printStackTrace(); // 개발 및 관리자만 보는 콘솔창 메세지
			EndFailView.failView(e.getMessage()); // end user에게 출력하는 서비스 메세지
		}
	}

	public void getDonationProjectsList() {
		EndView.projectListView(service.getDonationProjectsList());
	}

	public void donationProjectInsert(TalentDonationProject project) {
		Optional<TalentDonationProject> opt = Optional.ofNullable(project);
		
		opt.ifPresentOrElse(v -> {
			try {
				service.donationProjectInsert(project);
			} catch (ProjectNameDuplicationException e) {
				e.printStackTrace();
				EndFailView.failView(e.getMessage());
			}
		}, () -> EndFailView.failView("null값은 생성 못함"));
		
		
		
		//		Optional<Object> dp = Optional.ofNullable(
//				try {
//				service.donationProjectInsert(project);
//				} catch (ProjectNameDuplicationException e) {
//					e.printStackTrace();
//					EndFailView.failView(e.getMessage());
//				});
//		System.out.println(dp.orElse(EndFailView.failView("저장하고자 하는 데이터 자체가 없습니다.")));
		
//		Optional<Object> opt = Optional.ofNullable(project);
//		opt.ifPresent(v -> {
//			try {
//				service.donationProjectInsert(project);
//			} catch (ProjectNameDuplicationException e) {
//				e.printStackTrace();
//				EndFailView.failView(e.getMessage());
//			}	
//		});
//		System.out.println(opt.orElse("저장하고자 하는 데이터가 없습니다."));
		
//		if(project != null) {
//			try {
//				service.donationProjectInsert(project);
//			} catch (ProjectNameDuplicationException e) {
//				e.printStackTrace();
//				EndFailView.failView(e.getMessage());
//			}
//		 }else {
//			 EndFailView.failView("저장하고자 하는 데이터 자체가 없습니다.");
//		 }
	}
	
	/*
	 * db에 있는 데이터 실제 갱신 및 검색
	 * 갱신 성공, db접속 문제 등 다양한 경우의 수 발생
	 */
	public void donationProjectUpdate(String projectName, Donator people) {
		
		if(projectName != null && people != null) {
		
			boolean result = service.donationProjectUpdate(projectName, people);//update
			
			if(result) {
				try {
					EndView.projectView(service.getDonationProject(projectName));//select
				} catch (ProjectNotFoundException e) {
					e.printStackTrace();
					EndFailView.failView("기부자 갱신 후 검색 실패");
				}
			}else {
				EndFailView.failView("미 존재하는 프로젝트 수정 시도");
			}
		}else {
			EndFailView.failView("기부자 갱신 정보 제대로 입력하세요!!");
		}
		
	}
	
	//있으면 수정, 없으면 예외 발생
	public void beneficiaryProjectUpdate(String projectName, Beneficiary people) {
//		Optional<Object> opt = Optional.ofNullable(projectName && people);
		
		
		if(projectName != null && people !=null) {
			try {
				service.beneficiaryProjectUpdate(projectName, people);
				EndView.successView("수혜자 정보 갱신 성공");
			} 
			catch (ProjectNotFoundException e) {
				e.printStackTrace();
				EndFailView.failView(e.getMessage());//수혜자 정보를 수정하고자 하는 프로젝트가 미 존재합니다. 정보 의미
			}
		}else {
			EndFailView.failView("수혜자 갱신 정보 제대로 입력하세요!!");
		}
	}
	
	// 참조 타입의 데이터 존재 여부 검증값 = null(참조하는 객체가 없다는 참조 타입의 기본값)
	
	public void donationProjectDelete(String projectName) {
		Optional<String> opt = Optional.ofNullable(projectName);
		
		opt.ifPresentOrElse(v -> {
			boolean result = service.donationProjectDelete(projectName);
			opt.ifPresentOrElse(w -> {
				EndView.successView(projectName + " 프로젝트 삭제 성공");
			}, () -> EndFailView.failView("삭제하려는 프로젝트가 미 존재합니다."));
		}, () -> EndFailView.failView("삭제하려는 프로젝트명 입력하세요."));
		
		
//		if(projectName != null) {
//			
//			boolean result = service.donationProjectDelete(projectName);
//			
//			if(result) {
//				EndView.successView(projectName + " 프로젝트 삭제 성공");
//			}
//			else {
//				EndFailView.failView("삭제하려는 프로젝트가 미 존재합니다.");
//			}
//		}
//		
//		else {
//			EndFailView.failView("삭제하려는 프로젝트명 입력하세요.");
//		}
	}
	
}
