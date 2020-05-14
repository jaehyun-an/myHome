/*	
	Date : 11.05.2020
	Author : Jaehyun
	Discription : 증감 연산자(increaseDecreaseOperation)
	Ver. 1.0
*/
package Java0511;

public class ex02_increaseDecreaseOperation {

	public static void main(String[] args) {

		// 단항 연산자
		// 증가와 감소 연산자 (++, --)
		
		// ++num : num이 가지고 있는 값에 1을 증가한뒤 연산에 적용
		// num++ : num이 가지고 있는 값을 연산에 적용한 뒤 1을 증가
		
		
		// result1 = ++num1;
		// num1 = num1 +1;
		// result1 = num1;
		
		//result1 = num1+;
		//result1 = num1;
		//num1= num1 + 1;
		
		//예제
		/*int num = 10;
		int num1 = 5;
		/*
		 * --num;
		 * ystem.out.println(num); //결과 = 9
		// num = num - 1;
		// num = 10 - 1;
		// ∴num = 9;
		
		int result;
		result = --num;
		System.out.println(result); //결과 = 8
		// result = --num;
		// num = num - 1;
		// num = 9 - 1;
		// result = num;
		// ∴result = 8;
		
		result = num--;
		System.out.println(result); //결과 = 8
		// result = num--;
		// result = num;
		// result = 8;
		
		// num = num - 1;
		// ∴num = 8 - 1 ;
		 
		
		int result1; //num = 10, num1 = 5
		result1 = ++num + ++num1;
		System.out.println(num); // 답 : 11
		System.out.println(num1); // 답 : 6
		System.out.println(result1); // 11 + 6 답 : 17
		
		result1 = num++ + num1++;
		System.out.println(result1); // 11 + 6 답 : 17
		result1 = num++ + ++num1;
		System.out.println(result1); // (11+1) + (6+1)+1 = 12 + 8 = 답 : 20
		result1 = ++num + num1++;
		System.out.println(result1); // (12+1) + 1 + 8 = 14 + 8 답 : 22
		*/
		
		int num3 = 5;
		int num4 = 11;
		int result4;
		
		result4= ++num3 + --num4; // 예상 : 6 + 10 = 16 답 : 16
		System.out.println(result4);
		
		result4= num4++ - num3--; // 예상 : 10 - 6 = 4 답 : 4
		System.out.println(result4);
		
		result4= num3++ - ++num4; // 예상 : 5 - 12 = - 7 답 : -7
		System.out.println(result4);
		
		
		
		
		
	}

}
