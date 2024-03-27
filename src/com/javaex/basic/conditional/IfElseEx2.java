package com.javaex.basic.conditional;

import java.util.Scanner;			//스캐너 import 가져오기 

public class IfElseEx2 {
	//	숫자 입력, > 0: 양수, < 0: 음수, 0
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);		// 스캐너 열기
		
		System.out.print("숫자입력:");					//숫자 입력 //고객의 입력을 위한 명령문 출력실행
		int num = scanner.nextInt();				//정수형 num변수 선언후(num이름의 저장공간 만들겟다) , 스캐너를 이용해 어떤 정수형 데이터 입력이 들어오면 할당해주겠다는 뜻

		//	숫자 조건 분기
		
		if (num > 0) {						
			System.out.println("양수입니다.");
			
		} else if (num < 0) {
			System.out.println("음수입니다.");
			
		} else {
			System.out.println("0입니다.");
		}
		
		
//		//	중첩 if 
//		if (num == 0) {
//			System.out.println("0입니다.");
//		} else {
//			//	양수 or 음수
//			if (num > 0) {
//				System.out.println("양수입니다.");
//			} else {
//				System.out.println("음수입니다.");
//			}
//		}
		
		//	스캐너 닫기
		scanner.close();
	}

}
