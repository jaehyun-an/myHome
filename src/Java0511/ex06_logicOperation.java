/*	
	Date : 11.05.2020
	Author : Jaehyun
	Discription : 논리 연산자(logicOperation)
	Ver. 1.0
*/
package Java0511;

public class ex06_logicOperation {

	public static void main(String[] args) {
		// 논리 연산자 - AND연산, OR연산, NOT연산
		
		// AND 연산 : &&
		// A && B 일 때, A와 B 모두 True 값 일 때 True
		// A 또는 B 중에 하나라도 False면 False

		// OR 연산 : || 
		// A || B 일 때 하나라도 True가 있으면 True
		// A, B 모두 False여야 결과가 False
		
		// NOT 연산 :!
		// boolean 변수 앞에 사용하면 True → False, False → True
		
		boolean result;
		
		/*
		//and
		result = true && true;
		System.out.println("true && true : " + result); // = True
		
		result = true && false;
		System.out.println("true && false : " + result); // = false
		
		result = false && false;
		System.out.println("false && false : " + result); // = false
		
		result = (5>3) && (3>1);
		System.out.println("(5>3) && (3>1) : " + result); // = True
		
		result = (5>3) && (3<1);
		System.out.println("(5>3 && (3<1) : " + result); // = True
		*/
		
		/*
		// or
		result = true || true;
		System.out.println("true || true : " + result); // = True
		result = true || false;
		System.out.println("true || false : " + result); // = True
		result = false || false;
		System.out.println("false || false : " + result); // = false
		*/
		
		//not
		result = true;
		
		result = !result;
		System.out.println("!result : " + result); // = false
		result = !result;
		System.out.println("!!result : " + result); // = True
		// -(-1) = +1
		// !(!result) = result
		
		result = !false;
		System.out.println("!false : " + result); // = true
		
		
		
	}

}
