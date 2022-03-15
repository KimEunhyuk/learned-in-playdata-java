/*
 * 데이터용(domain)
 * 	- Data Transfer Object(DTO)/Value Object(VO)
 * 	- 기본 구조 : 멤버변수/기본생성자/생성자/gettet/setter/toString()재정의
 * 		재정의 권장 메소드 
 * 			- 객체가 보유값 비교(보유한 모든 멤버 변수들 값 비교) 기능의 메소드
 * 			- public boolean equals(Object o){}
 * 				: javaa.lang.Object의 메소드 기능
 * 					- 생성된 객체의 주소값 비교
 * 					- == (동등비교 연산자)
 * 						- 참조타입 비교시 : 연산자가 객체들 주소값 비교 연산자
 * 						- 기본타입 비교시 : 값 비교
 * 	- 재정의 rule
 * 		-반환타입 메소드명(argument) : 100% 동일
 */

package step05.oop;

class Person{
	private String name;
	private int age;
	
	public Person() {
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	// 생성자들, getter/setter다 있다 가정
	
	//Person 객체들의 내용값(데이터값) 비교 메소드로 재정의
	/*
	 * Person 타입 여부 확인
	 * Person 타입이 아니다 : false
	 * Person 타입이다?
	 * 	- name(String)과 age(int)값 비교
	 *  	name과 age가 같다			: true
	 *  	name은 같으나 age가 다르다 	: false
	 *  	name은 다르고 age가 같다 	: false
	 *  
	 *  	-name은 String의 equals()
	 *  	-age는 == 동등비교 연산자
	 *  
	 *  && : 조건식1&&조건식2
	 *  	- 두가지 조건식 모두 true인 경우에만 true
	 *  	- 조건식1 false인 경우 조건식2는 검증 안함
	 *  		- 빠른 연산자라고 함 
	 *  		- and 연산자
	 */
	public boolean equals(Object o) {
		if(o instanceof Person) {
//			if(name.equals(((Person)o).name)
//					&& age == ((Person)o).age) {
			Person p = (Person)o;
			if(name.equals(p.name)&& age == p.age) {
				return true;
			}
		}else {
			return false;
		}
		return false;
		
	}
	/*
	Person p1 = new Person(...);
	Person p2 = new Person(...);
	p1.equals(p2);
	p2.equals(p1);
	
	String s = "Ee";
	s.equals("ee");
	* 
	*/
	
	
}
/*
 * Object o = new A(); / = new B(); / = new C();
 * 
 * A a = new A(); / = new B() / new C()
 * B b = new B();
 * C c = new C();
 * 
 * A a = new C(); // Object -> A -> C 객체 순으로 생성
 * 질문
 *  a 변수 타입? A타입
 *  a 변수로 활용 가능한 객체 - C > A > Object
 */

class A{}
class B extends A{}
class C extends A{}

public class OverridTest {
	
	
	public static void m1() {
		//String값 비교
		String s1 = "a";	// 객체 생성
//		String s2 = "a";
		String s2 = new String("a"); // 새로운 객체 생성
		String s3 = "a";	// 이미 new 없이 생성된 문자열 객체가 동일한 데이터값으로 존재할 경우 재사용
		String s4 = new String("a"); // 새로운 객체 생성	
		
		System.out.println("m1");
//		System.out.println(s1 == s2); //주소값 비교 true 
		System.out.println(s1 == s2); //false new를 써서 주소가 달라짐. 새로운 객체라서
		//String 클래스가 재정의한 메소드 호출 즉 String 타입들 객체간의 내용값 비교
		System.out.println(s1.equals(s2)); // 객체가 보유한 내용값 비교 true
		System.out.println(s1 == s3); //true
		System.out.println(s1.equals(s2));	//true
	}
	/*
	 * instanceof
	 * 	- 객체 타입 비교 연산자
	 *  - 상속 관계를 무시하지 않음
	 *  	- 상위타입 변수로 생성된 객체들은 상위타입을 상속받는 모든 클래스 타입과 비교 가능
	 *  - 문법
	 *  	참조변수 instanceof 비교타입
	 */
	public static void m2() {
		System.out.println("m2");
		A a1 = new B();	//B > A > Object
		A a2 = new C();
		System.out.println(a1 instanceof A);		//true
		System.out.println(a1 instanceof B);		//true
		System.out.println(a1 instanceof C);		//false
		System.out.println(a1 instanceof Object);	//true
		System.out.println(a2 instanceof B);		//false 지만 비교는가능
		
		B b1 = new B();
		System.out.println(b1 instanceof Object);	//true
		System.out.println(b1 instanceof A);		//true
		System.out.println(b1 instanceof B);		//true
		
		//연관성이 없는 관계에선 instanceof 연산자 사용 불가
//		System.out.println(b1 instanceof C);		//문법 오류
		
	}
	
	public static void main(String[] args) {
//		m2();
		//? Person 객체들 생성해서 재정의한 equals()로 객체들 내용값 비교해 보기
		Person p1 = new Person("은혁", 11);
		Person p2 = new Person("보은", 12);
		Person p3 = new Person("보은", 12);
		Person p4 = new Person("보은", 11);
		
		System.out.println(p1.equals(p2));	//false
		System.out.println(p2.equals(p3));	//true
		System.out.println(p2.equals(p4));	//false
		System.out.println(p1.equals(p4));	//false
		System.out.println(p1.equals("an"));//false
	}
}


