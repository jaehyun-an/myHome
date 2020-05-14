/*	
	Date : 11.05.2020
	Author : Jaehyun
	Discription : 조건문연습문제 1 (ifExample1)
	Ver. 1.0
*/
package Java0511;

import java.util.Scanner;

public class ex12_ifExample1 {

	public static void main(String[] args) {
		// 문제. 성적출력 예제
		// 점수를 입력 받아서
		//90점 이상이면 "A학점입니다." 출력
		//A : 90~100
		//B : 80~89
		//C : 70~79
		//D : 60~69
		//F : 60미만
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.print("점수를 입력하세요. : ");
		num = sc.nextInt();
		
		
		if (90 <= num) {
			 System.out.println( "A학점입니다.");
		} else if (80 <= num) {
			 System.out.println( "B학점입니다.");
		} else if (70 <= num) {
			 System.out.println( "C학점입니다.");
		} else if (60 <= num) {
			 System.out.println( "D학점입니다.");
		} else { 
			 System.out.println( "F학점입니다.");
		}
		
	}

}
