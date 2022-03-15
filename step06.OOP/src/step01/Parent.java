package step01;

public class Parent extends Object{
	String name;	//참조타입
	int age;		//기본타입
	
	public Parent() {
		super();
		System.out.println("부모");
		
	}
	
	void printAll() {
		System.out.println(name);	//참조타입 name.toString()
		System.out.println(age);
		
	}
}
