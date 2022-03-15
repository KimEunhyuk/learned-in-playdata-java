/*
 * �н����� - Set
 * 	1. �����͵� �ߺ� ����
 * 	2. ���� ������ ���� ���� ����
 * 	3. ������ �ϳ��ϳ� ������ �� �ִ� ������ index�� ����
 * 	4. API�� ���� ������ �ϳ��� ��ȯ �޼ҵ� ����
 * 		- Iterator API Ȱ���ؼ� �ϳ��� ��ȯ
 * 			- boolean hasNext()	: ������ Ȯ��
 * 			- Object next() 	: ������ �ϳ� ��ȯ
 */

package step01.test;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest {

	
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("a");
		set.add("b");
		set.add("d");	//����
		set.add("d");	//������ ģ���� �̹����� �� ��� �����ϱ� �ź��ϱ�?
						//����. ������ ���� �� ������ ����
		set.add("c");
		System.out.println(set);	//[a, b, c, d]

		//set ������ �����Ͱ����� �ϳ��� ���� �����ϰ� ���ִ� ��ü
		/*
		 * hasNext() : ���� ���� Ȯ�� �޼ҵ�
		 * next() : ������ ����(�޸𸮿��� ����)
		 */
		Iterator<String> all = set.iterator();
		String v = null;
		
		while(all.hasNext()) {
			v = all.next();
//			System.out.println(all.next(v));
//			System.out.println(v);
//			System.out.println(v);
			
			//����ȯ ���� String���� ��� ȣ�� ����
			System.out.println(v.charAt(0)); 
		}
		System.out.println("*** �� �̷����? ***");
		HashSet<String> set2 = new HashSet<String>();	//���׸�, string�� ���尡��
		set.add("a");	// String ��ü Ÿ�����θ� ����
		set.add("b");
		set.add("d");
		set.add("d");
		set.add("c");
		
		//���׸� �̹ݿ��� ������ ������ ����Ƽ ���� �ڵ�� �������� ���ô� !! �� �ڵ�
		//���׸��� all ���� ����ó�� �����ϸ鼭 Ȱ���ϴ� �ڵ� ����
		Iterator all2 = set2.iterator();	//Object Ÿ��
		
		while(all2.hasNext()) {
			System.out.println(((String)all2.next()).charAt(0));
			//���׸� �̹ݿ����� ����ȯ �ؾ���,,;
		}
	}
}