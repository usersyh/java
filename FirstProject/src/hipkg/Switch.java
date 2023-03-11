package hipkg;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		//점수를 입력받아 학점을 구하는 프로그램을 작성
		 // 단, 90-100 80-89 70-79 60-69 나머지
		//		  A     B     C     D     F  학점
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("학점 입력:");
//		
//		String num = sc.next();
//		int num2 = Integer.parseInt(num);
//		
//		if(num2>=90) { //다중 if, 중첩 if
//			System.out.println("A학점");
//		}else if(num2>=80) {
//			System.out.println("B학점");
//		}else if(num2>=70) {
//			System.out.println("C학점");
//		}else if(num2>=60) {
//			System.out.println("D학점");
//		}else {
//			System.out.println("F학점");
//		}
		
		//---------------------------------------------------------
		
//		switch(조건) {
//						case 20:(0)  case 3.14(x)  case 90-100 (x)
//		case 90부터100: // 범위x, 정수o, 문자o, 실수x
//			  A학점
//			  break;
//		case 80부터89:
//			  B학점
//			  break;
//			    :
//		case 
//				f학점
//		default:
//				에러:
//				break;
//		}
		
//		System.out.print("입력:");
//		
//		String num1 = sc.next();
//		int num3 = Integer.parseInt(num1);
//		int mok = num3/10;
//		
//		switch(mok) {
//		
//		case 10:
//			//System.out.println("A학점");
//			//break;
//		case 9: //90-99
//			System.out.println("A학점");
//			break;
//		case 8:
//			System.out.println("B학점");
//			break;
//		case 7:
//			System.out.println("C학점");
//			break;
//		case 6:
//			System.out.println("D학점");
//			break;
//		default:
//			System.out.println("F학점");
//		
//		}
		
		//Q) 2023년도 각 월의 날짜수를 출력하는 switch 작성
		// 단, switch 의 특성을 사용하여 출력문장 3종류로 작성
		
		System.out.print("입력:");
		
		String yy = sc.next();
		int yy2 = Integer.parseInt(yy);
		
		switch(yy2) {
			
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31일"); break;
		case 2:
			System.out.println("28일"); break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30일"); break;
		default:
			System.out.println("1-12 만 넣어주세요");
			break;
		
		
		}
		
		
		
		
	}

}
