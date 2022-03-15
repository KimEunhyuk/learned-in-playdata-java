package controller;

import model.Model;
import model.CustomerDTO;
import view.EndView;

public class Controller {
	
	//»ö»ó
	public static void reqRes(String color) {
		if (color == "red") {
			EndView.printRedFruits(Model.getCustomers());
		}else if (color == "green") {
			EndView.printGreenFruits(Model.getCustomers());
		}else if (color == "yellow"){
			EndView.printYellowFruits(Model.getCustomers());
		}else {
			EndView.printError();
		}
	}
	
}
