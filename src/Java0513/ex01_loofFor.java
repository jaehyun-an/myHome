/*	
	Date : 13.may.2020
	Author : Jaehyun
	Description : loopFor
	Ver. 1.0
*/
package Java0513;

public class ex01_loofFor {
	
	public static void main(String[] args) {

		/*
			ex)  int i = 1     ┌→조건 충족 시 반복 종료 
				↓				⑤┌──┐
		for (①초기화식; 조건식; 증감식){
			   	 ② true 일 때 ↓	   ↑④
					③반복할 수행문 ┘		
		}
		*/
		int i;
		
		for (i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	
		System.out.println("반복문 종료후 i값 : " + i);
		
		
		
		
	}

}
