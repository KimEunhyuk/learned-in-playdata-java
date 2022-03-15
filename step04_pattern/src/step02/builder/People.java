// Builder!

package step02.builder;
import lombok.Data;
import lombok.Builder;

@Data
@Builder
public class People {
	private String name;
	private int age;

	
	//�ټ��� �����߿� name �������� �ʱ�ȭ �ϸ鼭 ��ü �����ϴ� ����
	/*
	 * People.builder() : PeopleBuilder ��ü ��ȯ 
	 */
	public static void main(String[] args) {
		//�ټ��� �����߿� name �������� �ʱ�ȭ �ϸ鼭 ��ü �����ϴ� ����
		/*
		 * People.builder() : PeopleBuilder ��ü ��ȯ
		 * PeropleBuilder 
		 * 		- People ��ü �������ִ� ��ü
		 * 		- ���� ���õ� �޼ҵ�� �ڵ� �����ؼ� ����
		 * 		- �����ؼ� ������ �ʱ�ȭ(�� ����) ������ ��� 
		 * 
		 * name("���缮") : name ������ ���������� �� ���ԵǴ� �޼ҵ�
		 * build() : ���� �ش� ��ü �������ִ� �޼ҵ�
		 */
		People p = People.builder().name("���缮").build();
		System.out.println(p.name + " " + p.age);
		System.out.println(p); //p.toString()
//		People p1 = new People();
//		p1.setName("���缮");
//		p1.setAge(45);
		
//		People p2 = new People("���缮", 45);
//		System.out.println(p2);	//step01.People@123a439b
//		System.out.println(p2.toString());	//step01.People@123a439b
//		System.out.println(p2);// ���缮 -45

		
	}
}
