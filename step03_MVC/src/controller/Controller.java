//��Ʈ�� ����Ʈ O �ϸ� import ������ش�
package controller;

import model.Model;
import view.EndView;

public class Controller {
	
	// StartView reqRes ����.
	public static void reqRes(int flag) { // StartView�� ��û �޾ҽ��ϴ�
		//��û�� 1 - �Ѹ� �� ���� ����/ 2 - ��� �� ���� ���� / 1 �Ǵ� 2�� �ƴ϶�� �߸��� ��û
		// ���� - 1�ΰ�? 2�ΰ�? 1�Ǵ� 2�� �ƴѰ�?
		// ���� �� ������(����񱳿�����) : ==
		if(flag == 1) {
			EndView.print(Model.getCustomer());
		}
		else if(flag == 2) {
			EndView.printAll(Model.getCustomers());
			/* EndView.printAll(Model.getCustomers()); �������
			 * Model.getCustomers()
			 * -> EndView.printAll()
			 * ->;
			 */
			
		}
		else {
			EndView.printMsg("�߸��� ��û�Դϴ�. ��Ȯ�� �ϼ���");
		}
		
//		//Model���� ������ getCustomer() �޼ҵ带 �����ؼ� ���� ���� c�� ����
//		CustomerDTO c = Model.getCustomer(); //Model.getCustomer �ּ���
//		//encore, 11, g �޾Ҿ��
//		
//		EndView.print(c);	// EndView�� ����Ʈ�ּ��� (EndView print()����. c�� �־)
//							// print �޾Ҿ�� ����! StartView�� �̰� �� ����������
	}
}
