/*
 * ArrayList�� ���� ������ �����͵� Ÿ�� 
 * 		- ��ü Ÿ�� ��δ� ���
 * 		- java.lang.Object ���� Ÿ�Ե� �� ���� ����
 * 		- java.util.ArrayList�� ����(��ü,class) Ÿ��
 * 		- ArrayList �� ArrayList ���� ����
 * 
 * 	����
 * 		- �μ����� ArrayList�� ����
 * 			: �μ��� 10����� 10���� ArrayList
 * 		- ��� ������ ������ ArrayList�� ����
 * 			: �ϳ��� ArrayList�� 10���� �μ��� ArrayList ����
 */

package step01.test;

import java.util.ArrayList;

import model.domain.Employee;

public class ReviewTest {
	
	/*
	 * ? Employee ��ü 3���� ������ ArrayList�� ArrayList�� ����
	 */
	
	
	static void m1() {
		//Employee�� emps�̶�� �̸����� ��ü ����
		ArrayList<Employee> emps = new ArrayList<Employee>(); 
//		ArrayList<ArrayList> all = new ArrayList<ArrayList>();
		//���ϳ��� ArrayList all�� �����ϰ� Employee�� ���ϰ� ��
		ArrayList<ArrayList<Employee>> all = new ArrayList<ArrayList<Employee>>();
		//3���� Employee ���� ����
		emps.add(new Employee("11", "emp01", 10));
		emps.add(new Employee("22", "emp02", 20));	//1��° ����
		emps.add(new Employee("33", "emp03", 10));
		//all�� emps����
		all.add(emps);
// 		all[(emps, emps, emps)] �̷�����? 
		
		//? 1��° ����� ���� ���� ���
//		System.out.println(all.get(0).get(1)); �����Ѱ�
//		all�� 0��°�� 1��°
		ArrayList<Employee> v1 = all.get(0);
		Employee v2 = v1.get(1);
		System.out.println(v2);
		
		v2.setDeptno(200);
		System.out.println(all.get(0).get(1).getDeptno());
	}

	static void m2() {
		ArrayList<Employee> emps = new ArrayList<Employee>(); 
		ArrayList<ArrayList<Employee>> all = new ArrayList<ArrayList<Employee>>();
		
		emps.add(new Employee("11", "emp01", 10));
		emps.add(new Employee("22", "emp02", 20));
		emps.add(new Employee("33", "emp03", 10));
		
		all.add(emps);
		
		all.get(0).get(1).setDeptno(200);
		System.out.println(all.get(0).get(1).getDeptno());
		
		//? emp03 -> smith�� ������ ����� ����
		all.get(0).get(2).setEname("smith");
		System.out.println(all.get(0).get(2).getEname());
	}
	
	public static void main(String[] args) {
		m1();
		m2();
		/*
		 * System : class
		 * out :
		 * 	����? ����.
		 * � Ŭ���� ���� ����? System���� static���� ����� ����
		 * println() :
		 * 	� Ŭ������ �ִ� �޼ҵ��ϱ��?
		 * 	out.println() �� out ���� Ÿ���� PrintStream Ŭ�������� �����ϴ� �޼ҵ�
		 */
		System.out.println(1);
	}

}
