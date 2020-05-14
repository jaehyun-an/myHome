/*	
	Date : 13.may.2020
	Author : Jaehyun
	Description : 별찍기 예제
	Ver. 1.0
*/
package Java0513;

public class ex06_forStar {

	public static void main(String[] args) {
		// *
		// **
		// ***
		// ****
		// *****

		
		String sum="";
		
		for (int i =1;i<=5; i++) {
			System.out.println(sum+="*");//sum=sum+*

		}
		
		
		
		for (int i = 1; i<=5; i++) {
			
			for (int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
