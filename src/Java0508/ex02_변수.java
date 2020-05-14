/*	
Date : 08.05.2020
Author : Jaehyun
Discription : 들여쓰기 및 변수
Ver. 1.0
*/

package Java0508;

public class ex02_변수 {

	public static void main(String[] args) {
	
		
		// 변수 : 프로그램을 실행에 필요한 데이터를 저장하기 위해
		//메모리 공간을 할당하고, 이름을 부여한 것.
		
		//     var         num    =      0     ;
		//[변수 타입][변수명] = [변수값];
		
		int age = 24;

		int age1;    // 변수선언
		age1 = 24; // 변수 초기화
		
	
		
		
		byte bNum1 = -128;
		byte bNum2 = 127;
		int bNum3 = -129;
		int bNum4 = 128;
		
		//4byte = 32bit = -2^31 ~ (2^31)-1 = int = -2,147,483,648 ~ 2,147,483,647
		//8byte = 64bit = -2^64 ~ (2^64)-1 = long = 매우 많다.
		
		int bNum5 = -2147483648;
		int bNum6 = 2147483647;
		long bNum7 = -2147483649L;
		long bNum8 = 2147483648315L;
		
		

		
		
		//float  = 숫자 + f
		//long = 숫자 + L
		
		float pi1 = 3.14f;
		double pi2 = 3.14;
		float pi3 = 2147483648.123456789f;
		double pi4 = 3.14159212346549789215432483256784561;
		
		System.out.println(pi3);
		System.out.println(pi4);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
}
