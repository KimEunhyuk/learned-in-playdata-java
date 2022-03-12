package view;

import model.CustomerDTO;

public class EndView {
	
	public static void print(CustomerDTO c) { //Controller�� print �帱�Կ�
		
		System.out.println(c.getId() + " " + c.getGrade()); //�̰� ����������
		//c�� ������ Id Grade ��� �޼ҵ� ����
	}
	
	//? ��� �� ���� ���
	// forEach / println() ���������� ��½� toString() �ڵ� ȣ��
	public static void printAll(CustomerDTO[] all){
		for(CustomerDTO v : all) {
			System.out.println(v); //v.toString()
		}
	}

	public static void printMsg(String msg) {
		System.out.println(msg);
	}
		
}
