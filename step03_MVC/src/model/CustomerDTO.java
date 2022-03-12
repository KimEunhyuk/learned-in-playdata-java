package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter	// getXxx() 생성
@Setter	// setXxx() 생성
@NoArgsConstructor	// 파라미터가 없는 기본 생성자를 생성
@AllArgsConstructor// 모든 필드값을 파라미터로 받는 생성자를 만듬
@ToString

public class CustomerDTO {
	// private : 같은 클래스 내에서만 접근 가능
	private String id;	// id 변수 생성
	private int pw;		// pw 변수 생성
	private char grade;	//g(gold), s(silver) 두 레벨만 OK 가능 가정 , grade 변수 생성
	private String job;	// job 변수 생성
	// 단일캐릭터는 ' '
	// grade값에 유효한 값만 저장 가능한 조건식 적용(유효성 적용)
	// - 절대 타입만 맞다고 해서 대입 가능한 상황은 금지
	// 변수를 외부에서 호출 불가능하게 막아놓고 유효성 코드로 검증 후에만 대입
	// 개발 관점 : 변수를 외부에서 차단(private)
	// 유효성 코드로 검증 메소드는 제한 없이 허용(public)
	
	// grade가 g혹은 s일때, this.grade = grade 성립(g,s), 아니면 무효한 등급 반환
	public void setGrade(char grade) {
		if(grade == 'g' || grade == 's') {
		this.grade = grade;
			}
		else {
			System.out.println("무효한 등급");
			}
	}
}