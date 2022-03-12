package step01.basic;

import org.junit.Test;

//1~5까지 반복 출력
//1 : 초기치(시작) / 5까지 : 조건 / 1부터 1씩 증가(증가치)

/*for(초기치;조건식;증감식){
 * true인 경우만 실행되는 블럭
 * 
 * - 무한 반복시 권장/반복횟수가 불명확할 경우 권장
 * 초기치;
 * while(조건식){
 * true인 경우만 실행되는 블럭
 * 증감식;
 * }
 * 
 * - 조건을 떠나서 무조건 한번은 실행해야 되는 경우
 * 
 * do
 */
public class L05Loop {
	
	@Test
	public void forM() {
		for(int i=1; i<=5; i++) {
			System.out.println(i);
		}
	}
	
	@Test
	public void whileM() {
		System.out.println("--- while loop ---");
		int i = 1;
		while(i <= 5) {
			System.out.println(i);
			i++;
		}
	}
}
