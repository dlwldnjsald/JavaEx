package com.javaex.basic.conditional;

	import java.util.Scanner;

	public class SwitchEx3 {
		//정수를 입력받아 3의 배수인지 아닌지를 판별하는 프로그램

		public static void main(String[] args) {

		// 스캐너열기
		Scanner scanner = new Scanner(System.in); 

		//점수입력
		System.out.println("점수를 입력하세요"); 
		int score =scanner.nextInt();
		String message;
		
		if (score >= 90) {
			message = "A등급";
		} else if (score >= 80) {
			message = "B등급";
		} else if (score >= 70) {
			message = "c등급";
		} else if (score >= 60) {
			message = "d등급";
		} else if (score >= 0) {
			message = "f등급";
		}
		
		System.out.println(message);
		
		scanner.close();
	}
}
					
	
