package com.javaex.basic.conditional;

import java.util.Scanner;

	public class CondPractice03 {
		//	정수를 입력받아 3의 배수인지 아닌지를 판별하는 프로그램
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("점수를 입력하세요:");
			int score = scanner.nextInt();
			
			if (score % 3 == 0) {
				System.out.println("3의 배수입니다.");
			} else {
				System.out.println("3의 배수가 아닙니다.");
			}
			
			scanner.close();

		}

	}
