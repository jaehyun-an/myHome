/*	
	Date : 11.05.2020
	Author : Jaehyun
	Discription : 조건문(ifElse)
	Ver. 1.0
*/


package Java0511;

public class ex10_ifElse {

	public static void main(String[] args) {
		/*
		 if (조건식) {
		 	조건식이 참일 경우 실행
		 } else{
		 	조건식이 거짓일 경우 실행
		 }
		 */
		/*
		boolean condition = true;
		System.out.println("if문 시작");
		
		if(condition) {
			System.out.println("조건만족");
			System.out.println("condition이" + condition + "일 때");
		} else {
			System.out.println("조건 불만족");
			System.out.println("condition이" + !condition + "일 때");
		}
		
		System.out.println("if문 종료");
		
				
		int num1 = 5;
		int num2 = 3;
		if (num1 > num2) {
			System.out.println("num1이 크다.");
		} else {
			System.out.println("num2가 크다.");
		}
		
	
		//Q. 현재 나이가 10살일때, 나이가 8살 이면 학교에 갑니다. 그렇지 않으면 가지 않습니다.
		
		int age = 10;
		
		if (10>=8) {
			System.out.println("학교를 갑니다.");
		} else {
			System.out.println("학교를 가지 않습니다.");
		}
		
		*/
		
		String str1 = "java";
		String str2 = "java";
		
		if (str1.equals(str2)) {
			System.out.println(" 두 문장은 같다");
		} else {
			System.out.println("다르다");
		}
		
		
	}

}
