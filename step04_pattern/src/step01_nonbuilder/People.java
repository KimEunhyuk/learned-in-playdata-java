// toString!!

package step01_nonbuilder;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class People {
	private String name;
	private int age;
	
	// �⺻������ - argument�� ���� ������ �ǹ�
	// �����ڰ� ���� ��� �����Ϸ��� �������ִ� ������
	public People() {
	}
	
	//������ - ��ü ������ ����ڰ� �����ϰ��� �ϴ� ������ ��ü ����
	public People(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//��ӽÿ� �߰� �н�
	/* java �� ��� Ŭ������ �ֻ��� root ���� = java.lang.Object
	 * - ������ �޼ҵ�� ���Ŭ������ ��ӹ޾� �����ϰ� �ִ� ��Ȳ
	 * - toString() �޼ҵ常 ����
	 * 		- Object�� toStrin() ��� - ������ ��ü����@��ġ���� ���ڿ��� ��ȯ
	 * - ��, �ڽ� Ŭ�������� 
	 * : �޼ҵ� ������(overiding, overide) 
	 * �޼ҵ� ��� ����
	 */
	public String toString() {
		return name + " - " + age; // �ϳ��� String���� ���յǾ� ��ȯ
	}
	
	//���� ������ ��½ÿ� toString() �ڵ� ȣ�� �� toString() ��ȯ���� ���
	public static void main(String[] args) {
		//? parameter�� �ִ� ������ ȣ���ϼż� ���缮, 45 ����
		People p1 = new People();
		p1.setName("���缮");
		p1.setAge(45);
		
		People p2 = new People("���缮", 45);
		System.out.println(p2);	//step01.People@123a439b
		System.out.println(p2.toString());	//step01.People@123a439b
		System.out.println(p2);// ���缮 -45

		
	}
}