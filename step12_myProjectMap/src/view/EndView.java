package view;

import java.util.ArrayList;
import model.dto.Route;

public class EndView {
	
	//�������� Ư�� ������Ʈ ��� 
	public static void projectView(Route project){
		if(project != null) {
			System.out.println(project);		
		}else {
			System.out.println("�ش� ������Ʈ�� �������� �ʽ��ϴ�.");
		}
	}
	
	//�������� ��� ������Ʈ ���
	public static void projectListView(ArrayList<Route> allProject){

		int projectSize = allProject.size();  
		
		for(int index = 0; index < projectSize; index++){	
			if(allProject.get(index) != null){
				System.out.println("[���� ���� project : " + (index+1) + "] " + allProject.get(index));
			}
			else {
				System.out.println("�� �������� project�� �������մϴ�");
			}
		}
	}	
	
	public static void successView(String message) {
		System.out.println(message);
	}

}
