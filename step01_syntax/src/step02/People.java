package step02;

public class People {
	//변수 - 실제 사용 가능하게 메모리에 생성되는 시점? 객체 생성 
	String name;
	int age;
	
	//생성자
	People(){}
	
	//메소드 - 사용하는 관점에서 개발
	//name변수값 제공 또는 수정하는 메소드
	String getName() {
		return name;	//호출
	}
	void setName(String newName) {	//선언
		name = newName;		//멤버호출 = 로컬변수호출	
	}
	
	int getAge() {
		return age;	//호출
	}
	void setAge(int newAge) {	//선언
		age = newAge;	//멤버호출 = 로컬변수호출
	}
	
	public static void main(String[] args) {	//선언
		//객체 생성 - name.age 메모리 생성 하면서 People영역으로 관리
		//단 주소값으로 데이터 활용, 실 주소값이 아닌 p1변수명으로 코드상에선 사용
		People p1 = new People();	//선언
		System.out.println(p1.name);	
		
		//변수 호출로 값 대입 및 확인
		p1.name = "유재석";
		System.out.println(p1.name);	
		
		//메소드 호출로 값 수정 및 확인
		p1.setName("백종원");				
		System.out.println(p1.getName()); // -name도 되는데?
		
	}

}
