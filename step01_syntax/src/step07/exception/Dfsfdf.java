package step07.exception;

//Console ���� 1234�� �ǰ� �ϰ� �ʹ�. ���� �߻� ���ο� �����ϰ� ������ ����Ǵ� ����� ��ĭ�� �� ��ɾ��?

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
