package view;

import controller.Controller;

public class StartView {

	public static void main(String[] args) {
		
		System.out.println("***������ ���� ��û������***");
		Controller.reqRes("red");
		
		System.out.println("***�ʷϻ� ���� ��û������***");
		Controller.reqRes("green");
		
		System.out.println("***����� ���� ��û������***");
		Controller.reqRes("yellow");
		
		System.out.println("***���� �߻���***");
		Controller.reqRes("blue");
		
	}
}
