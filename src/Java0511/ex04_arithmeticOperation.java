/*	
	Date : 11.05.2020
	Author : Jaehyun
	Discription : 산술 연산자(arithmeticOperation)
	Ver. 1.0
*/

package Java0511;

public class ex04_arithmeticOperation {

	public static void main(String[] args) {
		// 정수형 변수를 2개 선언
		// 가감승제, 나머지 연산수행
		
		int num1 = 7;
		int num2 = 2;
		int result;
		
		//덧셈 (+)
		result = num1 + num2;
		System.out.println("+ 결과 : " + result);
		
		//뺄셈 (-)
		result = num1 - num2;
		System.out.println("- 결과 : " + result);
		
		//곱셈 (*)
		result = num1 * num2;
		System.out.println("* 결과 : " + result);
		
		//나눗셈 (/)
		result = num1 / num2;
		System.out.println("/ 결과 : " + result);
		
		//나머지 (%)
		result = num1 % num2;
		System.out.println("% 결과 : " + result);

	}

}
