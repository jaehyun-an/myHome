/*	
	Date : 14.may.2020
	Author : Jaehyun
	Description : dowhile
	Ver. 1.0
*/
package Java0514;

public class Ex02_DoWhile {

	public static void main(String[] args) {
		// do-while
		/*
		while과 do-while의 차이점
		while : 반복문을 실행하기 전에 조건식 검사
		do- while : 반복문 실행후 조건식 검사
						무조건 반복문 한번은 실행
		
		 do{
		 
		 		반복할 내용
		 
		 	} while (조건식);
		
		 */
		int i = 11;

		do {
			System.out.println("do-while에서 i값 : " + i);
			i++;
		} while (i <= 10);

//		while (i <= 10) {
//			System.out.println("while에서 i 값 : " + i);
//			i++;
//
//		}

	}

}
