// 한 라인 주석
/* 다중 라인 주석 (block 주석)*/
/* 학습내용
 * 1. 변수란?
 * - 데이터를 프로그램 적으로 표현할 수 있는 구성 요소
 * - 시스템 관점
 * 		- java 실행 환경 메모리 상에 저장되는 데이터들
 * - 데이터를 형식에 따른 타입 구분 필요
 * - 데이터 형식 종류
 *    정수, 실수, 문자형, 문자열형, 논리형
 *    
 * 2. 자바 문법의 변수
 *		- 타입 변수명 = 값;
 * 
 * 3. 예시
 * 	- 정수 두개의 변수로 연간기능 수행
 * 	- 분해
 * 	변수 두개 - 정수타입의 변수 두개
 * 	연산기능 - 사칙연산인 경우 각각의 연산 수행 가능한 기능의 4개의 메소드
 * 		- 연산된 결과값을 어떻게 처리 할 것인가?
 * 		1. 연산로직 직후에 바로 콘솔창에 단순 출력
 * 			- 리턴 없이 실행되는 메소드 내에서 모든 로직 처리
 * 			- 리턴 없음		
 * 			- void로 선언, return 키워드 없음
 * 		2. 이 기능을 수행 요청한 곳으로 연산값 제공?
 * 			- 메소드 호출 -> 실행하면서 연산 수행 -> 수행 한 결과를 호출한 곳으로 반환(return)
 * 			- 호출한 곳으로 결과값 반환 즉 리턴값 있음
 * 			- return 값에 따른 타입으로 선언, return 키워드 필수
 * 
 * 		메소드 문법
 * 		반환타입 메소드명(주는값 받는 영역){
 * 			기능 구현부
 * 		}
 * 
 * 4. 예시를 기반으로 한 구현
 * 	1. 더하기 메소드
 * 		- 수행시에 두개의 숫자값 받음 -> + 수행 -> 결과값 반환
 * 
 * 		정수 더하기(값1, 값2){
 * 			값1 + 값2
 * 			return 값1 + 값2 결과값
 * 		}
 * 
 * 
 * 
 * 
 * 5. 문법 정리
 * 	1. 변수
 * 		타입 변수명;
 * 		타입 변수명 = 값;
 * 
 * 2. 메소드
 * 		(arguments) = 메소드 수행시에 필요한 데이터를 유입시키는 영역
 * 					- parameter / 인수 / 인자 / 매개변수
 * 
 * 		void 메소드(타입 변수명1, ...){
 * 			[logic]
 * 		}
 * 
 *  	리턴되는데이터타입 메소드(타입 변수명1, ...){
 * 			[logic]
 * 			return 값;
 * 		}
 */

package step01.basic;

public class L01Variable {
	
	//step02 - 두개의 정수값을 받아서 더한 수에 호출한 곳으로 값 되돌려주기(return)
	/* 리턴타입 메소드명(주는값을 받는 영역){
	 * 	받은 값으로 다양한 처리 기능 구현부
	 * 	리턴 타입이 있는 경우 return 필수
	 * }
	 */
	// 결과값 반환 - int(정수)
	int sum(int v1, int v2) {
		return v1 + v2; // 정수 더하기 정수는 정수
	}
	
	// 결과값 없음
	void sum2(int v1, int v2) {
		System.out.println(v1 + v2);
	}
	
	// 나누기 메소드
	// 두개의 정수값 받아서 나누기 - 정수라 하더라도 실수값이 결과일 수 도 있음
	// 혹시 반환해야 한다면 실수도 수용
	// java에서의 실수 - double(정수, 실수 모든 타입 다 허용)
	double div(int v1, int v2) {
		return v1 / v2;
	}
	//? 반환(void, return무)없이 출력하는 메소드 : div2
	void div2(int v1, int v2) {
		System.out.println(v1 / v2);
	}
	
	//? 김혜경 문자열(String)을 반환하는 getName() 메소드 구현(개발)
	String getName() {
		return "김혜경";
	}
	
	//?30(int) 이라는 값을 반환하는 getAge() 구현하기
	int getAge() {
		return 30;
	}
	
	//? 3.5라는 실수를 반환하는 getPay() 구현
	double getPay() {
		return 3.5;
	}
	
	
	
	
	
	
	
	//step01 - 변수 문법 학습
	//타입 변수명 [= 값];   -대괄호 생략가능
	public static void main(String[] args) {
		//이름 (문자열, String) 저장 가능한 변수
		String name = "김은혁";
		//나이 저장 가능한 변수
		int age = 20;
		
		System.out.println(name);  
		//syso 컨트롤+스페이스 하면 System.out.println(); 나옴
		System.out.println(age);
		System.out.println(name + age);
	}

}
