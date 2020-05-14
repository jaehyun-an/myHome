/*	
	Date : 11.05.2020
	Author : Jaehyun
	Discription : 중첩if문 (nestedIf)
	Ver. 1.0
*/
package Java0511;

import java.util.Scanner;

public class ex13_nestedIf {

	public static void main(String[] args) {
		// 중첩if 문 : if문 안에 if문

		// 학점 출력 프로그램
		// 1. 100점을 초과하면 "입력 범위를 초과했습니다." 출력
		// 90점 이상이면 "A학점입니다." 출력
		// 2. 학점 처리
		// A+ : 95 ~ 100
		// A : 90~94
		// B+ : 85~89
		// B : 80~84
		// C+ : 75~79
		// C : 70~74
		// D+ : 65~69
		// D : 60~64
		// F : 60미만
		// 3. print 문은 한번만 사용

		Scanner sc = new Scanner(System.in);

		int score;
		String grade = null;

		System.out.print("점수를 입력하세요 : ");
		score = sc.nextInt();

		if (score <= 100) {
			if (score >= 90) {
				if (score >= 95) {
					grade = "A+";
				} else {
					grade = "A";
				}
			} else if (score >= 80) {
				if (score >= 85) {
					grade = "B+";
				} else {
					grade = "B";
				}
			} else if (score >= 70) {
				if (score >= 75) {
					grade = "C+";
				} else {
					grade = "C";
				}
			} else if (score >= 60) {
				if (score >= 65) {
					grade = "D+";
				} else {
					grade = "D";

				}
			} else {

			}

			System.out.println("학점은 : " + grade + "입니다.");
			
		} else {
			
			System.out.println("입력 범위를 초과 했습니다.");
		}



	}

}
