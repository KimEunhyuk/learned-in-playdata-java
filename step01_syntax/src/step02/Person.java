//��� ������ ���� �� ���� �� ��� ������ ���� Ŭ����
/*this - ���� ������ ��� �������� ������ ��쿡 ��� ������ �����ϰ� �Ǵ� Ű����
*�ڱ��ڽ��� ��ü�� �����ϴ� Ư���� Ű����
*/

package step02;

import lombok.Builder;
import lombok.Data;
//import lombok.NoArgsConstructor;

@Data
//@NoArgsConstructor
@Builder
public class Person {
	private String name;
	private int age;

}