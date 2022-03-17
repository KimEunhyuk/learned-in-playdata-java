package view;

import controller.ProjectMapController;
import model.dto.FirstT;
import model.dto.SecondT;
import model.dto.Route;

public class StartView {
	
	public static void main(String[] args) {
	
	//ù��° �������
	FirstT firstbus1 = new FirstT("87�� ����", 1150, 85);
	FirstT firstbus2 = new FirstT("88�� ����", 1200, 100);
	FirstT firstsubway1 = new FirstT("1ȣ��", 1250, 45);
	FirstT firstsubway2 = new FirstT("2ȣ��", 1300, 60);
	
	//�ι�° �������
	SecondT secondbus1 = new SecondT("97�� ����", 200, 40);
	SecondT secondbus2 = new SecondT("98�� ����", 100, 20);
	SecondT secondsubway1 = new SecondT("7ȣ��", 300, 40);
	SecondT secondsubway2 = new SecondT("9ȣ��", 400, 55);
	
	//���
	Route bus1bus1 = new Route("bus1bus1", firstbus1, secondbus1, 0, 0);
	Route bus1bus2 = new Route("bus1bus2", firstbus1, secondbus2, 0, 0);
	Route bus1sub1 = new Route("bus1sub1", firstbus1, secondsubway1, 0, 0);
	Route bus1sub2 = new Route("bus1sub2", firstbus1, secondsubway2, 0, 0);
	
	Route bus2bus1 = new Route("bus2bus1", firstbus2, secondbus1, 0, 0);
	Route bus2bus2 = new Route("bus2bus2", firstbus2, secondbus2, 0, 0);
	Route bus2sub1 = new Route("bus2sub1", firstbus2, secondsubway1, 0, 0);
	Route bus2sub2 = new Route("bus2sub2", firstbus2, secondsubway2, 0, 0);
	
	Route sub1bus1 = new Route("sub1bus1", firstsubway1, secondbus1, 0, 0);
	Route sub1bus2 = new Route("sub1bus2", firstsubway1, secondbus2, 0, 0);
	Route sub1sub1 = new Route("sub1sub1", firstsubway1, secondsubway1, 0, 0);
	Route sub1sub2 = new Route("sub1sub2", firstsubway1, secondsubway2, 0, 0);
	
	Route sub2bus1 = new Route("sub2bus1", firstsubway2, secondbus1, 0, 0);
	Route sub2bus2 = new Route("sub2bus2", firstsubway2, secondbus2, 0, 0);
	Route sub2sub1 = new Route("sub2sub1", firstsubway2, secondsubway1, 0, 0);
	Route sub2sub2 = new Route("sub2sub2", firstsubway2, secondsubway2, 0, 0);
	
	ProjectMapController controller = ProjectMapController.getInstance();
	
	System.out.println("*** 01. Project ���� ***");
	controller.routeInsert(bus1bus1);
	controller.routeInsert(bus1bus2);
	controller.routeInsert(bus1sub1);	
	controller.routeInsert(bus1sub2);
	controller.routeInsert(bus2bus1);
	controller.routeInsert(bus2bus2);
	controller.routeInsert(bus2sub1);
	controller.routeInsert(bus2sub2);
	controller.routeInsert(sub1bus1);
	controller.routeInsert(sub1bus2);
	controller.routeInsert(sub1sub1);
	controller.routeInsert(sub1sub2);
	controller.routeInsert(sub2bus1);
	controller.routeInsert(sub2bus2);
	controller.routeInsert(sub2sub1);
	controller.routeInsert(sub2sub2);
	
	System.out.println("\n*** 02. ��� Project �˻� ***");
	controller.getrouteList();	
	
	System.out.println("\n*** 03. 'bus1bus1' Project �˻� ***");
	controller.getRoute("bus1bus1");
	
	//ù��° ������� �����ϱ� 
	System.out.println("\n*** 04. 'bus1bus1' Project�� ù��° ������� ����(����) �� �ش� Project �˻� ***");
	controller.routeListUpdate("bus1bus1", firstbus2);
	
	//�ι�° ������� �����ϱ�
	System.out.println("\n*** 05. 'bus1bus1' Project�� �ι�° ������� ����(����) �� �ش� Project �˻� ***");
	controller.SecondTProjectUpdate("bus1bus1", secondsubway1); //����	
	controller.getRoute("bus1bus1"); //�˻�
	
	//������Ʈ �����ϱ� 
	System.out.println("\n*** 06. 'bus1bus1' Project ���� �� ������ Project �˻� ***");
	controller.routeDelete("bus1bus1");
	controller.getRoute("bus1bus1");
	
	}	
	
}
