/*	
	Date : 14.may.2020
	Author : Jaehyun
	Description : Array(배열)
	Ver. 1.0
*/
package Java0514;

public class Ex04_Array {
	
	public static void main(String[] args) {
//		//배열(Arrey0 : 같은 (변수)타입의 데이터를 하나의 변수에 저장하는 구조
//		
//		// 배열 선언
//		// (1) 타입 [] 배열이름 ;
//				int[] num1;
//		// (2) 타입 배열이름 [];
//				int num2[];
//		
//		// 변수 선언 
//		// int i;
//		// (변수 타입) (변수 명);
//		
//		// 배열 초기화
//		num1 = new int[] {10,20};
//		System.out.println("첫번째 배열 : " + num1[0]);
//		System.out.println("두번째 배열 : " + num1[1]);
//				
//				
//		//변수 초기화
//		// i = 0;
//		//변수명 = 변수값;
//				
//		//배열 선언 초기화
		
//		System.out.println("첫번째 집(index-0) : " + num3[0]); //index : array속 값의 순저 ex.[0] = 10, [11] = 11 etc
//		System.out.println("두번째 집(index-1) : " + num3[1]);
//		System.out.println("세번째 집(index-2) : " + num3[2]);
//		System.out.println("네번째 집(index-3) : " + num3[3]);
//		//System.out.println("다섯번째 집(index4) : " + num3[4]); //5번째 집이 없어서 들어가고 싶어도 못들어감
//		
//		// 변수 선언 초기화
//		// int j = 0;
//		
//		// int k;
//		
//		char ch = ' ' ;
//		String str = " ";
//		
//		int[] a = null;
//		int b[] = {};
//		
//		// 배열 값 입력 시 타입을 맞춰서 입력
//		char[] ch1 = {'안', '재', '현'};
//		String[] str1 = {"인덱스1", "인덱스2", "인덱스3"};
//		
//		System.out.println("String타입 str1에서 2번째 집에 저장된 값 : " + str1[1]);
//		
//		
		
		
//		System.out.println("num3[]의 길이 : " + lNum3); //총 개수는 4개
//		
		
		
		
		// *예제 : for 문을 이용해 num3의 모든값을 출력
		
		int num3[] = {10, 11, 12 ,13};
		int lNum3 = num3.length; //length : 배열의 길이를 나타낸다.
		
		for (int i=0; i<=lNum3 - 1; i++) {
			System.out.println(num3[i]);
		}
		
		// * 예제2 : 국, 영,수 점수를 저장하고 모든값의 평균과 총점을 구하여라.
		
		int[] numbers = {100, 95, 90};
		int tot = 0;
		
		for (int i=0; i<numbers.length; i++) {
			 tot += numbers[i];
			}
		int avg = tot /numbers.length;
		
			System.out.println("국어 점수는 : " + numbers[0] + "점");
			System.out.println("영어 점수는 : " + numbers[1] + "점");
			System.out.println("수학 점수는 : " + numbers[2] + "점");
			System.out.println("총합 점수는 : " + tot + "점");
			System.out.println("평균 점수는 : " + avg + "점");
			
				
				
				
				
				
				
				
				
				
				
				
				
		
	}

}
