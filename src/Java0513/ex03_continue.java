/*	
	Date : 13.may.2020
	Author : Jaehyun
	Description : continue 문 
	Ver. 1.0
*/
package Java0513;

public class ex03_continue {
	
	public static void main(String[] args) {
		//continue문은 반복문과 함께 사용
		//반복문 안에서 continue문을 만나면 어떠한 문장도 실행하지 않고,
		//for문의 증감식을 실행한다.
		
		/*
		 
		 
		
		for (①초기화식; ②조건식; 증감식){
											  ↑④
				③	특정조건─────┘
					continue; ┐
								 X
								 ↓
					반복문 수행;
		}
		
		 */
		/*
		for (int i=1; i<=10; i++) {
			if(i%2 == 0) {
				continue;
			} //2 4 6 8 10
			System.out.print(i + " ");
			//1 3 5 7 9
		}
		*/
		
		//1부터 100까지중 짝수의 합을 구하시오.
		
		int i = 0;
		int sum = 0; 
		
		for (i=1; i<=100; i++) {
			if(i%2 == 1) {
				continue;
			} else if (i < 100) {
				System.out.print(i + "+");
			} else {
				System.out.print(i + "=");
			}
			sum+=i;
		}
		System.out.print(sum);
		
		
		
		
	}

}
