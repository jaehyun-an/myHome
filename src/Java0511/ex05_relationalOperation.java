/*	
	Date : 11.05.2020
	Author : Jaehyun
	Discription : 관계 연산자(relationalOperation)
	Ver. 1.0
*/

package Java0511;

public class ex05_relationalOperation {

	public static void main(String[] args) {
		
		// 정수형 변수 2개를 선언
		int num1 = 7;
		int num2 = 2;
		
		// >, <, >=, <=, ==, != 연산 수행
		boolean result;
		
		System.out.println("num1 = 7, num2 = 2 일때");
		
		result = num1 > num2;
		System.out.println("> 결과 : " + result);
		
		result = num1 < num2;
		System.out.println("< 결과 : " + result);
		
		result = num1 >= num2;
		System.out.println(">= 결과 : " + result);
		
		result = num1 <= num2;
		System.out.println("<= 결과 : " + result);
		
		result = num1 == num2;
		System.out.println("== 결과 : " + result);
		
		result = num1 != num2;
		System.out.println("!= 결과 : " + result);
		
	}

}
