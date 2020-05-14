package Java0508;

public class ex02_CompareOperation {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 3;
		boolean result;
		/*
		 * result = num1 > num2; System.out.println(num1 + ">" + num2 + "=" + result);
		 * 
		 * result = num1 < num2; System.out.println(result);
		 * 
		 * result = num1 != num2; System.out.println(num1 + "≠" + num2 + " " + result);
		 */

		String str1 = "java";
		String str2 = "java";
		String str3 = "자바";

		result = str1.equals(str2);
		System.out.println("str1과 str2의 문자비교 : " + result);

		result = str1.equals(str3);
		System.out.println("str1과 str3의 문자비교 : " + result);
	}

}
