/* 학습내용
 * 1. static 키워드 학슴
 * 2. static 키워드 활용 영역
 * 	1. 멤버 변수에 선언 	- static 타입 변수;
 * 		- static 타입 변수;
 * 		- byte code 즉 L04Static.class 실행 코드가 메모리에 로딩될때
 * 			static 변수들은 method 또는 class 메모리에 사용가능하게 실제 메모리 생성
 * 			따라서 객체 생성과 무관하게 사용 가능한 데이터들 표현시 적함
 * 
 * 		- 호출 문법
 * 			1. class명.변수명 = 외부 클래스의 변수 호출시 사용되는 문법
 * 			2. 변수명 = 동일한 클래스 내의 static 변수 호출 문법
 * 			3. 생성된 객체의 참조 변수.변수명 = 어차피 생성되는 모든 객체가 공유 
 * 
 * 		- 부접합한 구조?
 * 			- 생성되는 객체의 데이터가 유일성 보장해야 할 경우 즉 pw처럼 중복 및 공유 금지일 경우
 * 			데이터들은 절대절대절대 static 선언금지
 * 			- 다수가 공유하는 공지사항 등은 공유 권장 static으로 처리
 * 			1. class Customer{
 * 				String id;		//생성되는 모든 객체가 개별적으로 생성하는 instance
 * 				static String pw; //생성되는 모든 객체가 공유하는 static 변수
 * 					...
 * 			}
 * 
 * 	2. 메소드에 선언	
 * 		- static 리턴타입 메소드명(){}
 * 		- 호출 방법
 * 			1. 외부 class에서 호출시
 * 				클래스명.메소드명();
 * 			2. 동일한 class에서 호출시
 * 				클래스명.메소드명();
 * 				메소드명();
 * 				참조변수명.메소드명();
 * 
 * 	3. static{}  
 * 		- byte code가 메모리에 로딩시에 자동 실행
 * 		- main() 보다 우선 실행 보장
 * 		- 다수 user들이 사용하는 공유자원 한번만 설정(초기화)시에 권장
 * 
 * 
 * 
 * 3. jvm 메모리
 * 		1. class 또는 method
 * 			- byte code가 저장되는 영역
 * 			- static으로 선언된 변수 공간 생성
 * 		2. stack - 로컬 변수들 저장 곤간
 * 		3. heap	 - 객체들만 저장
 *
 */
package step01.basic;

public class L04Static {
	//step02 - static 변수 특징
	//멤버 변수들은 객체 생성 시점에 자동으로 기본 값으로 초기화
	//실수 = 0.0, 정수 = 0, boolean = false, char = '\u0000' 값이 없다는 널 의미
	//모든 참조 타입 = null
	int i;
	static int i2;
	
	L04Static(){
		i++;	// i = i+1; 동일한 문법 즉 i 변수값에 1 더하고 다시 i 에 대합
		i2++;	// i2 = i2+1
	}
	
	void m1() {
		System.out.println("일반 메소드 = instance 메소드");
	}
	
	static void m2() {
		System.out.println("stactic 메소드");
	}
	
	static {
		System.out.println("static 블록 3");
	}
	
	static {
		System.out.println("static 블록 1");
	}
	
	public static void main(String[] args) {
		L04Static l = new L04Static();
		System.out.println(l.i + " " + i2);
		
		L04Static l2 = new L04Static();
		System.out.println(l2.i + " " + i2);
		
		l.m1();
		L04Static.m2();
		m2();
		
	}
	
	static {
		System.out.println("static 블록 2");
	}
	
//	int i = 10;		// instance 변수 : 객체 즉 instance 필수
//	static int i2 = 20;	// static 변수, non-instance 변수
//
//	public static void main(String[] args) {
//		L04Static l = new L04Static();
//		System.out.println(l.i);
//		
//		System.out.println(i2);
//		System.out.println();
//
//	}
	
}
