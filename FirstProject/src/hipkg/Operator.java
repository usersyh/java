package hipkg;

public class Operator {

	public static void main(String[] args) {
		
		//산술연산자
			// + - * / 	%(나머지연산자)
		System.out.println(10*3);
		System.out.println(10/3);
		System.out.println(10/3.0);
		// 정수/정수 => 정수
		// 정수/실수 => 실수
		// 실수/정수 => 실수
		// 실수/실수 => 실수
		System.out.println(10%3);
		
		// 1+2+3+ ... +99+100
		//100+99+...+1
		//------------------------------
		//101+101+ +101
		//(101*100)/2
		// n(n+1)/2
		
		//관계연산자
		// > < >= <= == !=
		System.out.println(10>3); //true
		System.out.println(10==3);
		System.out.println(10!=3);
		
		// 산 > 관 > 논 
		//10이 3의 배수
		System.out.println(10%3 == 0);
		
		//논리연산자	(and or not)
		//		&&	||	!
		System.out.println(10>3 && 10<5);
		System.out.println(10>3 || 10<5);
		System.out.println(10>3 && !(10<5));
		
		
		
		
		
		
		
	}

}
