/*	
	Date : 11.05.2020
	Author : Jaehyun
	Discription : 입력(scanner)
	Ver. 1.0
*/

package Java0511;

import java.util.Scanner;
// 두번째
//└ Scanner 클래스는 java.util 패키지에 있는 입력 클래스

public class ex08_Scanner {

	public static void main(String[] args) {
		// 첫번째
		// 스캐너를 사용하기 위해 스캐너 객체 확인
		Scanner sc = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		
		String name;
		int age;
		String address;
		
		
		
		System.out.println("이름을 입력 하세요. - ");
		name = sc.next();
		// 세번째
		// 변수에 입력한 값을 담는다.
		
		/*System.out.println("나이를 입력 하세요. - ");
		age = sc.nextInt.trim();
		*/
		System.out.println("주소를 입력 하세요. - ");
		address = sc.nextLine();
		// trim() = 앞, 뒤 공백 제거
		
		
		System.out.println("=====출력내용=====");
		System.out.println("입력한 이름 : "+ name);
		/*System.out.println("입력한 나이 : "+ age);*/
		System.out.println("입력한 주소 : "+ address);
		
		
		/*
		System.out.println("println");
		 - ln = line의 약자, 줄바꿈
		System.out.print("print");

		*/
		
		
		
	}

}
