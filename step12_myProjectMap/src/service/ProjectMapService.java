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
	
	
	//모든 Project 검색
	public ArrayList<Route> getrouteList() {	
		return routeList;
	}
	
	//Project 이름으로 검색
	public Route getRoute(String projectName) throws ProjectNotFoundException {
		for(Route r : routeList) {
				if(r.getRouteName().equals(projectName)) {
				return r;
			}
		}
		throw new ProjectNotFoundException("요청하신 Route는 존재하지 않습니다");
	}
	
	//새로운 Project 추가 
	public void routeInsert(Route project) throws RouteDuplicationException {
		for(Route r : routeList) {
			if(r.getRouteName().equals(project.getRouteName())) {
				throw new RouteDuplicationException("이미 존재하는 Route입니다");
			}
		}
		routeList.add(project);
	}
	
	//첫번째 교통수단 변경
	public boolean routeListUpdate(String projectName, FirstT Transportation) {
		for(Route project : routeList) {
			if(project.getRouteName().equals(projectName)) {
				project.setProjectFirstT(Transportation);
				return true;	//메소드 자체가 종료
			}
		}
		return false;
	}
	
	//두번째 교통수단 변경
	public void SecondTProjectUpdate(String projectName, SecondT Transportation) throws ProjectNotFoundException{
		for(Route r : routeList) {
			if(r != null && r.getRouteName().equals(projectName)) {
				r.setProjectSecondT(Transportation);
				return;
			}
		}
		throw new ProjectNotFoundException("수정하고자 하는 두번째 교통수단 프로젝트가 미 존재합니다.");
	}	

	//Project 삭제
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
	
	//진행중인 Project 총 개수 반환
	public int projectListSize() {
		return routeList.size();
	}

}
