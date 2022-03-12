package step03;

public class Car2 {
	
	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.setCarname("벤츠");
		c1.setPrice(11000);
		
		Car c2 = new Car();
		c2.setCarname("제네시스");
		c2.setPrice(10000);
		
		System.out.println("차이름: " + c1.getCarname() + ", 가격: " + c1.getPrice());
		System.out.println("차이름: " + c2.getCarname() + ", 가격: " + c2.getPrice());
	}
}
