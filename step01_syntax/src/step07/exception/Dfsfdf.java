package step07.exception;

//Console 값이 1234가 되게 하고 싶다. 예외 발생 여부와 무관하게 무조건 실행되는 블록인 빈칸에 들어갈 명령어는?

	public class Dfsfdf{
		
		public static void m9(){
			try {
					System.out.print(1);
					Class.forName("step04.exception.B");
					System.out.print(10);
				}
			catch(ClassNotFoundException e){
					System.out.print(2);
				}
			finally{
				System.out.print(3);
				}
			System.out.print(4);
			}
		
		public static void main(String[] args){
			m9();
			}

	}
