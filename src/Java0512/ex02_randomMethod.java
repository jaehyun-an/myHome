/*	
	Date : 12.05.2020
	Author : Jaehyun
	Description : randomMetod
	Ver. 1.0
*/
package Java0512;

public class ex02_randomMethod {
	public static void main(String[] args) {
		/*
		 랜덤메소드 : 특정 범위 내에서 숫자하나를 출력해주는 메소드
		 meth.random() = 0보다 크거나 같고, 1보다 작은 숫자를 무작위로 발생 
		 */
		
		
		//double ranNum = Math.random();
		//System.out.println("ranNum : " + ranNum);

		/*1~10사이의 숫자 출력
		ranNum = (int)(Math.random()*10) + 1;
		System.out.println("ranNum : " + (int)ranNum);
		ranNum = (int)(Math.random() * s) + n;
		s = 시작 숫자, n= 끝 숫자;
		*/
		
		
		/*주사위 예제
		int dice;
		dice = (int)(Math.random()*6) + 1;
		System.out.println("dice num : " + (int)dice);
		*/
		
		
		/*
		발표
		int rs;
		rs = (int)(Math.random()*28) + 1;
		System.out.println("금일 발표자는 : " + (int)rs + "번 입니다.");
		*/
		
		//로또
		int num,num1,num2,num3,num4,num5,num6,bnum;
		num1 = (int)(Math.random()*45) + 1;
		num2 = (int)(Math.random()*45) + 1;
		num3 = (int)(Math.random()*45) + 1;
		num4 = (int)(Math.random()*45) + 1;
		num5 = (int)(Math.random()*45) + 1;
		num6 = (int)(Math.random()*45) + 1;
		bnum = (int)(Math.random()*45) + 1;
		
		System.out.println("금주 로또 번호는 : " + num1 + ", " + num2 + ", " + num3 + ", " + num4 + ", " + num5 + ", " + num6 + "번입니다. 보너스 번호는" + bnum + "번 입니다.");
		
		
		
	}
}

