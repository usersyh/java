package hipkg;

public class A200_bae {

	public static void main(String[] args) {
		
		//Array(배열) : 기억창고를 한꺼번에 잡아주는 것
				// - 고정길이 타입, one data type
				// - 아파트 호수: 첨자, index
		
		
		int [] jum=new int[10]; // C# 배열하고 같다
		
		//int jum[]=new int[10];
		jum[0]=100;
		System.out.println(jum[0]);
		jum[8]=20;
		jum[9]=200;
		//jum[10]=300;
		
		//1차원 배열
		int [] kab = {10,20,30,40,50}; //new가 생략된걸 자동으로 인식
		
		for(int i=0;i<5;i++) {
		//for(int i=0;i<=4;i++) {
			System.out.print(kab[i]+"\t");
		}
		System.out.println();
		
		for(int i=0;i<kab.length;i++) {
			System.out.print(kab[i]+"\t");
		}
		System.out.println();
		
		for (int i = 0; i < kab.length; i++) { //for만 치고 ctrl+스페이스
			System.out.print(kab[i]+"\t");
		}
		System.out.println();
		
		
		
	}

}
