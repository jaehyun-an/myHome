/*	
	Date : 11.05.2020
	Author : Jaehyun
	Discription : 대입 연산자(assignmentOperation)
	Ver. 1.0
*/

package Java0511;

public class ex03_assignmentOperation {
	
	public static void main(String[] args) {
		int age = 24;
		int num = 1;
		
		// 나이를 의미 하는 변수 age에 변수값 24를 대입한다.
		// 왼쪽 변수 = 오른쪽 변수 (또는 상수, 식)
		// leftValue(항상 변수) = rightValue (상수, 변수, 식)
		
		// 부호연산자 : (+), (-)
		int num1 = 10;
		System.out.println(+num1); // 결과 = 10
		System.out.println(-num1); // 결과 = -10
		System.out.println(num1); // 결과 = 10
		
		num1= -num1; //num1 = -(10);
		System.out.println(num1); // 결과 = -10
	
	}

}
