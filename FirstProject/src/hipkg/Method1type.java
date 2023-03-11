package hipkg;

public class Method1type {

	public static void main(String[] args) {
		
		//Q) 2023년이 윤년인지 알아내는 프로그램 작성
		
		//윤년 : 365.2422일
			//0.2422*4 = 0.9688 = 약 1일
			//100년에 평년으로
			//400년에 1번은 윤년으로
		
		//윤년은?
		// 4로 나누어 떨어지 "고"
		// 100으로 나누어 떨어지지 않 "거나"
		// 400으로 나누어 떨어지는 해
		
		//Q) 2023년이 윤년인가
		// 4로 나누어 떨어지고 100으로 나누어 떨어지지 않거나 400으로 나누어 떨어지는 해
		
		int i=2023;
		//if(윤년)
		if(i%4==0 && i%100!=0 || i%400==0) { //윤년
			System.out.println(i+" 해는 윤년");
		}else {
			System.out.println(i+" 해는 평년");
		}
		
		
		//---------------------------------------------------------
		
		//Q) 위 소스를 메소드 1형식으로 
		System.out.println("2023년이 윤년인지 평년인지 알아보기");
		
		yoonnyuen();
		
		//Q) 위 소스를 메소드 2형식으로
		//kajaYoonuen(2020,"아아");
		kajaYoonuen(2020);
		
		//Q) 메소드 3형식
//		String bada = ddokaja();
//		// String bada = "2023년 윤년평년 처리 끝";
//		System.out.println(bada);
		
		System.out.println(ddokaja());
		
		
		
		
		
	}

	private static String ddokaja() {
		
		int i=2023;
		//if(윤년)
		if(i%4==0 && i%100!=0 || i%400==0) { //윤년
			System.out.println(i+" 해는 윤년");
		}else {
			System.out.println(i+" 해는 평년");
		}
		
		return "2023년 윤년평년 처리 끝";
		//반드시 return type 필요
		
	}

	private static void kajaYoonuen(int i) {
		
		if(i%4==0 && i%100!=0 || i%400==0) { //윤년
			System.out.println(i+" 해는 윤년");
		}else {
			System.out.println(i+" 해는 평년");
		}
		
		
		
	}

	private static void yoonnyuen() {
		
		int i=2023;
		//if(윤년)
		if(i%4==0 && i%100!=0 || i%400==0) { //윤년
			System.out.println(i+" 해는 윤년");
		}else {
			System.out.println(i+" 해는 평년");
		}
		
	}

}
