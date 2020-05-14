/*	
	Date : 12.May.2020
	Author : Jaehyun
	Discription : loopFor
	Ver. 1.0
*/

package Java0512;

public class ex08_loopfor {

	public static void main(String[] args) {
		
		
		// 안녕하세요를 10번 출력해보세요.
		
		/*
		                시작값;    끝값;[++] or [--]
		 반복문 for(초기화식; 조건식; 증감식){
		 	반복할 수행문
		 }
		
		
		int i;
		
		for (i = 1; i<=10; i++) {
		System.out.println(i+ ". 안녕하세요.");
		}
		// i = i (10번) + 1
		System.out.println("반복문 이후 i 값 : " + i);
		 */
		
		/* 예제.1부터 10까지의 합을 출력
		
		*/
		int i;
		int sum = 0;
		
		for (i = 1; i<=10; i++) {
			sum +=i; // sum = sum + i ;
			System.out.println("i : " + i + "\t=>>");
			System.out.println("\tsum : " + sum);
			
		}
		System.out.println("∴1부터 10까지 합은 " +sum);
		
		
		
		
		
		
		
		
		
		

	}

}
