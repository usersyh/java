package hipkg;

import java.util.Scanner;

public class Bmi {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //한번만 쓰고 시작
		
		System.out.print("키: ");
		int ki = sc.nextInt(); //180
		
		System.out.print("몸무게: ");
		int mom = sc.nextInt(); //65
		
		//bmi = 체중/키의 제곱
		
		double mki = ki / 100.0; //1.8
		//double bmi = mom / (mki*mki);
		double bmi = mom/Math.pow(mki, 2); //mki를 제곱
		
		System.out.println(bmi);
		//30이상 비만 18.5~25 보통 		저체중
		String result;
		
		if(bmi>=30.0) {
			result="비만";
		}else if(bmi>=25.0) {
			result="보통";
		}else if(bmi>=18.5) {
			result="보통";
		}else{
			result="저체중";
		}
		
		System.out.println(result);
		
		
		
	}

}
