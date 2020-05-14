/*	
	Date : 13.may.2020
	Author : Jaehyun
	Description : s부터 n까지의 합 구하기
	Ver. 1.1
*/
package Java0513;

import java.util.Scanner;

public class ex02_forSnumToLnum {
	
	public static void main(String[] args) {
		//for 문을 이용해서 두 개의 정수 (시작값, 끝값)를 입력 받아 총합을 구하는 프로그램을 만들어 보시오.

		/*
		int i;
		int s;
		int n;
		int tot = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("시작값 : ");
		s = sc.nextInt();
	
		System.out.print("끝값 : ");
		n = sc.nextInt();
	
		
		for (i = s; i <= n; ++i) {
			tot+=i;		
		}
		
		
		System.out.println(s + "부터" + n + "의 합은 : " + tot);
		*/ //ver 1.0
		
		
		int i;
		int s;
		int n;
		int tot = 0;
			
		Scanner sc = new Scanner(System.in);
		System.out.print("시작값 : ");
		s = sc.nextInt();
	
		System.out.print("끝값 : ");
		n = sc.nextInt();
		
		for (i = s; i <= n; i++) {
			tot+=i;		
			//System.out.println(i);
			//└12345678910
			//System.out.println(i + "+");
			//└1+2+3+4+5+6+7+8+9+10+
			
			if (i < n) {
				System.out.print(i + "+");
			} else {
				System.out.print(i + "=" + tot);
			}
		}
		System.out.println("\n" + s + "부터" + n + "까지의 합은 : " + tot);
		
		
		
		
		
		
		
		
	}
}
