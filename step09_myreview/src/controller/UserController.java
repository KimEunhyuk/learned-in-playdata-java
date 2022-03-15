package controller;

import model.UserModel;
import model.dto.User;
import view.FailView;
import view.SuccessView;

public class UserController {
	public static void userOne(String grade) {
		try {
			User user = UserModel.userOne(grade);
			SuccessView.printUser(user);
		} catch (Exception e) {
			e.printStackTrace();
			FailView.messageView(e.getMessage());
		}
	}
	
}
