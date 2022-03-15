package model;

public class Model {

	public static CustomerDTO[] getCustomers() {
		
		//과일 생성 (이름, 가격, 색상, 상태)
		CustomerDTO[] fruits = {new CustomerDTO("사과", 3000, "red", 'g'),
								new CustomerDTO("바나나", 2500, "yellow", 'g'),
								new CustomerDTO("석류", 6000, "red", 'b'),
								new CustomerDTO("멜론", 4500, "green", 'g'),
								new CustomerDTO("수박", 2000, "green", 'b'),
								new CustomerDTO("참외", 2000, "yellow", 'g'),
								new CustomerDTO("망고", 4000, "yellow", 'b')};
		
		//반환
		return fruits;
	}
}
