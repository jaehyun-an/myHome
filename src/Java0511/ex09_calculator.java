/*	
	Date : 11.05.2020
	Author : Jaehyun
	Discription : 계산기(calculator)
	Ver. 1.0
*/



package Java0511;

import java.util.Scanner;

public class ex09_calculator {
	
	public static void main(String[] args) {
		//두개의 정수를 입력받아서
		//결과를 출력해보자
		
		
		double num1;
		double num2;
		double result;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("첫번째 숫자를 입력 : "); // = 10
		num1 = sc.nextInt();
		System.out.print("두번째 숫자를 입력 : "); // = 4
		num2 = sc.nextInt();
		
		result = num1 + num2;
		System.out.println("덧셈결과 : " + result); // = 14.0
		result = num1 - num2;
		System.out.println("뺄셈결과 : " + result); // = 6.0
		result = num1 * num2;
		System.out.println("곱셈결과 : " + result); // = 40.0
		result = (double)num1 / num2;
		System.out.println("나눗셈결과 : " + result); // = 2.5
		result = num1 % num2;
		System.out.println("나머지결과 : " + result); // = 2
		
		
		
		
		
		
		
		
	}

}
