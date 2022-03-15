/*
 * �н� ����
 * 1. �ǽ� ����
 *  Ű����� �Է��� �����͸� �������ϴ� ���ϰ� �ܼ�â�� ���
 * 	- ������ ���� - ���� ���� �� ������ ���
 * 	- ���� ���� - ���� ����
 * 		���Ӱ� ��� ���� �ۼ�
 * 		���� ���� �����ϸ鼭 ���� �߰�(append)
 * 
 * 	���� ���Ϸ� ���� �������ϴ� ���ϰ� �ܼ�â�� ���
 * 	- �߻� ������ ����� ��
 * 		1. ���� ����(�����͸� ������ ������ ����)
 * 		2. �����͸� read �Ϸ��� ������ ����
 * 			- FileNotFoundException �߻� 
 * 
 * 2. java.io package���� API ����
 *  - ~InputStream/~OutputStream : 1byte ������� ����� API
 *  - ~Reader/~Writer : 2byte ������� ����� API
 *  
 * 	- ��� ���డ���� ��ü �����ؼ� �ʿ� �޼ҵ� ȣ��
 * 		1. Ű���� - System.in
 * 		2. �ܼ� - System.out
 * 		3. file�κ��� ������ read ����� class - FileInputStream/FileReader
 * 		4. file�� ������ write ����� class - FileOutputStream/FileWriter
 * 
 * 3. ����
 * 	- ��� ����� io�� �ý��� �ڿ��� �ڿ�
 * 		- ����� ������ �ϵ���� �ڿ� ����� ����Ѵ� ��
 * 		: ���� ����ÿ� �ڿ� ��ȯ(����) �ʼ�(***)
 */
package step02.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

public class IOTest {
	
	//Ű���忡 �ԷµǴ� ������ ���
	/*
	 * Ű���� - System.in
	 * �ܼ� - System.out
	 * �ѱ� ������ ����� �ϰ������?
	 * 	- �ܼ� ��½� �ܼ����� - System.out / ��� println()
	 * 	buffer ��� Ȱ��
	 * 		BufferedReader - enter �������� ���ڿ��� �����ؼ� �� ���ڿ��� read ������ �޼ҵ� ����
	 * System.in - 1byte / BufferedReader - 2byte
	 * 	- 1byte�� 2byte ȣȯ API�ʿ�
	 * 		- InputStreamReader �� ȣȯ
	 * 
	 * BufferedRead(Reader in){}  -2  / ���⿡�� System.in ������ �׷��� �ؿ� ���Դٰ� �;���
	 * InputStreamReader(InputStream in){}  -1 / 1->2 �ٲ���
	 * 1 -> 2 , System.in - 1
	 * 
	 * ���� 2�� ���� - �ǽð� �Է� �� ������� ����
	 * 	�ǽð� �Է�(read/write �ݺ�) : �ݺ��� �ʿ�
	 * 		������ ���� ���� ���� - String �� ���ڿ� ������ read�ÿ��� ���� ���δ� null ����	 * 
	 * 	����� ��� : ctrl + z �� ����
	 */
	public static void m() throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String data = in.readLine();
		
		while(data != null){
			System.out.println(data);
			data = in.readLine();
		}
	}
	
	/*
	 * FileWriter API
	 */
	//Ű����� ���� read�� �����͸�
	public static void m2() throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new FileWriter("playdata.txt"));
		
		String data = in.readLine();
		
		while(data != null){
			out.write(data);
			data = in.readLine();
			out.flush(); //buffer �޸𸮿� �����ɼ��� �ִ� �����͸� ����ϰڱ� ���ִ� ���
		}
		in.close();	//�Է� �ý��� �ڿ� ����
		out.close();//��� �ý��� �ڿ� ����
	}
	
	/*
	 * 
	 */
	//m2() �޼ҵ� -> �ǹ��� �������� �ڵ�� ����
	public static void m3() throws IOException{
		BufferedReader in = null;
		BufferedWriter out = null;
		
		try {
			in = new BufferedReader(new InputStreamReader(System.in));
			out = new BufferedWriter(new FileWriter("playdata.txt", true));
			
			String data = in.readLine();
			
			while(data != null){
				out.write(data + "\n"); //"\n" new line ����
//				out.newLine();	//new line �����ϴ� �޼ҵ�
				data = in.readLine();
				out.flush(); //buffer �޸𸮿� �����ɼ��� �ִ� �����͸� ����ϰڱ� ���ִ� ���
			}
		}finally {
			if(in != null) {
				in.close();	//�Է� �ý��� �ڿ� ����
				in = null;
			}
			if(out != null) {
				out.close();//��� �ý��� �ڿ� ����
				out = null;
			}
		}
	}
	
	//playdata.txt file read�ؼ� encoir.txt�� ���
	public static void m4() throws IOException{
		BufferedReader in = null;
		BufferedWriter out = null;
		
		try {
			in = new BufferedReader(new FileReader("playdata.txt"));
			out = new BufferedWriter(new FileWriter("encore.txt", true));
			
			String data = in.readLine();
			
			while(data != null){
				out.write(data + "\n"); //"\n" new line ����
				System.out.println(data);
//				out.newLine();	//new line �����ϴ� �޼ҵ�
				data = in.readLine();
				out.flush(); //buffer �޸𸮿� �����ɼ��� �ִ� �����͸� ����ϰڱ� ���ִ� ���
			}
		}finally {
			if(in != null) {
				in.close();	//�Է� �ý��� �ڿ� ����
				in = null;
			}
			if(out != null) {
				out.close();//��� �ý��� �ڿ� ����
				out = null;
			}
		}
	}
	
	/*
	 * mu.properties ���� �� ������ ����
	 * 	- key = value
	 * 
	 * my.properties���� �ִ� Ư�� key�� �ش��ϴ� value���� ���
	 * ���߽ÿ� �������
	 * my.properties ������ Ȱ�� API Properties  Ŭ����
	 */
	public static void m5() {
		Properties stuInfo = new Properties();
		
		//my.properties Properties ��ü�� �ε�(����
		try {
			//step07_API �ٷ� ������ ������ ��쿡�� ���� ����
//			stuInfo.load(new FileReader("my.properties"));
			
			//steo07_API/src/my.properties ��ε� �������� ������ ����
//			stuInfo.load(new FileReader("src/my.properties"));
			
			// . : ���� ��� �ǹ�
			// ./ : �� ��� ������ src ������ ���� �ǹ�
			stuInfo.load(new FileReader("./src/my.properties"));
			
			//���� ���
			stuInfo.load(new FileReader("C:\\20220103_lab\\01.java\\step07_API\\src\\my.properties"));
			
			//key�� value�� ȹ���ϴ� �޼ҵ�(�߿�)
			System.out.println(stuInfo.getProperty("stu2"));
		} catch (IOException e) { // IOException ���� ���� ��ü �� ����
			e.printStackTrace();
		}
	}
	
	//���Ϸκ��� read�� ������ ���
	public static void main(String[] args) {
		//m5();
		
//		System.out.println("-----");
//		try {
//			m4();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}

}
