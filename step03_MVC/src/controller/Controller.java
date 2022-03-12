//컨트롤 쉬프트 O 하면 import 만들어준다
package controller;

import model.Model;
import view.EndView;

public class Controller {
	
	// StartView reqRes 응답.
	public static void reqRes(int flag) { // StartView님 요청 받았습니당
		//요청시 1 - 한명 고객 정보 제공/ 2 - 모든 고객 정보 제공 / 1 또는 2가 아니라면 잘못된 요청
		// 조건 - 1인가? 2인가? 1또는 2가 아닌가?
		// 정수 비교 연산자(동등비교연산자) : ==
		if(flag == 1) {
			EndView.print(Model.getCustomer());
		}
		else if(flag == 2) {
			EndView.printAll(Model.getCustomers());
			/* EndView.printAll(Model.getCustomers()); 실행순서
			 * Model.getCustomers()
			 * -> EndView.printAll()
			 * ->;
			 */
			
		}
		else {
			EndView.printMsg("잘못된 요청입니다. 재확인 하세요");
		}
		
//		//Model에서 생성한 getCustomer() 메소드를 실행해서 얻은 값을 c에 대입
//		CustomerDTO c = Model.getCustomer(); //Model.getCustomer 주세요
//		//encore, 11, g 받았어요
//		
//		EndView.print(c);	// EndView님 프린트주세요 (EndView print()실행. c를 넣어서)
//							// print 받았어요 감사! StartView님 이거 다 가져가세요
	}
}
