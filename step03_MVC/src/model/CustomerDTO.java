package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter	// getXxx() ����
@Setter	// setXxx() ����
@NoArgsConstructor	// �Ķ���Ͱ� ���� �⺻ �����ڸ� ����
@AllArgsConstructor// ��� �ʵ尪�� �Ķ���ͷ� �޴� �����ڸ� ����
@ToString

public class CustomerDTO {
	// private : ���� Ŭ���� �������� ���� ����
	private String id;	// id ���� ����
	private int pw;		// pw ���� ����
	private char grade;	//g(gold), s(silver) �� ������ OK ���� ���� , grade ���� ����
	private String job;	// job ���� ����
	// ����ĳ���ʹ� ' '
	// grade���� ��ȿ�� ���� ���� ������ ���ǽ� ����(��ȿ�� ����)
	// - ���� Ÿ�Ը� �´ٰ� �ؼ� ���� ������ ��Ȳ�� ����
	// ������ �ܺο��� ȣ�� �Ұ����ϰ� ���Ƴ��� ��ȿ�� �ڵ�� ���� �Ŀ��� ����
	// ���� ���� : ������ �ܺο��� ����(private)
	// ��ȿ�� �ڵ�� ���� �޼ҵ�� ���� ���� ���(public)
	
	// grade�� gȤ�� s�϶�, this.grade = grade ����(g,s), �ƴϸ� ��ȿ�� ��� ��ȯ
	public void setGrade(char grade) {
		if(grade == 'g' || grade == 's') {
		this.grade = grade;
			}
		else {
			System.out.println("��ȿ�� ���");
			}
	}
}