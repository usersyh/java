package hipkg;

import java.util.Scanner;

public class A250_hanman_game {

	public static void main(String[] args) {
		
		//Q) picture를 문자열 배열에 넣고 글자를 알아맞추는 hanman program을 작성하시오
		//	단, 13번 안에 맞추어야 한다.
		
		//참고 char배열과 String배열
		
		Scanner sc = new Scanner(System.in);
		
		String [] bae = {"p","i","c","t","u","r","e"};
		//char [] ch = {'p','i','c','t','u','r','e'};
		//double [] dou = {3.6,2.1,3.1};
		String [] aa = {"_","_","_","_","_","_","_"};
		
		//_ _ _ _ _ _ _ 
		
		//_ i _ _ _ _ _
		
//		for(int j=0;j<aa.length;j++) {
//			System.out.print(aa[j]+" ");
//		}
//		System.out.println();
		String ch;
		int cnt = 0; 
		
		for(int i=0;i<13;i++) {
			System.out.print("입력하시오: ");
			ch = sc.next();
			
			for(int j=0;j<bae.length;j++) {
				if(ch.equals(bae[j])) {
					aa[j]=ch;
					cnt+=1;
				}
				
				System.out.print(aa[j]+" ");
				
			}
			
			}
			System.out.println();
		}

//		
		
//		String [] moonja={"p","i","c","t","u","r","e"};
//        String [] jool={"_","_","_","_","_","_","_"};
//        String ip;
//    
//        int cnt,sw=0;//초기치및 선언 은 나중에 
//        
//        for(int j=0; j<7;j++) //처음 줄 출력   _______
//            System.out.print(jool[j]);
//        System.out.println();//줄바꿈
//        
//        Scanner scan1=new Scanner(System.in);
//        
//        
//        
//        
//        
//        
//        for(int i=1;i<=13;i++){ //13번 체크 
//              cnt=0;  
//              System.out.println("예상글자입력:"); 
//               ip=scan1.next(); ////////          
//
//          for(int j=0; j<7;j++){ //예상글자가 문제단어에 있어?
//                   if(ip.equals(moonja[j]))  // ==  은 번지비교 
//                                jool[j]=moonja[j];
//          }            
//          for(int j=0; j<7;j++) //있건 없건 한줄 출력해
//               System.out.print(jool[j]);//줄출력        
//          System.out.println("\t"+i+"번시도");
//         
//          for(int j=0; j<7;j++){ //문제단어와 줄글자가  7개 같아? 
//                    if(jool[j].equals(moonja[j]))
//                                 cnt++;
//          }           
//          if(cnt == 7){ //그러면 딱 맞추었으니 끝내자
//               System.out.println("굿드");
//               sw=1;/////////////////
//                   break;           
//          }
//       }//13-for-end 
//          if(sw==0)
//               System.out.print("다음기회에");
//         
		
	}

//}
