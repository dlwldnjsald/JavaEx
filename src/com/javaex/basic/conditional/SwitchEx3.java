//package com.javaex.basic.conditional;
//
//	import java.util.Scanner;
//
//	public class SwitchEx3 {
//
//		public static void main(String[] args) {
//
//		// 스캐너열기
//		Scanner scanner = new Scanner(System.in); 
//
//		//점수입력
//		System.out.println("점수를 입력하세요"); 
//		int score =scanner.nextInt();
//		String message;
//		
//		if (score >= 90) {
//			message = "A등급";
//		} else if (score >= 80) {
//			message = "B등급";
//		} else if (score >= 70) {
//			message = "c등급";
//		} else if (score >= 60) {
//			message = "d등급";
//		} else if (score >= 0) {
//			message = "f등급";
//		} else {
//			message = "점수는 0보다 큰 정수로 입력하시오." ; // " " 로 설정해도되지만 //이제 여기서 더 친절하게 고객에게 전달할수있는 실행문
//		}
//		  
//		
//		System.out.println(message);
//		
//		scanner.close();
//	}
//}
//					
//	

package com.javaex.basic.conditional;
		//90점이상: A
		//80-89 : B
		//70-79 : C
		//60-69 : D
		//60점미만: F
import java.util.Scanner;
public class SwitchEx3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);     //대소문자 주의 S,s//스캐너열기
			System.out.println("점수를 입력하세요");           //점수입력
			
			String score_str =scanner.next();             //문자열은 새로운 str데이터 선언시 그냥 next();해도됨 , nextStr();할필요없음
			                                          //모르겠으면 ctrl+space bar 눌러서 힌트 항상 확인하기..

			//1)2)번 아래와같이 사용 가능//
			int score = 0;            // 1번)정수 데이터로 선언한 score 변수에 0으로 선언 및 초기화시키기 
			
			// 2번) try-catch문 사용 
			try {
				score = Integer.parseInt(score_str);
			}catch(Exception e) {
				System.out.println("실수나 문자열은 입력하면 안됩니다.");
			//scanner.close();        						// 스캐너닫기는 어차피 맨뒤서 클로즈하니까 중간에 클로즈해두되고 안해도 된다
			}                         						//catch-try문 닫는 표시} +)꿀팁으로 알려준 try-catch문 인데 참고하기 ///
			String message;  //message변수 스트링데이터화 선언
		
			if (score >= 90) {            //위의 1)2)번 쓴다고 해서 이 if-else문이 없어지는건 아님 주의.//
				message = "A등급";
			} else if (score >= 80) {
				message = "B등급";
			} else if (score >= 70) {
				message = "c등급";
			} else if (score >= 60) {
				message = "d등급";
			} else if (score > 0) {
				message = "f등급";
			} else {
				message = "점수는 0보다 큰 정수로 입력하시오." ; // " " 로 설정해도되지만 꿍은 이제 여기서 더 친절하게 서비스까지 할수있다는것 굿굿
			}
		  
		
		System.out.println(message);  //최종 message 출력
		scanner.close(); //스캐너닫기
	}
}
					

//강사님의 추천 코드는

//package com.javaex.basic.conditional;
//import java.util.Scanner;
//public class switchEx3 {

//정수를 입력받아 3의 배수인지 아닌지를 판별하는 프로그램

//	public static void main(String[] args) {
//	Scanner scanner = new Scanner(System.in); // 스캐너열기
		
		//System.out.println("점수를 입력하세요"); //점수입력

			//이 아래 두부분이 위에와 다른 점 ...						
			//int score =scanner.nextInt(); //정수형데이터 스캐너활용해서 score변수에 할당하겠다 선언 및 초기화
			//String message; //스트링데이터 message변수 선언

//if-else 문 사용하기

//            if (score >= 90) {
//	   	      		message = "A등급";
//            }	else if (score >= 80) {
//					message = "B등급";
//            }	else if (score >= 70) {
//					message = "C등급";
//            } else if (score >= 60) {
//					message = "D등급";
//            } else if (score >= 0) {
//					message = "F등급";
//            }

//	        System.out.println(message); //메세지 출력
//         	scanner.close(); //스태너닫기

//  } //p.s.v.main 닫기 표시 }

//} // 클래스 닫기 표시 }


	
