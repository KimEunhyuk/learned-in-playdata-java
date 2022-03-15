package view;

import model.CustomerDTO;
public class EndView {
	
	//red
	public static void printRedFruits(CustomerDTO[] c) {
		for (CustomerDTO fruit : c) {
			if (fruit.getColor() == "red") {
				System.out.println(fruit.getName());
			}
		}
	}
	
	//green
	public static void printGreenFruits(CustomerDTO[] c) {
		for (CustomerDTO fruit : c) {
			if (fruit.getColor() == "green") {
				System.out.println(fruit.getName());
			}
		}
	}
	
	//yellow
	public static void printYellowFruits(CustomerDTO[] c) {
		for (CustomerDTO fruit : c) {
			if (fruit.getColor() == "yellow") {
				System.out.println(fruit.getName());
			}
		}
	}
	
	//error
	public static void printError() {
		System.out.println("다른 색깔을 입력해주세요.");
	}
}
