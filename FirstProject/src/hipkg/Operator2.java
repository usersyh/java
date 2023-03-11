package hipkg;

public class Operator2 {

	public static void main(String[] args) {
		
		//기억창고 4가지       barbage idea
		// stack memory   용량이 한정
		// static 안 없어지고 남아있음
		// code   소스코드
		// heap   문자열하고 배열
		
		
		
		int aaa=100;
		aaa=aaa+1; //101
		aaa++;	//102	후치연산자	단독으로 사용 할 때는 같다
		++aaa;	//103	전치 연산자
		
		System.out.println(aaa++); //103출력 104가 됨
		System.out.println(++aaa); //105가되고 105출력
		
		
	}

}
