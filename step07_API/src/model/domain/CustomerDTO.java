//domain �ܾ�� ������ ���� �ǹ��ϱ⵵��
package model.domain;

public class CustomerDTO {
	private String id;
	private int pw;
	
	public CustomerDTO() {
		super();	//�θ� ��ü�� ���� �����ǰ� �� �ִ� �ʼ� ����
	}
	public CustomerDTO(String id, int pw) {
		super();
		this.id = id;
		this.pw = pw;
	}
	
	/*
	 * �ڹٴ� ������ �ʼ�
	 * �ڵ�� ������ �� ���� ��� �⺻ �����ڸ� �ڵ�����
	 * �ʿ信 ���ؼ� ��� ������ �ʱ�ȭ �ϴ� �����ڴ� ���� ����
	 * 		- ���� ���� : �⺻������ ���ߵ� �ʼ�
	 * 
	 * ��ü ���� ����
	 * - ȣ���� CustomerDTO ���� ������ ���������� Object ��ü�� ���� ����
	 * CustomerDTO c = new CustomerDTO(); // ���ڿ�, ���� �ΰ��� �����͸� ���� ������ �޸� ����
	 */
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getPw() {
		return pw;
	}
	public void setPw(int pw) {
		this.pw = pw;
	}
	
	/*
	 * �ַ� domain(���� ǥ���ϴ�) Ŭ������ ������� �����Ǵ� ��ü���� println()��½ÿ�
	 * toString() �ڵ� ȣ��
	 * ������ ������ ���ؼ� java.lang.Object���� �޼ҵ�� ������ ��ü�� �ּҰ� ��ȯ
	 * �ּҰ��� ���߽ÿ��� �����δ� ����� ���� ����
	 * ���� Ŭ�������� ������
	 */
	
	@Override	//������ �޼ҵ� ���� = �ɼ�
	public String toString() {
		return "CustomerDTO [id=" + id + ", pw=" + pw + "]";
	}

}
