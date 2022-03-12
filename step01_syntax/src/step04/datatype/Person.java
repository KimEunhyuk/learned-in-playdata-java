//사람 정보를 보유 및 수정 즉 사람 데이터 전담 클래스

/*this - 로컬 변수와 멤버 변수명이 동일한 경우에 멤버 변수를 지정하게 되는 키워드
*자기자신의 객체를 참조하는 특별한 키워드
*/

package step04.datatype;

public class Person {
	String name;
	int age;
	
	public Person() {		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}	
}
