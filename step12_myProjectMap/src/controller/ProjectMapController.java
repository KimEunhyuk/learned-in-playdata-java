package controller;

import exception.ProjectNotFoundException;
import exception.RouteDuplicationException;
import model.dto.FirstT;
import model.dto.SecondT;
import model.dto.Route;
import service.ProjectMapService;
import view.EndFailView;
import view.EndView;

public class ProjectMapController {
	
	private static ProjectMapController instance = new ProjectMapController();
	
	private ProjectMapService service = ProjectMapService.getInstance();
	
	private ProjectMapController() {}
	
	public static ProjectMapController getInstance() {
		return instance;
	}
	
	public void getRoute(String projectName) {
		try {
			EndView.projectView(service.getRoute(projectName));
			
		} catch (ProjectNotFoundException e) {
			e.printStackTrace(); 
			EndFailView.failView(e.getMessage());
		}
	}
	
	public void getrouteList() {
		EndView.projectListView(service.getrouteList());
	}

	public void routeInsert(Route project) {
		 if(project != null) {
			try {
				service.routeInsert(project);
			} catch (RouteDuplicationException e) {
				e.printStackTrace();
				EndFailView.failView(e.getMessage());
			}
		 }else {
			 EndFailView.failView("저장하고자 하는 데이터 자체가 없습니다.");
		 }
	}
	
	public void routeListUpdate(String projectName, FirstT Transportation) {
		
		if(projectName != null && Transportation != null) {
		
			boolean result = service.routeListUpdate(projectName, Transportation);//update
			
			if(result) {
				try {
					EndView.projectView(service.getRoute(projectName));//select
				} catch (ProjectNotFoundException e) {
					e.printStackTrace();
					EndFailView.failView("첫번째 교통수단 갱신 후 검색 실패");
				}
			}else {
				EndFailView.failView("미 존재하는 프로젝트 수정 시도");
			}
		}else {
			EndFailView.failView("첫번째 교통수단 갱신 정보 제대로 입력하세요!!");
		}
		
	}
	
	//있으면 수정, 없으면 예외 발생
	public void SecondTProjectUpdate(String projectName, SecondT Transportation) {
		if(projectName != null && Transportation !=null) {
			try {
				service.SecondTProjectUpdate(projectName, Transportation);
				EndView.successView("두번째 교통수단 정보 갱신 성공");
			} 
			catch (ProjectNotFoundException e) {
				e.printStackTrace();
				EndFailView.failView(e.getMessage());
			}
		}else {
			EndFailView.failView("두번째 교통수단 갱신 정보 제대로 입력하세요!!");
		}
	}
	
	public void routeDelete(String projectName) {
		
		if(projectName != null) {
			
			boolean result = service.routeDelete(projectName);
			
			if(result) {
				EndView.successView(projectName + " 프로젝트 삭제 성공");
			}
			else {
				EndFailView.failView("삭제하려는 프로젝트가 미 존재합니다.");
			}
		}
		
		else {
			EndFailView.failView("삭제하려는 프로젝트명 입력하세요.");
		}
	}	
}
