package service;

import java.util.ArrayList;

import exception.ProjectNotFoundException;
import exception.RouteDuplicationException;
import model.dto.FirstT;
import model.dto.Route;
import model.dto.SecondT;

public class ProjectMapService {
	
	private static ProjectMapService instance = new ProjectMapService();

	private ArrayList<Route> routeList = new ArrayList<Route>();
	
	private ProjectMapService() {}

	public static ProjectMapService getInstance() {
		return instance;
	}
	
	
	//��� Project �˻�
	public ArrayList<Route> getrouteList() {	
		return routeList;
	}
	
	//Project �̸����� �˻�
	public Route getRoute(String projectName) throws ProjectNotFoundException {
		for(Route r : routeList) {
				if(r.getRouteName().equals(projectName)) {
				return r;
			}
		}
		throw new ProjectNotFoundException("��û�Ͻ� Route�� �������� �ʽ��ϴ�");
	}
	
	//���ο� Project �߰� 
	public void routeInsert(Route project) throws RouteDuplicationException {
		for(Route r : routeList) {
			if(r.getRouteName().equals(project.getRouteName())) {
				throw new RouteDuplicationException("�̹� �����ϴ� Route�Դϴ�");
			}
		}
		routeList.add(project);
	}
	
	//ù��° ������� ����
	public boolean routeListUpdate(String projectName, FirstT Transportation) {
		for(Route project : routeList) {
			if(project.getRouteName().equals(projectName)) {
				project.setProjectFirstT(Transportation);
				return true;	//�޼ҵ� ��ü�� ����
			}
		}
		return false;
	}
	
	//�ι�° ������� ����
	public void SecondTProjectUpdate(String projectName, SecondT Transportation) throws ProjectNotFoundException{
		for(Route r : routeList) {
			if(r != null && r.getRouteName().equals(projectName)) {
				r.setProjectSecondT(Transportation);
				return;
			}
		}
		throw new ProjectNotFoundException("�����ϰ��� �ϴ� �ι�° ������� ������Ʈ�� �� �����մϴ�.");
	}	

	//Project ����
	public boolean routeDelete(String projectName) {
		Route project = null;
		int count = routeList.size();
		for(int i=0; i<count; i++) {
			project = routeList.get(i);
			if(project.getRouteName().equals(projectName)) {
				routeList.remove(i);
				return true;
			}
		}
		return false;
	}	
	
	//�������� Project �� ���� ��ȯ
	public int projectListSize() {
		return routeList.size();
	}

}
