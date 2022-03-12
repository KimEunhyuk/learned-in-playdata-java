
package view;

import controller.Controller;


public class StartView {
	
	/* client가 1로 요청시 고객 한명 정보 요청으로 간주
	 * 			2로 요청시 고객들 모든 정보 요청으로 간주
	 * 
	 */
	
	public static void main(String[] args) {
//		Controller.reqRes();//Controller에 reqRes 요청함!
							//; (Controller님 받았습니다)
		
		System.out.println("* 고객 한명 정보 요청 *");
		Controller.reqRes(1);
		
		System.out.println("** 모든 고객 정보 요청 **");
		Controller.reqRes(2);

		System.out.println("*** 잘못된 정보 요청 ***");
		Controller.reqRes(5);
	}
}
