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
			 EndFailView.failView("�����ϰ��� �ϴ� ������ ��ü�� �����ϴ�.");
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
					EndFailView.failView("ù��° ������� ���� �� �˻� ����");
				}
			}else {
				EndFailView.failView("�� �����ϴ� ������Ʈ ���� �õ�");
			}
		}else {
			EndFailView.failView("ù��° ������� ���� ���� ����� �Է��ϼ���!!");
		}
		
	}
	
	//������ ����, ������ ���� �߻�
	public void SecondTProjectUpdate(String projectName, SecondT Transportation) {
		if(projectName != null && Transportation !=null) {
			try {
				service.SecondTProjectUpdate(projectName, Transportation);
				EndView.successView("�ι�° ������� ���� ���� ����");
			} 
			catch (ProjectNotFoundException e) {
				e.printStackTrace();
				EndFailView.failView(e.getMessage());
			}
		}else {
			EndFailView.failView("�ι�° ������� ���� ���� ����� �Է��ϼ���!!");
		}
	}
	
	public void routeDelete(String projectName) {
		
		if(projectName != null) {
			
			boolean result = service.routeDelete(projectName);
			
			if(result) {
				EndView.successView(projectName + " ������Ʈ ���� ����");
			}
			else {
				EndFailView.failView("�����Ϸ��� ������Ʈ�� �� �����մϴ�.");
			}
		}
		
		else {
			EndFailView.failView("�����Ϸ��� ������Ʈ�� �Է��ϼ���.");
		}
	}	
}
