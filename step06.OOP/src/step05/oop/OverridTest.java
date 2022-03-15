/*
 * �����Ϳ�(domain)
 * 	- Data Transfer Object(DTO)/Value Object(VO)
 * 	- �⺻ ���� : �������/�⺻������/������/gettet/setter/toString()������
 * 		������ ���� �޼ҵ� 
 * 			- ��ü�� ������ ��(������ ��� ��� ������ �� ��) ����� �޼ҵ�
 * 			- public boolean equals(Object o){}
 * 				: javaa.lang.Object�� �޼ҵ� ���
 * 					- ������ ��ü�� �ּҰ� ��
 * 					- == (����� ������)
 * 						- ����Ÿ�� �񱳽� : �����ڰ� ��ü�� �ּҰ� �� ������
 * 						- �⺻Ÿ�� �񱳽� : �� ��
 * 	- ������ rule
 * 		-��ȯŸ�� �޼ҵ��(argument) : 100% ����
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
	// �����ڵ�, getter/setter�� �ִ� ����
	
	//Person ��ü���� ���밪(�����Ͱ�) �� �޼ҵ�� ������
	/*
	 * Person Ÿ�� ���� Ȯ��
	 * Person Ÿ���� �ƴϴ� : false
	 * Person Ÿ���̴�?
	 * 	- name(String)�� age(int)�� ��
	 *  	name�� age�� ����			: true
	 *  	name�� ������ age�� �ٸ��� 	: false
	 *  	name�� �ٸ��� age�� ���� 	: false
	 *  
	 *  	-name�� String�� equals()
	 *  	-age�� == ����� ������
	 *  
	 *  && : ���ǽ�1&&���ǽ�2
	 *  	- �ΰ��� ���ǽ� ��� true�� ��쿡�� true
	 *  	- ���ǽ�1 false�� ��� ���ǽ�2�� ���� ����
	 *  		- ���� �����ڶ�� �� 
	 *  		- and ������
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
 * A a = new C(); // Object -> A -> C ��ü ������ ����
 * ����
 *  a ���� Ÿ��? AŸ��
 *  a ������ Ȱ�� ������ ��ü - C > A > Object
 */

class A{}
class B extends A{}
class C extends A{}

public class OverridTest {
	
	
	public static void m1() {
		//String�� ��
		String s1 = "a";	// ��ü ����
//		String s2 = "a";
		String s2 = new String("a"); // ���ο� ��ü ����
		String s3 = "a";	// �̹� new ���� ������ ���ڿ� ��ü�� ������ �����Ͱ����� ������ ��� ����
		String s4 = new String("a"); // ���ο� ��ü ����	
		
		System.out.println("m1");
//		System.out.println(s1 == s2); //�ּҰ� �� true 
		System.out.println(s1 == s2); //false new�� �Ἥ �ּҰ� �޶���. ���ο� ��ü��
		//String Ŭ������ �������� �޼ҵ� ȣ�� �� String Ÿ�Ե� ��ü���� ���밪 ��
		System.out.println(s1.equals(s2)); // ��ü�� ������ ���밪 �� true
		System.out.println(s1 == s3); //true
		System.out.println(s1.equals(s2));	//true
	}
	/*
	 * instanceof
	 * 	- ��ü Ÿ�� �� ������
	 *  - ��� ���踦 �������� ����
	 *  	- ����Ÿ�� ������ ������ ��ü���� ����Ÿ���� ��ӹ޴� ��� Ŭ���� Ÿ�԰� �� ����
	 *  - ����
	 *  	�������� instanceof ��Ÿ��
	 */
	public static void m2() {
		System.out.println("m2");
		A a1 = new B();	//B > A > Object
		A a2 = new C();
		System.out.println(a1 instanceof A);		//true
		System.out.println(a1 instanceof B);		//true
		System.out.println(a1 instanceof C);		//false
		System.out.println(a1 instanceof Object);	//true
		System.out.println(a2 instanceof B);		//false ���� �񱳴°���
		
		B b1 = new B();
		System.out.println(b1 instanceof Object);	//true
		System.out.println(b1 instanceof A);		//true
		System.out.println(b1 instanceof B);		//true
		
		//�������� ���� ���迡�� instanceof ������ ��� �Ұ�
//		System.out.println(b1 instanceof C);		//���� ����
		
	}
	
	public static void main(String[] args) {
//		m2();
		//? Person ��ü�� �����ؼ� �������� equals()�� ��ü�� ���밪 ���� ����
		Person p1 = new Person("����", 11);
		Person p2 = new Person("����", 12);
		Person p3 = new Person("����", 12);
		Person p4 = new Person("����", 11);
		
		System.out.println(p1.equals(p2));	//false
		System.out.println(p2.equals(p3));	//true
		System.out.println(p2.equals(p4));	//false
		System.out.println(p1.equals(p4));	//false
		System.out.println(p1.equals("an"));//false
	}
}


