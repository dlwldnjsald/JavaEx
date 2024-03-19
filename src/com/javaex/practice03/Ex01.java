// Ex01.java
package com.javaex.practice03;

public class Ex01 {

	public static void main(String[] args) {
		//아래의 출력 결과를 예상하여 작성하는것을 목표로 하기
		//예상 값 써보기: 
		
		//while문
		//index= 0
		//index= 1
		//index= 2
		
		//for문
		//order= 0
		//order= 1
		//order= 2
		
		//로 예상
		
		//결과 while문 fore문 중간에 행 띄어쓰지 않고 바로 나열됨
		
		System.out.println("while문");
			int index = 0;
			while( index < 3 ) {
				System.out.println("index=" + index);
				index++;
			}
			
			System.out.println("for문");
			for(int order=0; order<3; order++)
				System.out.println("order=" + order);
			
	}

}
