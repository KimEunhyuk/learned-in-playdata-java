/* list �ڷᱸ�� API
 * 1. Object[] �迭�� ����
 * 2. index�� ����
 * 3. �迭���� ������ 
 * 		- class�� ����� ����
 * 		- �����͵��� �޼ҵ�� Ȱ��
 * 		- �迭�� �ѹ� ������ ũ�Ⱑ ���� �Ұ�
 * 		- list�� �������� �޸� ũ�� ����
 * 4. Ư¡ - ��ü Ÿ�Ե鸸 ���� ����
 * 	- ���� 3�̶�� ���ڰ��� �����ϰ� ���� ��� �ذ�å
 * 		- �⺻������ ��üó�� ǥ�������ϰ� ���ִ� 8���� ����� Ŭ������ ����
 * 		- int : Integer(Ŭ����, ���� Ÿ��) / byte : Byte (Ŭ����, ���� Ÿ��)��
 * 		- wrapper class�� ����(8����)
 * 			- �⺻ Ÿ���� ��üó�� ��� �����ϰ� support���ִ� Ŭ����
 * 5. �ֿ� API
 * 	1. ����/Ȱ��(��ȯ)/����
 * 		- add(Object)/get(int)/remove(int)
 * 	2. ����� ������ ���� Ȯ��
 * 		- size()
 * 
 * 6. �ٸ� ���������� list
 * 	- �ӵ� ����
 * 		������ ������ �޸� ���� / ������ ������ ������ ������ ������ re index
 * 		- ���� �ӵ� ���鿡���� �迭���� ��.��.��
 * 
 * - Ȥ�� �ټ��� �����͵��� �ǽð� ���� �����ÿ��� �迭���� �����ϳ�
 * 		�����ϴ� �����Ͱ� �迭 �߰��� ���ԵǾ� �ִٸ� ����
 * 		�����ϴ� �����͵��� ������ �κп� ����Ǿ��ִٸ� �����ϼ�����
 *  */
package step01.test;

import java.util.ArrayList;

import javax.print.event.PrintServiceAttributeListener;

import model.domain.CustomerDTO;

public class ListTest {
	
	//ù��° ���� ���� 
//		- ��ü Ÿ���� ��� ������ ��� �� ����
	public static void m() {
		//������ ���� ������ �޸� ����
		ArrayList al = new ArrayList();//10���� �޸� ������ ������ ��ü ����
		
		//�����͸� 2�� ���� - String, Integer Ÿ���� ���� ������ ���� / �� Object Ÿ��
		//public boolean add(Object o){parameter�� ���Ե� �����͸� ArrayList�� ����}
		al.add("���ڿ�"); //0��°�� ����
		al.add(new Integer(3)); //index1�� ����
		//al.add(3); �����Ͻ� al.add(new Integer(3))���� �ڵ� ���� 
		al.add("���ڿ�2");
		al.add(new Integer(3));
		
		//����� ������ ���� Ȯ�� - �޸� ���� Ȯ���� �ƴ�
		System.out.println(al.size());
		
		//��� ������ �ܼ� ���
		System.out.println(al);
		//al.toString() ������ : ������ ��� �����Ͱ� �ϳ��� ���ڿ��� ��ȯ
		
		//index 2��°�� ���ڿ�2������ size()ȣ��
		al.remove(2);
		System.out.println(al); //[���ڿ�, 3, 3]
		System.out.println(al.size());// 3
	}
	
	//����(add) Ȱ��(get)
	/* 
	 * public boolean add(Object o){}
	 * public Object remove(int index){}
	 * public ? get(?){ �ش� index�� ����Ǿ� �ִ� ������ ��ȯ}
	 * public Object get(int index)
	 */
	public static void m2() {
		ArrayList al = new ArrayList();
		al.add("1");
		al.add("2");
		al.add("3");
		al.add("4");
		System.out.println(al.get(2)); //3
		al.remove(2); //�ش� index ���� �ϸ鼭 �ڿ� ����Ǿ��ִ� �����͵� index ������
		System.out.println(al.get(2)); //4 
		}
	
	
	public static void m3() {
		//�ʱ� �����Ǵ� �޸� ���� + ����ġ �޸� ����
		ArrayList al = new ArrayList(5); //5���� �޸� ���� �ǹ� / () 10���� �޸� ���� �ǹ� / ���� �޸� 
		al.add("1qwwweeee");
		al.add("2");
		al.add("3");
		al.add("4");
		al.add("5");
		System.out.println(al.size());  //5  
		
		//5�� �̻��� �޸𸮸� �ʿ�� �� ��� 6��° ������ ����� �޸𸮸� 5���� ����
		al.add("6");
		System.out.println(al.size());  //6
		al.add("7");
		al.add("8");
		System.out.println(al.size());  //8
		
		String s = (String)al.get(0);
		System.out.println(s.charAt(0));//String �޼ҵ� ȣ���� ���� ����ȯ �ʼ�
		
		System.out.println(al.size());
	}

	
	
	
	
	//�ι�° Ÿ���� ������ �� �ִ� jdk1.5���� ���õ� ���׷�(���׸�) ����
	//���� ���߽ÿ��� �ڷᱸ�� API�� ������ �����ÿ� ��κ� ������ ������ ����
	public static void m4() {
		//String�� ���� ������ ���� �迭 ���� ����
		//String[] Ÿ������ ���� ��, �޸� ũ�� ���Ѿ���
		ArrayList<String> al = new ArrayList<String>();
		al.add("1");
		al.add("2");
		al.add("3");
		String s = al.get(0);
		String d = al.get(2);
		String f = al.get(1);
		System.out.println(s.charAt(0));
		System.out.println(d.charAt(0));
		System.out.println(f.charAt(0));
		
	}
	
	/*
	 * ������ ��� ������ ������ ȭ�鿡 ����� ���� db�κ��� select -> CustomerDTO ��ü�� ����
	 *  -> ArrayList�� ���� -> ��ȯ
	 */
	public static ArrayList<CustomerDTO> getCustomers(){
		ArrayList<CustomerDTO> all = new ArrayList<CustomerDTO>();//10���޸𸮻���
		
		all.add(new CustomerDTO("u1", 11)); //0��° ����
		all.add(new CustomerDTO("u2", 22)); //1��° ����
		
		return all;
	}
	
//public static ArrayList nonGetCustomers(){
//		
//		ArrayList all = new ArrayList();//10�� �޸� ����
//		
//		all.add(new CustomerDTO("u1", 11));  //0��° ����
//		all.add(new CustomerDTO("u2", 22));  //1��° ����
//		
//		return all;
//	}
	
	
	
		
	public static void main(String[] args) {
		
//		System.out.println("*** non-���׸� ***");
//		ArrayList a = nonGetCustomers();
//		/* a.get(1)
//		 * 	a - ArrayList
//		 * 	a.get(1) - Object
//		 *  a.get(1).getId() - ���� �� Object Ŭ�������� getId() �޼ҵ� �� ���� ����
//		 *  �ذ�å 
//		 */
//		
//		System.out.println( ( (CustomerDTO)a.get(1) )  .getId() ); //u2
		
		
		ArrayList<CustomerDTO> all = getCustomers();
		//? u2�� ����� �ּ���
		/*
		 * all.get(1)
		 * all - ArrayList<CustomerDTO>
		 * all.get(1)  - customerDTO(id�� pw �ΰ��� �����͸� �����ϰ� �ִ� ��ü)
		 * all.get(1).getId() - String
		 */
		
		System.out.println("*** ���׸� ��� ***");
		System.out.println(all.get(1).getId());		
		
		//m();
		//m2();
		//m3();
		//m4();
	}

}