/*	
	Date : 14.may.2020
	Author : Jaehyun
	Description : do-while문 예제 (Up&Down 게임)
	Ver. 1.0
*/
package Java0514;

import java.util.Scanner;

public class Ex03_DoWhileEx {

	public static void main(String[] args) {
		//3번안에 맞추면 통과
		//그 이후는 벌칙
		
		
		int answer = (int)(Math.random() * 45) + 1; // 정답을 1~45수자중에 랜덤으로 생성
		int input = 0; // 입력값 
		int count = 0; // 입력 횟수
		
		boolean run = true;
		
		Scanner sc = new Scanner (System.in); //입력이 가능하게 해줌
		System.out.println("Up & Down Game 시작!");  //시작
		
		do { // 우선 한번 실행
			System.out.println("1부터 45까지 숫자 중 하나를 고르세요."); 
			System.out.print(">>");
			input = sc.nextInt(); //원하는 숫자를 입력
			count++; // 원하는 숫자를 입력할때마다  횟수 상승
			
			if (answer >input) { //만약 정답이 더 크면 출력
				System.out.println("Up! 더 큰 수를 말하세요");
			} else if (answer < input) { //만약 정답이 더 작으면 출력
				System.out.println("Down! 더 작은 수를 말하세요");
			} else { //만약 정답이면 출력
				System.out.println("정답은 "+ answer + "입니다."); //정답 표시
				System.out.println("시도한 횟수는 " + count + "번 입니다."); //횟수 표시
				if (count <= 3) { //만약  횟수가 3번보다 같거나 작으면 
					System.out.println("축하합니다. 통과하셧습니다."); //출력
				} else { //만약  횟수가 3번보다 작지 않으면
					System.out.println("벌칙입니다."); //출력
				}
				run = false; // run을 false로 바꿔줌
			}
			
		} while(run); //반복문을 종료

	}

}
