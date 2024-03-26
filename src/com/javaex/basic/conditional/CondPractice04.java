package com.javaex.basic.conditional;


import java.util.Scanner;

public class CondPractice04 {
	//	등급 판별 프로그램
	//	>= 90 : A등급
	//	90 > score >= 80 : B등급
	//	80 > score >= 70 : C등급
	//	70 > score >= 60 : D등급
	//	60 > score : F등급
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요:");
		int score = scanner.nextInt();
		String message;
		
		if (score >= 90) 
		{	message = "A등급";	}
		else if (score >= 80) {
			message = "B등급";
		} else if (score >= 70) {
			message = "C등급";
		} else if (score >= 60) {
			message = "D등급";
		} else {
			message = "F등급";
		}
		
		System.out.println(message);

		scanner.close();
	}

}
