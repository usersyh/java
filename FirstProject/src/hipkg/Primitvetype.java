package hipkg;

public class Primitvetype {

	public static void main(String[] args) {
		
		//primitive type
		//reference type
		
		// primitive type(stack, 기본형 8가지) => 자료type, 자료길이
		// int : 정수, 4byte 		**(-2147483648 ~ +2147483647)
		// byte : 정수타입, 1byte **(-128 ~ + 127)
		// short : 정수, 2byte	**(-32768~ + 32767)
		// long : 정수, 8byte		
		// double : 실수, 8byte
		// float : 실수, 4byte
		// char : 문자형, 2byte
		// boolean : 논리형, 3byte (true,false)
		
		//------------------------------------------------------------------------------------------
		
		//reference type(heap)
		// String : 문자열, 배열...
		
		int aa=100;
		byte bb=100;
		short cc=100;
		long dd=100;
		long dd2=2147483648l; //L은 문자아님 숫자
		double ee=100.78;	//배정도 실수 기본은 double
		float ff=100.78F;	//단정도 실수
		float ff2=100.78f;
		
		System.out.println(10/3.0);
		System.out.println(10/3.0f);
		char hh='A';
		//char hh2="A"; heap 메모리로 들어감
		//참조타입 String hh3="A"; //"A"는 heap 메모리에 들어가고, hh3는 stack 메모리에 들어간다 (메모리에는 번지주소가 들어가서 찾아간다)
		boolean ii=true;
		boolean ii2=false;
		
		 
		//===================================================================
		
		/*
		 * if() { ==> head
		 * 
		 * STMT; } //body
		 * 
		 * //if 1형식
		 * 
		 * if(i>3) { k=5; }
		 * 
		 * 
		 * // if 2형식
		 * 
		 * if(i>3) { //block
		 * 
		 * k=5; }else { p=7; }
		 */
		
		
		
	}

}
