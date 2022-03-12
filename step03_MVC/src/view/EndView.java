package view;

import model.CustomerDTO;

public class EndView {
	
	public static void print(CustomerDTO c) { //Controller님 print 드릴게요
		
		System.out.println(c.getId() + " " + c.getGrade()); //이거 가져가세요
		//c를 대입한 Id Grade 출력 메소드 선언
	}
	
	//? 모든 고객 정보 출력
	// forEach / println() 참조변수값 출력시 toString() 자동 호출
	public static void printAll(CustomerDTO[] all){
		for(CustomerDTO v : all) {
			System.out.println(v); //v.toString()
		}
	}

	public static void printMsg(String msg) {
		System.out.println(msg);
	}
		
}
