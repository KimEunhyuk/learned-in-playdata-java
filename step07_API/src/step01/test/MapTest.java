/*
 * �н����� : Map
 * 1. ������ ������(key)�� ��(value) ���� �� Ȱ���ϴ� ����
 * 2. ��ü Ÿ�Ը� Ȱ��
 * 3. key�� �ߺ� ����/value �ߺ� ����
 */

package step01.test;

import java.util.ArrayList;
import java.util.HashMap;

import model.domain.Employee;

public class MapTest {

	public static void main(String[] args) {
		HashMap<String, String> maps = new HashMap<String, String>();
		maps.put("a", "���缮");	//����
		maps.put("b", "������");	//����
//		maps.put("a", "������");	//���� �� a��� key�� �̹� �����ϴ� ��ü�� ���� �� ����
		maps.put("c", "������");
		//�����ǵ� toString() ��ȯ�� �ܼ� ���
		System.out.println(maps);	//{a=������, b=������}
		
		//������ key�� ������ �ϳ� �̾Ƽ� ���
		String v = maps.get("a");
		System.out.println(v); //���缮
		
		HashMap<String, Employee> maps2 = new HashMap<String, Employee>();
		maps2.put("11", new Employee("11", "smith", 10));
		maps2.put("22", new Employee("22", "master", 10));
		System.out.println("********************map2");
		System.out.println(maps2);
		
		//? smith �̸��� ����� ����
		System.out.println(maps2.get("11").getEname()); //�������� smith
		
		/*
		 * �μ����� ���� ����(ArrayList) => �μ��� �����ڷ� ��� �������� ����(HashMap)
		 */
		System.out.println("*** Map�� list ���� �� Ȱ�� ***");
		
		ArrayList<Employee> emps = new ArrayList<Employee>();
		//3���� Employee ���� ����
		emps.add(new Employee("11", "emp01", 10));
		emps.add(new Employee("22", "emp02", 10));	//1��° ����
		emps.add(new Employee("33", "emp03", 10));
		
		HashMap<String, ArrayList<Employee>> all = new HashMap<String, ArrayList<Employee>>();
		all.put("�ѹ���", emps);
		//emp03�̶�� ������ �̸� ���
		System.out.println(all.get("�ѹ���").get(2).getEname()); //�ƴ� emp03
		
		//? emp02 -> ������ ���� ���� -> ���(Ȯ��)
		all.get("�ѹ���").get(1).setEname("������");
		System.out.println(all.get("�ѹ���").get(1).getEname()); //���� ������
		System.out.println(all); //{�ѹ���=[Employee [empno=11, ename=emp01, deptno=10], Employee [empno=22, ename=������, deptno=10], Employee [empno=33, ename=emp03, deptno=10]]}
	}

}
