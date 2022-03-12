package model;

import lombok.Setter;

@Setter
public class Model {
	//controller�� ��û���� �Ѹ��� ������ db�� ���� �˻��ؼ�
	//CustomerDTO �����ؼ� ��ȯ
	
	//CustomerDTO�� ��ȯŸ���� getCustomer() �޼ҵ� ����
	public static CustomerDTO getCustomer() { //Controller�� �帱�Կ� ��񸸿�
		//? ��ü ����
		//? setXxx() �޼ҵ�� id�� encore/pw=11/grade=g
		//? ��ȯ
		
		// ����(��ü)Ÿ�� ����
		CustomerDTO c = new CustomerDTO();
		
		//Id�� encore, Pw�� 11, Grade�� g�� ��.
		c.setId("encore");
		c.setPw(11);
		c.setGrade('g');
		
		//��ȯ
		return c; //�̰� encore, 11, g �޾ư�����
	}
	
	// ������ ��� ��ȯ
	public static CustomerDTO[] getCustomers() {
		
		CustomerDTO[] c = {	new CustomerDTO("id1", 11, 'g', "����"),
							new CustomerDTO("id2", 22, 's', "��ȹ")};
		
		
		
		return c;
	}
	
	//..CRUD
}
