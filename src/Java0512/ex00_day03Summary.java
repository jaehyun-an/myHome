package Java0512;

public class ex00_day03Summary {

	public static void main(String[] args) {
		/*
		
		1.랜덤 매소드 :0보다 크거나 같고, 1보다 작은 수를 무작위로 발생시킨다.
		//0.00000 ~ 0.999999.....
		 
		 int rNum = (int)(Math.random() *10) + 1;
		 1부터 10까지의 숫자중 랜던으로 발생
		 int rNum = (int)(Math.random() * N) + S;
		 시작값 : S, 끝값 : N
		 */
		
		double dNum = Math.random();
		System.out.println("dNum : " + dNum);
		/*
		0.88935 (*10)  =>> 8.8935 (int) =>> 8 (+1) =>> 9
		0.33549 (*10)  =>> 3.3549 (int) =>> 3 (+1) =>> 4
		0.13450 (*10)  =>> 1.3450 (int) =>> 1 (+1) =>> 2
		*/
		
		int dice = (int)(Math.random()*6) + 1;
		/*
		0.88935 (*6)  =>> 5.33610 (int) =>> 5 (+1) =>> 6
		0.33549 (*6)  =>> 2.01294 (int) =>> 2 (+1) =>> 3
		0.13450 (*6)  =>> 0.80700 (int) =>> 0 (+1) =>> 1
		*/
		
		/*2. 조건문 switch-case
		switch (조건변수){
		case 변수값 1: 
			해당 조건이 참일때 진행
			break;
			
		case 변수값 2: 
			해당 조건이 참일때 진행
			break;
			
		case 변수값 N: 
			해당 조건이 참일때 진행
			break;
		
		default: 
			case에서 어떤 조건도 맞지 않을때 실행
			break;
		}
		 */
		//break를 쓰지않으면 break가 실행 될때까지  실행
		
		/*
		3. 반복문 for
		
		
		
		for (초기화식; 조건식; 증감식){
			반복할 수행문 
		}
		
		
		
		
		
		
		 */
		
		
		
		
		
		
		
		
	}

}
