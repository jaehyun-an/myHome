/*	
	Date : 11.05.2020
	Author : Jaehyun
	Discription : 조건 연산자(conditionalOperation)
	Ver. 1.0
*/

package Java0511;

public class ex07_conditionalOperation {

	public static void main(String[] args) {

		/*
		 * // 삼항 연산자
		 
		
		// (조건식) ? 참일 때 값 : 거짓일 때 값 ;
		
		int inAge = 35;
		int hoonAge = 50;
		
		char resultChar ;
		int resultInt ;
		String resultStr;
		
		// (조건식) ? 참일 때 값 : 거짓일 때 값 ;
		// 35 > 50
		resultChar = (inAge < hoonAge) ? 'o' : 'x' ;
		
		resultInt = (inAge < hoonAge) ? 0 : 1 ;
		
		resultStr = (inAge < hoonAge) ? "참일 경우" : "거짓일 경우" ;
		
		System.out.println("resultChar : " + resultChar);
		System.out.println("resultInt : " + resultInt);
		System.out.println("resultStr : " +resultStr);
		*/
		
		//Q. 조건연산자를 사용하여 10이 짝수인 경우에는 True
		//  홀수인 경우에는 false를 출력하는 조건연산자를 작성하시오
		
		int num = 10;
		boolean isEven;
		
		isEven = (num % 2 == 0 )? true : false ;
		System.out.println(isEven);
		
		
		
		
		
		
		
	}

}
