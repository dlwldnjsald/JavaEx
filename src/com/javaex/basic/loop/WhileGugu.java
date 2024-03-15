package com.javaex.basic.loop;

import java.util.Scanner;

public class WhileGugu {

	public static void main(String[] args) {
		//스캐너 열기
		Scanner scanner = new Scanner(System.in);
	
		// 단 입력 받기
		System.out.println("단을 입력하세요:");
		int num = 1, dan;
		
		dan = scanner.nextInt();
		
		//1부터 9까지 while loop
		//		단*num 출력
		while(num <= 9) {
			System.out.println(dan + "*" + num + "=" + (dan * num) );
			num += 1; //num = num+1 과 같은 식
		}
		//스케너 닫기
		scanner.close();
	}

}
