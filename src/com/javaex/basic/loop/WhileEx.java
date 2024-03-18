package com.javaex.basic.loop;
public class WhileEx {
	// I Like Java0 ~ I Like Java 20
	
	public static void main(String[] args) {
		//while 반복문에 대한 공부
		//조건을 만족하는 동안 블록 반복한다
		//반복 조건 제어 변수가 필요/조건 변수를 개발자가 직접 제어하기
		int num = 0; //num변수 정수형데이터로 선언및 초기화
		
			while(num <= 20) {
				System.out.println("I Like Java" + num);
				//반복 제어 변수 증감
				num += 1; // num = num+1 과 같은 뜻.
		    }
	}
}  

//I Like Java0-Java 20까지 열거할때,, 반복되는 조건변수를 제어해주는것 필요하고 스캐너 여기도 마찬가지로
//사용자가 입력할 필요없으니 굳이 import와 여닫기 해주지 않아도 됨