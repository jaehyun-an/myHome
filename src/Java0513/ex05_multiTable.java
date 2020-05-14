/*	
	Date : 13.may.2020
	Author : Jaehyun
	Description : multiTable 구구단
	Ver. 1.0
*/
package Java0513;

public class ex05_multiTable {

	public static void main(String[] args) {
		// 중첩 for 문을 이용하현 구구단을 작성하시오
		// 2단 ~ 9단
		/*
		int tot = 0;
		
		for (int i = 1; i <= 9; i++) {
		
			for (int j = 2; j <= 9; j++) {
				tot =  i * j;
				System.out.print(j + "*" + i + "=" + tot+);
				System.out.print("\t");
			}
			System.out.println();
		}
		 */
		
		//홀수단만 출력하기
		int i;
		int j;
		
		for (i = 1; i <=9; i++) {
			for (j = 2; j <=9; j++) {
				if (j % 2 == 0) {
					continue;
				}
				System.out.print(j + " x " + i + " = " + i*j);
				System.out.print("\t");
			
			}	System.out.println();

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
