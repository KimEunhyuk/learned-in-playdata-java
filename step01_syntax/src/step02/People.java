package step02;

public class People {
	//���� - ���� ��� �����ϰ� �޸𸮿� �����Ǵ� ����? ��ü ���� 
	String name;
	int age;
	
	//������
	People(){}
	
	//�޼ҵ� - ����ϴ� �������� ����
	//name������ ���� �Ǵ� �����ϴ� �޼ҵ�
	String getName() {
		return name;	//ȣ��
	}
	void setName(String newName) {	//����
		name = newName;		//���ȣ�� = ���ú���ȣ��	
	}
	
	int getAge() {
		return age;	//ȣ��
	}
	void setAge(int newAge) {	//����
		age = newAge;	//���ȣ�� = ���ú���ȣ��
	}
	
	public static void main(String[] args) {	//����
		//��ü ���� - name.age �޸� ���� �ϸ鼭 People�������� ����
		//�� �ּҰ����� ������ Ȱ��, �� �ּҰ��� �ƴ� p1���������� �ڵ�󿡼� ���
		People p1 = new People();	//����
		System.out.println(p1.name);	
		
		//���� ȣ��� �� ���� �� Ȯ��
		p1.name = "���缮";
		System.out.println(p1.name);	
		
		//�޼ҵ� ȣ��� �� ���� �� Ȯ��
		p1.setName("������");				
		System.out.println(p1.getName()); // -name�� �Ǵµ�?
		
	}

}
