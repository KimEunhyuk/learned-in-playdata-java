package step01;

public class Parent extends Object{
	String name;	//����Ÿ��
	int age;		//�⺻Ÿ��
	
	public Parent() {
		super();
		System.out.println("�θ�");
		
	}
	
	void printAll() {
		System.out.println(name);	//����Ÿ�� name.toString()
		System.out.println(age);
		
	}
}
