package model;

import lombok.Setter;

@Setter
public class Model {
	//controller의 요청으로 한명의 정보를 db로 부터 검색해서
	//CustomerDTO 생성해서 반환
	
	//CustomerDTO가 반환타입인 getCustomer() 메소드 생성
	public static CustomerDTO getCustomer() { //Controller씨 드릴게요 잠깐만요
		//? 객체 생성
		//? setXxx() 메소드로 id는 encore/pw=11/grade=g
		//? 반환
		
		// 참조(객체)타입 생성
		CustomerDTO c = new CustomerDTO();
		
		//Id에 encore, Pw에 11, Grade에 g를 셋.
		c.setId("encore");
		c.setPw(11);
		c.setGrade('g');
		
		//반환
		return c; //이거 encore, 11, g 받아가세요
	}
	
	// 고객들을 모두 반환
	public static CustomerDTO[] getCustomers() {
		
		CustomerDTO[] c = {	new CustomerDTO("id1", 11, 'g', "개발"),
							new CustomerDTO("id2", 22, 's', "기획")};
		
		
		
		return c;
	}
	
	//..CRUD
}
