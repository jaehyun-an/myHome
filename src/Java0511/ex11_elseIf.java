/*	
	Date : 11.05.2020
	Author : Jaehyun
	Discription : 조건문(else if)
	Ver. 1.0
*/

package Java0511;

public class ex11_elseIf {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 5;
		
//		if (num1 > num2) {
//			System.out.println("num1이 크다.");
//		} else {
//			System.out.println("num2가 크다.");
//		}
		
		if (num1 > num2) {
			System.out.println("num1이 크다.");
		} else if (num1 < num2) {
			System.out.println("num2가 크다.");
		} else {
			System.out.println("num1과 num2가 같다.");
		}
		
		/*
		 if(조건식1){
		 	조건식 1이 참일때 실행
		 } else if(조건식2){
		 	조건식 2가 참일때 실행
		 } else {
		 	조건식이 모두 거짓일때 실행
		 }
		  */

	}

}