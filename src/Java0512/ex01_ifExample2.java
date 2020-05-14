/*	
	Date : 12.05.2020
	Author : Jaehyun
	Description : 조건문 연습 문제 2 (ifExample2)
	Ver. 1.0
*/

package Java0512;

import java.util.Scanner;

public class ex01_ifExample2 {

	public static void main(String[] args) {
		/*
		스캐너를 사용해서 국어, 영어, 수학점수를 입력받아 총점,평균을 구하시오. 평균점수를 이용하여 A+ ~ F 학점까지 나타내시오.
		프로그램을만들어 보시오.
		총점과 평균은 실수 형으로 할 것
		 */

		Scanner sc = new Scanner(System.in);

		int korScore, engScore, matScore;
		String grade = null;

		System.out.println("국어점수를 입력하시오 : ");
		korScore = sc.nextInt();
		System.out.println("영어점수를 입력하시오 : ");
		engScore = sc.nextInt();
		System.out.println("수학점수를 입력하시오 : ");
		matScore = sc.nextInt();

		double totScore = korScore + engScore + matScore;
		double avgScore = totScore / 3;

		if (avgScore < 100) {
			if (avgScore >= 90) {
				if (avgScore >= 95) {
					grade = "A+";
				} else {
					grade = "A";
				}
			} else if (avgScore >= 80) {
				if (avgScore >= 85) { 
					grade = "B+";
				} else {
					grade = "B";
				}
			} else if (avgScore >= 70) {
				if (avgScore >= 75) {
					grade = "C+";
				} else {
					grade = "C";
				}
			} else if (avgScore >= 60) {
				if (avgScore >= 65) {
					grade = "D+";
				} else {
					grade = "D";
				}
			} else if (avgScore < 60) {
				grade = "F";
			} 
			
			System.out.println("총점 : " + totScore);
			System.out.println("평균 : " + avgScore);
			System.out.println("학점 : " + grade);

		} else {
			System.out.println("입력 범위를 초과 하였습니다.");
		}


	}

}
