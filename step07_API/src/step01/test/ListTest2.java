package step01.test;

import java.util.ArrayList;

import exception.IdInvalidateException;
import model.domain.Employee;
	

public class ListTest2 {
	//��ü �����ؾ߸� ��� ������ ������ ����ÿ��� static{}���ο��� ȣ�� �Ұ�
	// static �ٿ��� ���� ����
	private static ArrayList<Employee> al = new ArrayList<>();
						//���콺 �뺸��<>�� �ص� Employee�ִ°�ó�� �ν�
	
	//��ü ���� ������ �����ϰ� ListTest2.class�� �ε��ÿ� �ڵ� ����
	//
	static {
		al.add(new Employee("11", "smith", 20));	//0��° ����
		al.add(new Employee("22", "master", 20));	//1��° ����
	}
	
	//create() - Employee ��ü�� ArrayList ���� 
//	public static void create() {
//		al.add(new Employee("33", "tester", 30));
//	}
//	
//	public static void create(String empno, String ename, int deptno) {
//		al.add(new Employee(empno, ename, deptno));
//	}
		
	
	//��ü�� ����� Ȱ���ϴ� �ڵ�, ��ü���⽺����!!!
	/*
	 * ���� ������ ��� ����
	 * ����Ǽ�1 - ���� id �� ���� ���� ����
	 * ����Ǽ�2 - �ִ� id �� �ߺ��� ��� ���������(�����ڵ��� ������ exception Ŭ������ ���� ��Ȳ ó��
	 * IdinvalidateException
	 */
	
//	public static void create(Employee newEmp){
//		al.add(newEmp);
//	}
	
	//? �������� �� �����ϴ� ����� ��쿡�� add �Ҽ� �ְ� �ڵ� �籸��
	public static void create(Employee newEmp) throws IdInvalidateException {
		//3���̶� ���� - �ߺ��� id�� index 2 �� 3��° ����
		for(Employee e : al) {
			if(e.getEmpno().equals (newEmp.getEmpno() )) {	//AL�� �̹� ������ ��� ���� �߻�
				throw new IdInvalidateException("����� �ߺ��Ǿ����ϴ�");// �޼ҵ� ��ü�� ���� 
			}
//			else {	//AL�� �� ������ ��� ����
//				al.add(newEmp);
				
		}
		//�� ������ ����Ǵ� ��쿡�� AL�� �ߺ��� ����� �� ������ ��쿡�� ����
		//for�� ��� ������ add�� �ݺ��� �ۿ� ����. ���ϵǴ��� else�� ������� �ʰ�
		al.add(newEmp);
	}
		
	
	//read() - empno ������� �Ѹ��� ��� �˻�
	//��ü Ÿ���� �⺻���� null
	/*
	 * ArrayList�� ��� ��ü���� ����� �� (���ǽ�, ������ ������..�ݺ�?)
	 * ����Ǽ� 1 -> ������ ��� Employee ��ü ��ȯ
	 * ����Ǽ� 2 -> �˻� ��û�� ��� ���� ����, null ��ȯ
	 * 
	 * String Ŭ������ boolean equals(Object o){String ��ü�� ���ؼ� ��ȯ}
	 */
	public static Employee read(String empno){
		
//		Employee emp = null; // ���� �������� ����� �⺻������ �ʱ�ȭ ����
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
				return e; //return Ű����� �޼ҵ带 �����ϴ� ��� ����
			}
			
		}
		
//		return emp ; //return e; ���ܼ� �ʿ���� Employee emp = null; ��
		return null; // false�Ͻ� return
		//if ���� ��δ� false�� ��쿡�� ��ȯ�� �ʼ��̱� ������ �ʿ��� �ڵ�
	}
	
	//update() - �Ѹ��� ����� �μ���ȣ ����
	/*
	 * �ʿ� ������ - ����� �����ϰ��� �ϴ� ���ŵ� �μ� ��ȣ
	 * ����� �߻� ������ ����� ��
	 * 	����Ǽ�1 - ���� �����ȣ?
	 * 	����Ǽ�2 - ���� �μ���ȣ?
	 * 		- ����� ����, �μ� ��ȣ�� ����?
	 * 		- ����� �ְ�, �μ� ��ȣ ����?
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
	
	//delete() - �����ϴ� �Ѹ��� ��� ����
	//remove() - AL ���ο� ����� �ش��ϴ� ����� ����
	/*
	 * ������ ��� �ش� ����� ����� AL�� index ������ remove()
	 * index �ʿ�
	 * forEach �ݺ����� �ƴ� ���� �ݺ��� ���
	 * 	- ���� �ݺ����� index���� �ǽð� Ȯ�� �����ϰ� ���ټ����� 
	 * 
	 */
	public static boolean delete(String empno) {
		for(int index=0; index < al.size(); index++) {
//			Employee e = al.get(index);
//				
//			if(e.getEmpno().equals(empno)) {
			
			if(al.get(index).getEmpno().equals(empno)) {
				al.remove(index);	//�ش� index�� ����� ��ü ����
				return true;
			}
		}
		return false;	
	}
	
	
	public static void main(String[] args) {
		System.out.println("*** 1. ���ο� ���� �Ի� ***");
		
		//�� �����ϴ� ��� ���� �õ� , �����ϴ� ��� ���� �õ�
		try {
		
			create(new Employee("55", "playman", 60));
			System.out.println("���� ����");
			
			create(new Employee("55", "playman", 60));
			
		
		}
		catch(IdInvalidateException e){
			System.out.println(e.getMessage());
		}
		
		
		
		System.out.println("*** 2. ��� ���� �˻� ***");
		System.out.println(al); //al.toString()
		
		System.out.println("*** 3. �Ѹ��� ��� �˻� ***");
//		Employee e = read("11");
//		System.out.println(e);
//		//System.out.println(read("11")); �̰ŵ� ����
//		System.out.println("���� ���");
//		e = read("66");
//		System.out.println(e);//null
//		//null Ű����� ���� ���񽺽ÿ� end user(�����)���� ���� �Ұ�
		
		Employee e = read("11");
		if(e != null) {
		System.out.println(e);
		}else {
			System.out.println("�ش� ����� ����� �� ����");
		}
		e = read("66");
		if(e != null) {
		System.out.println(e);//null
		}
		else {
			System.out.println("�ش� ����� ����� �� ����");
		}
		
		
		
		
		
		System.out.println("**** 4. �μ� ��ȣ ���� ***");
		//boolean e1 = update("55", 66); �����ߴ���
		update("55", 66);
		System.out.println(al);
		
		
		
		System.out.println("**** 5. ��� ���� �� �˻� ***");
		//boolean e2 = delete("55"); �����ߴ���
		//delete("55");
		//System.out.println(al);
		boolean result = delete("55"); 
		if(result) {
			System.out.println("���");
		}else {
			System.out.println("������ ����Դϴ�");
		}
		System.out.println(al);
		
		result = delete("22");
		if(result) {
			System.out.println("���");
		}else {
			System.out.println("������ ����Դϴ�");
		}
		System.out.println(al);	
		
		
		}
}
