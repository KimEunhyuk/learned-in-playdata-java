package step03;

public class Car2 {
	
	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.setCarname("����");
		c1.setPrice(11000);
		
		Car c2 = new Car();
		c2.setCarname("���׽ý�");
		c2.setPrice(10000);
		
		System.out.println("���̸�: " + c1.getCarname() + ", ����: " + c1.getPrice());
		System.out.println("���̸�: " + c2.getCarname() + ", ����: " + c2.getPrice());
	}
}
