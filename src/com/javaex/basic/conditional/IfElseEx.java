package com.javaex.basic.conditional;

import java.util.Scanner;//스캐너 임포트 가져오기

public class IfElseEx {
	//	점수 입력, 60점 이상이면 합격입니다 출력
	//	Tip: Ctrl + Space (자동 임포트)
	//		Ctrl + Shift + O (Organize Imports)
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);	// 스캐너 열기
	
		System.out.print("점수는?");			//입력위한 출력문 실행
		int score = scanner.nextInt();		//	스캐너를 이용해 어떤 한 정수형데이터가 고객으로부터 입력될때 정수형 변수 score에 할당됨 ///점수 입력 받기
		
		
//		score 변수도 생성했으니 아래 ifelse로 조건식 만들기 //점수 비교
		if (score >= 60) {				//	조건을 만족했을 때
			System.out.println("합격입니다.");		//합격입니다로 출력해라
			
			
		} else {						//	조건을 만족하지 않을 때
			System.out.println("불합격입니다."); 	//불합격입니다로 출력해라
		}
		
		
		scanner.close();//	스캐너 닫기
	}

}
