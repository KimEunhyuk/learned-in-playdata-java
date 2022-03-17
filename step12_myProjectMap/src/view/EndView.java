package view;

import java.util.ArrayList;
import model.dto.Route;

public class EndView {
	
	//진행중인 특정 프로젝트 출력 
	public static void projectView(Route project){
		if(project != null) {
			System.out.println(project);		
		}else {
			System.out.println("해당 프로젝트는 존재하지 않습니다.");
		}
	}
	
	//진행중인 모든 프로젝트 출력
	public static void projectListView(ArrayList<Route> allProject){

		int projectSize = allProject.size();  
		
		for(int index = 0; index < projectSize; index++){	
			if(allProject.get(index) != null){
				System.out.println("[진행 중인 project : " + (index+1) + "] " + allProject.get(index));
			}
			else {
				System.out.println("현 진행중인 project는 미존재합니다");
			}
		}
	}	
	
	public static void successView(String message) {
		System.out.println(message);
	}

}
