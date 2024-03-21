package com.javaex.practice04;

public class Ex02 {
//		 double형 배열을 작성하고 1.2, 3.3, 6.7 값을 순서대로 입력하고 
//		아래와 같이 출력되도록
//		for문을 작성하세요 

	public static void main(String[] args) {
	
//		 값 목록을 가지고 있을 때,
		double[] d = new double[3];
		d[0] = 1.2;
		d[1] = 3.3;
		d[2] = 6.7;
		
			for(int i=0; i<d.length; i++) { // for(초기화시키기; 조건검사연산; 증감연산)
				System.out.println(d[i]);
			}
						
	}

}
//========================================================================
