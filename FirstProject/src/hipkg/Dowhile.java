package hipkg;

import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {
		
//		do {
//			문장들;
//			//메뉴가 나올 때 사용한다 그 외에x
//		} while(조건);
		
//     1.짜장 2.짬뽕 선택(1-2) 1,2중 하나를 눌렀으면 맛있게 드세요 라고 출력
//		3-0번까지 누르면 다시 메뉴화면이 나오도록
		
		Scanner sc = new Scanner(System.in);
		
		//System.out.print("메뉴를 선택하세요");
//		int bada;
//		do {
//			System.out.println("1.짜장");
//			System.out.println("2.짬뽕");
//			System.out.print("선택(1-2)");
//			bada=sc.nextInt();
//			
//		}while(bada != 1 && bada != 2); //잘못누르는 동안 반복
//		//제대로 선택한 경우 : 1,2
//		//메뉴가 다시 나오게 하는 경우 : 1,2 외 반대
//		// 즉, !1 and !2 
//		//자바는 중가로를 벗어나면 변수값을 까먹는데
//		System.out.println("맛있게 드세요");
		
		//--------------------------------------------------------
		
//		String bada2;
//		do {
//			System.out.println("1.짜장");
//			System.out.println("2.짬뽕");
//			System.out.print("선택(1-2)");
//			bada2=sc.next();
//			//sc.nextLine(); 한 문장 전체가 들어감
//			
//		}while(!bada2.equals("1") && !bada2.equals("2")); //잘못누르는 동안 반복
//		
//		System.out.println("맛있게 드세요");
		
		String st = new String("ondal"); //String st1 = ondal
		String st2 = new String("ondal");
		
		if(st==st2) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		if(st.equals(st2)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
	}

}
