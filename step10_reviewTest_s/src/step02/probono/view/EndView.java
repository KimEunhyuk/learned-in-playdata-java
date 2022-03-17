/** 
 * PROJECT  : 재능기부 프로젝트
 * NAME  :  EndView.java
 * DESC  : 재능 기부 정보 출력 클래스
 * 
 * @author  
 * @version 1.0
*/

package step02.probono.view;

import java.util.ArrayList;
import java.util.Optional;

import step02.probono.model.dto.TalentDonationProject;

public class EndView {
	
	//? Optional API 사용 코드로 개선해 보기
	//진행중인 특정 프로젝트 출력 
	public static void projectView(TalentDonationProject project){
//		if(project != null) {
//			System.out.println(project);		
//		}else {
//			System.out.println("해당 프로젝트는 존재하지 않습니다.");
//		}
		
		/*
		 * if의 else문장처럼 orElse()호출 하려고함
		 * 문제가 발생
		 * 객체 존재 여부 검증 타입 - TalentDonationProject로 처리시 
		 * orElse()의 parameter 타입도 TalentDonationProject 타입이어야함
		 * 
		 * 문자열 출력을 위한 해결점 - 다형성
		 * 	- 모든 객체 다 수용 가능한 Object 타입으로 제네릭 표현
		 */
		//project = null; 이 코드는 orElse()가 정상 실행되는지 단순 확인하는 단위 test 기능
		Optional<Object> opt = Optional.ofNullable(project);
		System.out.println(opt.orElse("해당 프로젝트는 존재하지 않습니다."));
//		opt.ifPresent(data -> { System.out.println(data);
//		});
//		if (!opt.isPresent()) {
//			EndFailView.failView("해당 프로젝트는 존재하지 않습니다.");
//		}
	}
	
	//TO DO
	//진행중인 모든 프로젝트 출력
	public static void projectListView(ArrayList<TalentDonationProject> allProbonoProject){
		
		Optional<Object> optPro = Optional.ofNullable(allProbonoProject);
		if(!optPro.isPresent()) {
			System.out.println("해당 project는 존재하지 않습니다.");
		}
		
		optPro.ifPresent((data) -> {
			int allProbonoProjectSize = allProbonoProject.size();
			for(int index=0; index<allProbonoProjectSize; index++) {
				if(allProbonoProject.get(index) != null) {
					System.out.println("[진행중인 project : " + (index+1) + "] " + allProbonoProject.get(index));
				}
			}
		});
	}
		
		
//		Optional<ArrayList<TalentDonationProject>> opt = Optional.ofNullable(allProbonoProject);
//
//				opt.ifPresent(v -> {v.stream().forEach(System.out::println);});
//		
//		if(!opt.isPresent()) {
//		EndFailView.failView("현 진행중인 project는 미존재합니다.");
//		//	System.out.println(opt.orElse("현 진행중인 project는 미존재합니다."));
//		}
//	}
		
//		int projectSize = allProbonoProject.size();  
//		
//		for(int index = 0; index < projectSize; index++){	
//			if(allProbonoProject.get(index) != null){
//				System.out.println("[진행 중인 project : " + (index+1) + "] " + allProbonoProject.get(index));
//			}
//			else {
//				System.out.println("현 진행중인 project는 미존재합니다");
//			}
//		}
//	}
	
	
	public static void successView(String message) {
		System.out.println(message);
	}
	
}