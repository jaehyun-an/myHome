/*	
	Date : 13.may.2020
	Author : Jaehyun
	Description : while문 예제
	Ver. 1.0
*/
package Java0513;

public class ex11_whileEx {

	public static void main(String[] args) {
		// while 문을 이용해서 주사위를 던졌을 때 5가 나오면 종료하는 프로그램을 만드시오.
		
		/*
		int dice = 0;
		
		while (dice != 5) { dice = (int)(Math.random()*6) + 1;
		System.out.println("dice num : " + (int)dice); }
		 */

		boolean run = true;
		int cnt = 0;

		while (run) {
			int dice = (int) (Math.random() * 6) + 1;
			cnt++;
			System.out.println("dice num : " + (int) dice);
			if (dice == 5) {
				run = false;
			}	
		}
		System.out.println("\n던진횟수 : " + cnt);
	}

}
