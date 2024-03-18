package com.javaex.basic.loop;
import java.util.Scanner; //스케너impot
public class ForLoopEx { //클래스열기
	// 단을 입력
	// for 루프로 1-9 까지 반복
	// 단 * num = 
	
	public static void main(String[] args) {
		
		int dan, num; //dan,num변수를 활용하기위해 dan과 num이란 변수 초기화 선언
		Scanner scanner = new Scanner(System.in); // 스캐너 열기
		System.out.println("단을 입력하세요.");// 단 입력하세요 고객에게 문장 출력하여 입력 명령
		dan = scanner.nextInt(); // 정수형 데이터를 스캐너를 활용해서 단에 할당해주겟다
		
			for (num = 1; num <= 9; num++) {  // for (초기화; 반복여부체크; 증감식)
			// 1~9까지 반복 되는 부분
				System.out.println(dan + "*" + num + "=" + (dan * num));// 결과 출력
	        }
		scanner.close();  // 스캐너 닫기
	}
}
