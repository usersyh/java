package hipkg;

import java.util.Scanner;

public class A210_bae_method_call {

	public static void main(String[] args) {
		
		//Q) 10개의 데이터를 배열에 입력 받은 후 method 호출문 2형식을 사용하여
		//	메소드정의문으로 배열전체를 보낸 후 정의문에서 배열의 값을 반복문으로 출력하는
		// 자바 프로그램을 작성
		
		
		
		//call by value(값에 의한 호출)		//C# pass by	
		//call by reference(참조에 의한 호출)
		
		//입력부분
		Scanner sc = new Scanner(System.in);
		
		int [] n = new int[10];
		
		for(int i=0;i<n.length;i++) {
			System.out.print("입력: ");
			n[i] = Integer.parseInt(sc.next());
		}
		
		//정의문 호출
		//배열전달시 알아야할 한줄의 속담은
		//	ㄴ"배열의 대표명은 그배열의 시작번지이다."
		
		hap(n);
		
		
	}

	private static void hap(int[] n) {
		
		int sum=0;
		
		for(int i=0;i<n.length;i++) {
			//누적스텝
			sum=sum+n[i];
		}
		System.out.println("합은: "+sum);
		
		
	}

}
