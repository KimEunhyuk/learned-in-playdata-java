/*
 * . : 접근자 (dot 연산자)
 * 	- 생성된 객체 참조 변수로 해당 객체의 멤버들 호출시에 사용
 * 	- static으로 선언된 멤버들 클래스명. 으로 호출
 * 	- package와 import
 * 
 * 객체들 간의 호출 이해
 */
package step01.test;

class A extends Object{
	String v1 = "string";
	A(){
		super();
		//v1 멤버 변수 생성
		System.out.println("A");
	} //v1 참조 string 값의 문자열 객체와 A객체 생성완료
	
}
class B extends Object{
	A a = new A();
	int v2 = 10;
	B(){
		super();
		//B가 보유한 a변수, v2 생성
		System.out.println("B");
	}
	
}
class C extends Object{
	B b = new B();
	int v3 = 30;
	C(){
		super();
		//보유한 멤버 변수들 완벽하게 메모리에 생성
		System.out.println("C");
	}
}

public class Test {

	public static void main(String[] args) {
		//생성자 호출은 객체 생성 - 객체 생성 완성 : 멤버 변수들 메모리에 사용 가능하게 생성
		C c = new C();	
		
		//? 어떤 객체순으로 생성되는지?
		
		//? 절대 더이상의 객체 생성 없이 v1 변수값 출력하세요
		/*
		 * c.b.a.v1
		 * c : C객체
		 * c.b : B객체
		 * c.b.a : A객체
		 * c.b.a.v1 : String객체
		 */
		System.out.println();
		System.out.println(c.b.a.v1);	//string
	}
}
