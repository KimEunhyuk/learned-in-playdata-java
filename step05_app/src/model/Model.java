package model;

public class Model {

	public static CustomerDTO[] getCustomers() {
		
		//���� ���� (�̸�, ����, ����, ����)
		CustomerDTO[] fruits = {new CustomerDTO("���", 3000, "red", 'g'),
								new CustomerDTO("�ٳ���", 2500, "yellow", 'g'),
								new CustomerDTO("����", 6000, "red", 'b'),
								new CustomerDTO("���", 4500, "green", 'g'),
								new CustomerDTO("����", 2000, "green", 'b'),
								new CustomerDTO("����", 2000, "yellow", 'g'),
								new CustomerDTO("����", 4000, "yellow", 'b')};
		
		//��ȯ
		return fruits;
	}
}
