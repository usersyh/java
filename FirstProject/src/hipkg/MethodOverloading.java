package hipkg;

public class MethodOverloading {

	public static void main(String[] args) {
		
		//overloading : 메소드 중복	
				//	kaja()	kaja(20) (o)
				
				// int aa=20;
				//int bb=30;
				
				//kaja(30.5,20.7)
				
				// 호출문 kaja(20,30.7)
				//		kaja(20,5)
				
				// 정의문1 kaja(int x, int y)
				//	   2 kaja(int u, double v)
				
				
				//1) 메소드 이름이 같아야
				//2) 인자의 타입이 다르거나 갯수가 달라야 한다
				//호출 kaja(20) 	argument, 인자
				//정의문 ... kaja(int i)	parameter, 매개변수
				// 이유: 가독성을 위하여
				
				
				//overriding : 재정의 (상속에 있어서)
		
		
		
		kaja();
		kaja2(20);
		kaja(20,50);
		kaja(20,7.8f);
		
	}

	private static void kaja(int i, double d) {
		// TODO Auto-generated method stub
		
	}

	private static void kaja(int i, int j) {
		// TODO Auto-generated method stub
		
	}

	private static void kaja2(int i) {
		// TODO Auto-generated method stub
		
	}

	private static void kaja() {
		
	}

}
