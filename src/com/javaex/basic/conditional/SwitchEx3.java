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
//			message = "점수는 0보다 큰 정수로 입력하시오." ; // " " 로 설정해도되지만 꿍은 이제 여기서 더 친절하게 서비스까지 할수있다는것 굿굿
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

	import java.util.Scanner;

	public class SwitchEx3 {

		public static void main(String[] args) {

		// 스캐너열기
		Scanner scanner = new Scanner(System.in); 

		//점수입력
		System.out.println("점수를 입력하세요"); 
		String score_str =scanner.next();
		
		int score = 0;
		try {
			score = Integer.parseInt(score_str);
		}catch(Exception e) {
			System.out.println("실수나 문자열은 입력하면 안됩니다.");
			//ㅁscanner.close();    // 스캐너 어차피 맨뒤서 클로즈하니까 중간에 클로즈해두되고 안해도 된다
		}
		
		//int score =scanner.nextInt();
		String message;
		
		if (score >= 90) {
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
		  
		
		System.out.println(message);
		
		scanner.close();
	}
}
					
	
