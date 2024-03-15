package com.javaex.basic.loop;

import java.util.Scanner;

public class DoWhileEx {
	
	// 정해지지 않은 수의 정수를 입력,합산
	//0이 입력되면 종료
	
	public static void main(String[] args) {
		
		// 합산변수
		int total = 0, num;
		
		// 스케너열고 
		Scanner scanner = new Scanner(System.in);
		
		//스케너로부터 정수입력
		do {
		System.out.println("정수를 입력하세요 . 0이면 종료:");
		num = scanner.nextInt();
		total += num;
		
		//0이면 합산종료
		//0이 아니면 입력계속 받기
		} while (num != 0);
		
		//스케너 닫기
		scanner.close();

	}

}
