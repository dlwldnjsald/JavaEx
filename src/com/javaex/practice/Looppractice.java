//101페이지//

//package com.javaex.practice ;
//public class practicesLoop {
//	
//	public static void main(String[] args) {
////		int num = 1,dan = 2;
//			//1부터 9까지 while 루프loop
//			//단*num 출력
//		while(num <= 9) {
//				System.out.println(dan + "*" + num + "=" + (dan * num) );
//				num += 1; //num = num+1 과 같은 식_num에서 자연스레 1이 연속 추가되어 9까지 나열해서 구구단 만들어주게됨
//				
//		}	
//		System.out.println("                                        ");
//			
//		int num1 = 1,dan1 = 3; //새로운 num1,dan1변수 만들어줘야함 아니면 앞의 변수와 겹침
//		while(num1 <= 9) {
//			System.out.println(dan1 + "*" + num1 + "=" + (dan1 * num1) );
//			num1 += 1; //num = num+1 과 같은 식_num에서 자연스레 1이 연속 추가되어 9까지 나열해서 구구단 만들어주게됨
//		}	
//		System.out.println("                                        ");
//			
//		int num2 = 1,dan2 = 4; //새로운 변수 만들어줘야함 아니면 앞의 변수와 겹침
//		while(num2 <= 9) {
//			System.out.println(dan2 + "*" + num2 + "=" + (dan2 * num2) );
//			num2 += 1; //num = num+1 과 같은 식_num에서 자연스레 1이 연속 추가되어 9까지 나열해서 구구단 만들어주게됨
//		}	
//		System.out.println("                                        ");
//			
//		int num3 = 1,dan3 = 5; //새로운 변수 만들어줘야함 아니면 앞의 변수와 겹침
//		while(num3 <= 9) {
//			System.out.println(dan3 + "*" + num3 + "=" + (dan3 * num3) );
//			num3 += 1; //num = num+1 과 같은 식_num에서 자연스레 1이 연속 추가되어 9까지 나열해서 구구단 만들어주게됨
//		}
//		System.out.println("                                        ");
//			
//		int num4 = 1,dan4 = 6; //새로운 변수 만들어줘야함 아니면 앞의 변수와 겹침
//		while(num4 <= 9) {
//			System.out.println(dan4 + "*" + num4 + "=" + (dan4 * num4) );
//			num4 += 1; //num = num+1 과 같은 식_num에서 자연스레 1이 연속 추가되어 9까지 나열해서 구구단 만들어주게됨
//		}
//		System.out.println("                                        ");
//			
//
//		int num5 = 1,dan5 = 7; //새로운 변수 만들어줘야함 아니면 앞의 변수와 겹침
//		while(num5 <= 9) {
//			System.out.println(dan5 + "*" + num5 + "=" + (dan5 * num5) );
//			num5 += 1; //num = num+1 과 같은 식_num에서 자연스레 1이 연속 추가되어 9까지 나열해서 구구단 만들어주게됨
//		}
//		System.out.println("                                        ");
//			
//		int num6 = 1; int dan6 = 8; //새로운 변수 만들어줘야함 아니면 앞의 변수와 겹침
//		while(num6 <= 9) {
//			System.out.println(dan6 +"*" + num6 + "=" + (dan6* num6) );
//			num6 += 1; //num = num+1 과 같은 식_num에서 자연스레 1이 연속 추가되어 9까지 나열해서 구구단 만들어주게됨
//		}
//		System.out.println("                                        ");
//			
//		int num7 = 1; int dan7 = 9; //새로운 변수 만들어줘야함 아니면 앞의 변수와 겹침
//		while(num7 <= 9) {
//			System.out.println(dan7 +"*" + num7 + "=" + (dan7* num7) );
//			num7 += 1; //num = num+1 과 같은 식_num에서 자연스레 1이 연속 추가되어 9까지 나열해서 구구단 만들어주게됨
//		}
//		System.out.println("                                        ");
//			
//	}
//
//}
/////여기서 연속으로 구구단 2~9 까지 만들기 
		
		
//선생님 추천 코드 적기 //


//========================================================================================================================
//(1)forGugu 사용하는 방법 __ 101페이지 연습문 연속 구구단 작성해보기 연습 문제 



//package com.javaex.practice;
//
//public class Looppractice {
//
//	public static void main(String[] args) {      // (1)forGugu 사용하는 방법
//		 //(1)forGugu();
//		 //(2)WhileGugu();
//		 //(3)forStar();
//		 //(4)whileStar();
//		
//		 for (int dan = 2; dan <= 9; dan++) {
//			   // 단수 돌리기: 2,3,4,5,6,7,8,9로 루프를 돌것임
//			 for (int num = 1; num <=9; num++) {  //num 을 1로 초기화, 9보다 작은가 조건연산도 설정한후 출력해보면.. //
//		System.out.println(dan + "*" + num + "=" + dan*num);		 
//			 }		 
//		 }
//	}
//}
//===============================================================================================================================
 // (2) WhileGugu 사용하는 방법



package com.javaex.practice;

public class Looppractice {

	public static void main(String[] args) {  // (2) WhileGugu 사용하는 방법
		int dan = 2, num; //dan 볁수 초기화함 2부터 시작으로 , num변수도 초기화
		
			while(dan <= 9) { 
				
				num = 1;//num 다시 1부터 시작으로 초기화해야함
				while(num <= 9) {
					
					System.out.println(dan + "*" + num + "=" + dan * num);
					num += 1;
				}	
				dan += 1;
			}	
	}
}
//====================================================================================================



