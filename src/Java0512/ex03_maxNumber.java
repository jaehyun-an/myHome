/*	
	Date : 12.May.2020
	Author : Jaehyun
	Description : maxNumber (최댓값 구하기)
	Ver. 1.0
*/

package Java0512;

import java.util.Scanner;

public class ex03_maxNumber {

	public static void main(String[] agsr) {

		// 두 수를 입력받아 큰 수 출력하기
		Scanner sc = new Scanner(System.in);
		/*
		 int num1, num2, max ;
		 
		 System.out.println("첫번째숫자 : "); num1 = sc.nextInt();
		 System.out.println("두번째숫자 : "); num2 = sc.nextInt();
		 
		 if (num1 > num2) { max = num1; } else { max = num2; }
		 System.out.println("최댓값은 : " + max);
		 */

		// 세 수를 입력받아 큰 수 출력하기

		int num1, num2, num3;
		int max = 0;

		System.out.println("첫번째 숫자입력 : ");
		num1 = sc.nextInt();
		System.out.println("두번째 숫자입력 : ");
		num2 = sc.nextInt();
		System.out.println("세번째 숫자입력 : ");
		num3 = sc.nextInt();
		
		/*
		if (num1 > num2) {
			if (num1 > num3) {
				max = num1;
			} else {
				max = num3;
			}
		} else if (num2 > num3) {
			max = num2;
		} else {
			max = num3;
		}
		*/
		
		if (num1 > num2 && num1 > num3) {
			max = num1;
		} else if (num2 > num3) {
			max = num2;
		} else {
			max = num3;
		}
		System.out.println("최댓값은 : " + max);

	}
}
