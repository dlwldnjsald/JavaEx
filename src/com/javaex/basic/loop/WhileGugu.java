package com.javaex.basic.loop;
import java.util.Scanner; //입력값이 필요시 스캐너 활용해야해서 import 해주기
public class WhileGugu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);//스캐너 열기
		System.out.println("단을 입력하세요:");// 단 입력 받기
		int num = 1, dan; // num을 1부터 시작한 정수형데이터 선언및초기화, dan변수도 정수형으로 선언,초기화
		dan = scanner.nextInt(); //dan에 어떠한 정수형 데이터를 선언할경우, 라는 조건
		
		//1부터 9까지 while 루프loop
		//단*num 출력
			while(num <= 9) { //num이 1-9까지로 제한이 됨
				System.out.println(dan + "*" + num + "=" + (dan * num) );
				num += 1; //num = num+1 과 같은 식_num에서 자연스레 1이 연속 추가되어 9까지 나열해서 구구단 만들어주게됨
			}
		scanner.close();	//스케너 닫기
	}

}
