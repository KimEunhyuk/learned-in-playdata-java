package step07.exception;

class A{
	static {
		System.out.println("byte code�� �޸𸮿� �ε��� �ڵ� �ǻ��Ǵ� ���");
	}
}

public class Exception1 {

	public static void main(String[] args) {
//		int [] i = {1, 2};	//index 0��° 1����, length ���� �ڵ� ���� = 2 ����
//		System.out.println(i[1]); //���絵 ���� �ʴ� �޸𸮰��� �����͸� ��½� ���� �߻�
		System.out.println(10/2);
		
		
		//�����ϴ� �Ϲ� byte code �� class ���� �޸𸮿� �ε��ϴ� API
		/* forName() ������ ����
		 * 1. ��� : parameter ���ڿ��� ���ԵǴ� Ŭ������ �޸𸮿� �ε�
		 * 2. �߻� ������ ����� ��
		 * 	1. ���� �ε�
		 * 		- �� ��¥ �����ϴ� Ŭ������ �ְ� ��Ÿ �ϳ� ���� �ڵ�
		 * 	2. ������ �ε�
		 * 		- class�� ���� ����
		 * 		- class�� ������ ��Ÿ�� �ڵ�
		 * 	3. ���
		 * 		- Ȥ�� ������ �ε��� �ڵ�󿡼� �߻� ������ ����ؼ�
		 * 			�޼ҵ� ���𱸿� ���
		 * 			�޼ҵ� body������ ó��
		 * 
		 * public static Class forName(String className)
		 * 			throws ClassNotFoundException
		 * 
		 * 1. �ǽ�
		 * 	����/������ ��Ȳ ����
		 * 2. �迭 ����
		 * 	������ ok / ����� ArrayIndexOutOfBoundsException �߻�
		 * 	���࿹�� �߻��� �� �����ؼ� �� try~catch��� ����ó�� ���� ���� ���� �����ؼ�
		 * 	���� ����
		 * 	���� �߻��ÿ��� �ý��� stop
		 * 
		 * 3. class�ε� ����
		 * 	����ó�� ������ ���� ��쿡 ��Ÿ ���� ���� Ȯ�� ���� ������ ���� �߻�
		 * 	ClassNotFoundException
		 * 	����ó�� ���� ������ �ʼ� �Ŀ� �����ؼ� ���� �߻� ���� Ȯ��
		 * 	Ȥ ���� �߻��ÿ��� ���α׷� ������ ������ ���� ���� ����
		 * 
		 */
		
//		try {
//			Class.forName("step07.exception.A");
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
	}

}
