package view;

import controller.Controller;

public class StartView {

	public static void main(String[] args) {
		
		System.out.println("***빨간색 과일 요청했을때***");
		Controller.reqRes("red");
		
		System.out.println("***초록색 과일 요청했을때***");
		Controller.reqRes("green");
		
		System.out.println("***노란색 과일 요청했을때***");
		Controller.reqRes("yellow");
		
		System.out.println("***에러 발생시***");
		Controller.reqRes("blue");
		
	}
}
