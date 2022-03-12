package gma;

public class dma {
	public static void main(String[] args) {
		
//		int a = 10; 

/*	틀린 것을 고쳐보시오	
		10 = a;
		a + 1 = 10;
		10 = 1;
		a = a + 10;
*/ 		
		
		// 실행 후 마지막 결과값은?
		int number = 10;
		System.out.println("number = 10 -> " +number);
		number += 10;	// 10 더하고 대입
		System.out.println("number += 10 -> " +number);
		number -= 10;	// 10 빼고 대입
		System.out.println("number -= 10 -> " +number);
		number *= 2;	// 2를 곱하고 대입
		System.out.println("number *= 2 -> " +number);
		number /= 2;	// 2로 나누고 대입
		System.out.println("number /= 2 -> " +number);
	}
}
