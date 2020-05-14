/*	
	Date : 12.May.2020
	Author : Jaehyun
	Description : swtichCaseExample1
	Ver. 1.0
*/

package Java0512;

import java.util.Scanner;

public class es05_switchCase02 {

	public static void main(String[] args) {
		// switchCase 문을 사용해 월별 날짜 계산하기

		int month;
		int day = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("월을 입력하세요 : ");
		month = sc.nextInt();

		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			day = 31;
			break;

		case 4: case 6: case 9: case 11:
			day = 30;
			break;

		case 2:
			day = 28;
			break;

		default:
			System.out.println("값을 잘못 입력 하였습니다.");	
		}
		
		if (month <= 12 && month >= 1) 
			System.out.println("입력하신 " + month + "월은 " + day + "일 까지입니다.");
			
		}

}
