package step01.test;

import java.util.ArrayList;

import exception.IdInvalidateException;
import model.domain.Employee;
	

public class ListTest2 {
	//객체 생성해야만 사용 가능한 변수로 선언시에는 static{}내부에선 호출 불가
	// static 붙여서 오류 수정
	private static ArrayList<Employee> al = new ArrayList<>();
						//마우스 대보면<>로 해도 Employee있는거처럼 인식
	
	//객체 생성 시점과 무관하게 ListTest2.class가 로딩시에 자동 실행
	//
	static {
		al.add(new Employee("11", "smith", 20));	//0번째 저장
		al.add(new Employee("22", "master", 20));	//1번째 저장
	}
	
	//create() - Employee 객체들 ArrayList 저장 
//	public static void create() {
//		al.add(new Employee("33", "tester", 30));
//	}
//	
//	public static void create(String empno, String ename, int deptno) {
//		al.add(new Employee(empno, ename, deptno));
//	}
		
	
	//객체를 제대로 활용하는 코드, 객체지향스럽다!!!
	/*
	 * 로직 구현시 고려 사항
	 * 경우의수1 - 없는 id 즉 정상 저장 가능
	 * 경우의수2 - 있는 id 즉 중복인 경우 사용자정의(개발자들이 개발한 exception 클래스로 예외 상황 처리
	 * IdinvalidateException
	 */
	
//	public static void create(Employee newEmp){
//		al.add(newEmp);
//	}
	
	//? 논리적으로 미 존재하는 사번인 경우에만 add 할수 있게 코드 재구성
	public static void create(Employee newEmp) throws IdInvalidateException {
		//3명이라 가정 - 중복된 id는 index 2 즉 3번째 존재
		for(Employee e : al) {
			if(e.getEmpno().equals (newEmp.getEmpno() )) {	//AL에 이미 존재할 경우 예외 발생
				throw new IdInvalidateException("사번이 중복되었습니다");// 메소드 자체가 종료 
			}
//			else {	//AL에 미 존재할 경우 저장
//				al.add(newEmp);
				
		}
		//이 라인이 실행되는 경우에는 AL에 중복된 사번이 미 존재할 경우에만 실행
		//for를 계속 돌리게 add를 반복문 밖에 놓음. 리턴되더라도 else가 진행되지 않게
		al.add(newEmp);
	}
		
	
	//read() - empno 사번으로 한명의 사번 검색
	//객체 타입의 기본값은 null
	/*
	 * ArrayList의 모든 객체들의 사번을 비교 (조건식, 직원이 여러명..반복?)
	 * 경우의수 1 -> 동일한 경우 Employee 객체 반환
	 * 경우의수 2 -> 검색 요청한 사번 정보 없음, null 반환
	 * 
	 * String 클래스에 boolean equals(Object o){String 객체값 비교해서 반환}
	 */
	public static Employee read(String empno){
		
//		Employee emp = null; // 로컬 변수들은 선언시 기본값으로 초기화 권장
		/*
		 * e.getEmpno().equals(empno)
		 * e - Employee
		 * e.gtEmpno() - String
		 * 		public String getEmpno(){}
		 * e.getEmpno().equals(..) - boolean
		 * 		public boolean equals(Object anObject){}
		 */
		
		
		for(Employee e : al) {
			if(e.getEmpno().equals(empno)) {	//if(true) of if(false)
				return e; //return 키워드는 메소드를 종료하는 기능 포함
			}
			
		}
		
//		return emp ; //return e; 생겨서 필요없음 Employee emp = null; 도
		return null; // false일시 return
		//if 문장 모두다 false인 경우에도 반환은 필수이기 때문에 필요한 코드
	}
	
	//update() - 한명의 사원의 부서번호 갱신
	/*
	 * 필요 데이터 - 사번과 수정하고자 하는 갱신된 부서 번호
	 * 실행시 발생 가능한 경우의 수
	 * 	경우의수1 - 없는 사원번호?
	 * 	경우의수2 - 없는 부서번호?
	 * 		- 사번도 없고, 부서 번호도 없음?
	 * 		- 사번은 있고, 부서 번호 없음?
	 * 	...
	 */
	
	public static boolean update(String empno, int newDept){
		for(Employee e : al) {
			if(e.getEmpno().equals(empno)) {
				e.setDeptno(newDept);
				return true;
			}
		}
		
		return false;
	}
	
	//delete() - 존재하는 한명의 사원 삭제
	//remove() - AL 내부에 사번에 해당하는 사원을 삭제
	/*
	 * 존재할 경우 해당 사원이 저장된 AL의 index 값으로 remove()
	 * index 필요
	 * forEach 반복문이 아닌 정통 반복문 사용
	 * 	- 정통 반복문은 index값을 실시간 확인 가능하게 해줄수있음 
	 * 
	 */
	public static boolean delete(String empno) {
		for(int index=0; index < al.size(); index++) {
//			Employee e = al.get(index);
//				
//			if(e.getEmpno().equals(empno)) {
			
			if(al.get(index).getEmpno().equals(empno)) {
				al.remove(index);	//해당 index에 저장된 객체 삭제
				return true;
			}
		}
		return false;	
	}
	
	
	public static void main(String[] args) {
		System.out.println("*** 1. 새로운 직원 입사 ***");
		
		//미 존재하는 사원 저장 시도 , 존재하는 사원 저장 시도
		try {
		
			create(new Employee("55", "playman", 60));
			System.out.println("정상 저장");
			
			create(new Employee("55", "playman", 60));
			
		
		}
		catch(IdInvalidateException e){
			System.out.println(e.getMessage());
		}
		
		
		
		System.out.println("*** 2. 모든 직원 검색 ***");
		System.out.println(al); //al.toString()
		
		System.out.println("*** 3. 한명의 사원 검색 ***");
//		Employee e = read("11");
//		System.out.println(e);
//		//System.out.println(read("11")); 이거도 가능
//		System.out.println("없는 사원");
//		e = read("66");
//		System.out.println(e);//null
//		//null 키워드는 절대 서비스시에 end user(사용자)에게 오픈 불가
		
		Employee e = read("11");
		if(e != null) {
		System.out.println(e);
		}else {
			System.out.println("해당 사번의 사원은 미 존재");
		}
		e = read("66");
		if(e != null) {
		System.out.println(e);//null
		}
		else {
			System.out.println("해당 사번의 사원은 미 존재");
		}
		
		
		
		
		
		System.out.println("**** 4. 부서 번호 수정 ***");
		//boolean e1 = update("55", 66); 내가했던거
		update("55", 66);
		System.out.println(al);
		
		
		
		System.out.println("**** 5. 사원 삭제 후 검색 ***");
		//boolean e2 = delete("55"); 내가했던거
		//delete("55");
		//System.out.println(al);
		boolean result = delete("55"); 
		if(result) {
			System.out.println("퇴사");
		}else {
			System.out.println("미존재 사원입니다");
		}
		System.out.println(al);
		
		result = delete("22");
		if(result) {
			System.out.println("퇴사");
		}else {
			System.out.println("미존재 사원입니다");
		}
		System.out.println(al);	
		
		
		}
}
