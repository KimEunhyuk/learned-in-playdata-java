package step02;

class Parent extends Object{
	
	String name;	
	int age;		
	
	Parent(){
		super();
	}
	
	void printAll() {
		System.out.println(name.toString());
		System.out.println(age);
	}
	
}
public class Child extends Parent{
	String job;
	
	public Child() {
		super();
	}
	void printAll() {
		super.printAll();
//			System.out.println(job.toString());
		System.out.println(job);
	}


	public static void main(String[] args) {
		/* ��ü ������ �������� � Ŭ���� ���� ������? Parent����
		 * p.��������� �޼ҵ� ���� �����? �ڽ� Ŭ���� ���� ����
		 * �� printAll() ���� ��������ε� �����ǵ� �ڽ� �޼ҵ� ȣ��
		 * 
		 * ��� : �������� �θ� Ŭ������ ���� ������ ������ ���� ������ �ڽ� Ŭ���� ���� ����
		 */
		
		Parent p = new Child(); //������, ��� ���� ���� ������ ����
		
		
		
		p.name = "�̻�";
		p.age = 90;
		p.printAll(); //�����ǵ� �ڽ� �޼ҵ� ȣ��
		
		//�ڽĸ��� ��� ������ �θ�Ÿ�� ������ ȣ�� �õ�
		//�ذ�å : ����ȯ ���� - �θ�Ÿ���� �ڽ�Ÿ������ ��ȯ
		//����ȯ ���� - ����Ÿ�Ժ��� = (����Ÿ��)����Ÿ��;
//		p.job = "IT"; ����
		
		Child c = (Child)p;
		c.job = "IT";
		c.printAll();
		
		System.out.println("--------");
		p.printAll();
		
		c.name = "�����";
		System.out.println(p.name);
		p.name = "�̿���";
		System.out.println(c.name);
		
		System.out.println("===========");
	}

}
