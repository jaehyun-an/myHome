/*	
	Date : 14.may.2020
	Author : Jaehyun
	Description : while문 예제2
	Ver. 1.1
*/
package Java0514;

import java.util.Scanner;

public class Ex01_WhileEx {

	public static void main(String[] args) {

		int num = 0;
		int pmoney = 0;
		int mmoney = 0;
		int sum = 0;
		int cNum = 0;

		while (num != 4) {
			Scanner sc = new Scanner(System.in);
			System.out.println();
			System.out.println("────────────────");
			System.out.println("1.입금 | 2.출금 |3.잔고 | 4.종료");
			System.out.println("────────────────");
			System.out.print(">>");
			num = sc.nextInt();

			switch (num) {
			case 1:
				System.out.print("입금액 >>");
				pmoney = sc.nextInt();
				if (pmoney >= 1) {
					System.out.println("입금하실 금액은 " + pmoney + "원 입니다.");
					System.out.println("맞으면 1 틀리면 2를 입력해 주세요.");
					System.out.print(">>");
					cNum = sc.nextInt();
					if (cNum == 1) {
						System.out.println("입금하신 금액은 " + pmoney + "원 입니다.");
						sum = sum + pmoney;
						System.out.println("현재 잔액은 " + sum + "원 입니다.");
						System.out.println();
						System.out.println("이용해 주셔서 감사합니다.");
						System.out.println();
						System.out.println("메뉴로 돌아가시려면 1번 종료하시려면 2번을 눌러주세요.");
						System.out.print(">>");
						cNum = sc.nextInt();
							if (cNum == 2) {
								num = 4;
								break;
							} else if(cNum == 1) {
								System.out.println("메뉴로 돌아갑니다.");
							} else {
								System.out.println("잘못 입력 하였습니다.");
								System.out.println("메뉴로 돌아갑니다.");
							}
					} else {
						System.out.println("이용해 주셔서 감사합니다.");
						System.out.println();
						System.out.println("메뉴로 돌아가시려면 1번 종료하시려면 2번을 눌러주세요.");
						System.out.print(">>");
						cNum = sc.nextInt();
							if (cNum == 2) {
								num = 4;
								break;
							} else if(cNum == 1) {
								System.out.println("메뉴로 돌아갑니다.");
							} else {
								System.out.println("잘못 입력 하였습니다.");
								System.out.println("메뉴로 돌아갑니다.");
							}
					}
				} else {
					System.out.println("예금 할 수 없는 금액입니다.");
					System.out.println();
					System.out.println("메뉴로 돌아가시려면 1번 종료하시려면 2번을 눌러주세요.");
					System.out.print(">>");
					cNum = sc.nextInt();
						if (cNum == 2) {
							num = 4;
							break;
						} else if(cNum == 1) {
							System.out.println("메뉴로 돌아갑니다.");
						} else {
							System.out.println("잘못 입력 하였습니다.");
							System.out.println("메뉴로 돌아갑니다.");
						}
				}
				break;
			case 2:
				System.out.print("출금액 >> ");
				mmoney = sc.nextInt();
				if (sum < mmoney) {
					System.out.println("잔액이 부족합니다.");
					System.out.println();
					System.out.println("메뉴로 돌아가시려면 1번 종료하시려면 2번을 눌러주세요.");
					System.out.print(">>");
					cNum = sc.nextInt();
						if (cNum == 2) {
							num = 4;
							break;
						} else if(cNum == 1) {
							System.out.println("메뉴로 돌아갑니다.");
						} else {
							System.out.println("잘못 입력 하였습니다.");
							System.out.println("메뉴로 돌아갑니다.");
						}
				} else {
					System.out.println("출금하실 금액은 " + mmoney + "원 입니다.");
					System.out.println("맞으면 1 틀리면 2를 입력해 주세요.");
					System.out.print(">>");
					cNum = sc.nextInt();
					if (cNum == 1) {
						System.out.println("출금하신 금액은 " + mmoney + "원 입니다.");
						sum = sum - mmoney;
						System.out.println("현재 잔액은 " + sum + "원 입니다.");
						System.out.println("이용해 주셔서 감사합니다.");
						System.out.println();
						System.out.println("메뉴로 돌아가시려면 1번 종료하시려면 2번을 눌러주세요.");
						System.out.print(">>");
						cNum = sc.nextInt();
							if (cNum == 2) {
								num = 4;
								break;
							} else if(cNum == 1) {
								System.out.println("메뉴로 돌아갑니다.");
							} else {
								System.out.println("잘못 입력 하였습니다.");
								System.out.println("메뉴로 돌아갑니다.");
							}
					}
				}
				break;
			case 3:
				System.out.println("현재 잔액은 " + sum + "원 입니다.");
				System.out.println("메뉴로 돌아가시려면 1번 종료하시려면 2번을 눌러주세요.");
				System.out.print(">>");
				cNum = sc.nextInt();
					if (cNum == 2) {
						num = 4;
						break;
					} else if(cNum == 1) {
						System.out.println("메뉴로 돌아갑니다.");
					} else {
						System.out.println("잘못 입력 하였습니다.");
						System.out.println("메뉴로 돌아갑니다.");
					}
				break;
			case 4:
				System.out.println("종료됩니다.");
				System.out.println("이용해 주셔서 감사합니다.");
				num = sc.nextInt();
				break;
			default:
				System.out.println("다시 선택하십시오.");
				break;
			}
		}
		System.out.println("종료됩니다.");
		System.out.println("이용해 주셔서 감사합니다.");
	}
}
