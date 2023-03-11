package hipkg;

import java.util.Scanner;


public class Printf { //사용자 정의 클래스(userdefined class)

	public static void main(String[] args) {
		
		//점수를 소수 이하 둘쨰자리까지 출력
		//printf의 원리
		// printf("문자열 format ", value, value);
		System.out.printf("뭐라고 %s 말이야 %s 시간이거든 %n", "지금은","쉬는");
		
		double dd = 3.1415926543653321; //%lf x
		System.out.printf("%.14f / %d = %.14f 이라는\n", dd, 2, dd/2);
		
		int tot = 257; //3과목 총점
		double avg = tot/3.0;
		
		System.out.printf("총점=%d  평균=%.2f \n",tot,avg);
		
		//3 과목 총점 점수를 하나 입력 받아 평균을 소수이하 둘쨰자리까지 출력
		
		//자바에서 출력은 sysout
		//입력은 1) File형식으로 2) Scanner 3) GUI
		
		//Scanner는 내장 클래스
		
		Scanner sc1 = new Scanner(System.in);
		//ctrl+shift+o import 자동생성
		
		System.out.print("3과목 총점을 입력하세요");
		int bada = sc1.nextInt();
		double avg2 = bada/3.0;
		System.out.printf("총점=%d  평균=%.2f \n",bada,avg2);
		
		//------------------------------------------------------------
		
		System.out.print("3과목 총점을 입력하세요");
		int bada2 = sc1.nextInt();
		System.out.print("3과목 평균을 입력하세요");
		double avg3 = sc1.nextDouble();
		System.out.printf("총점=%d  평균=%.2f \n",bada2,avg3);
		
		
		//-------------------------------------------------------------
		
		System.out.print("3과목 총점을 입력하세요");
		String bada3 = sc1.next(); //"257" ==> 257
					//int wrap
		int tot5 = Integer.parseInt(bada3);
		
		System.out.print("3과목 평균을 입력하세요");
		String avg4 = sc1.next(); //"90.245" ==. 90.245
		double avg5 = Double.parseDouble(avg4);
		
		System.out.printf("총점=%d  평균=%.2f \n",tot5,avg5);
		
	}

}
