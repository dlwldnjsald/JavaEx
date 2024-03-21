
/*
 * 
 * 3.21 강의문
 * 다차원 배열 
 * int[] Dimen = new int[]; 에서 []뒤에다 []이 하나 더붙음으로서
 * int[][] twoDimen = new int[][] ; -> []행[]열자의 2차원 배열이 만들어지게됨 
 *
 *
 *
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */







package com.javaex.basic.reftype;

public class ArrayMultiDimEx {
		// 2차원 배열의 선언 까지 공부예정
	public static void main(String[] args) {
		// 2차원배열
		int[][] twoDimen = new int[5][10]; // 5행 10열자의 2차원 배열이 만들어지게됨//5xx10
		
		int[][] table = {
				{1,2,3,4,5,6,7,8,9,10},
				{2,3,4,5,6,7,8,9,10,1},
				{3,4,5,6,7,8,9,10,1,2},
				{4,5,6,7,8,9,10,1,2,3},
				{5,6,7,8,9,10,1,2,3,4}
				
		};// 5행 10배열 테이블안에 데이터 직접 작성해줌.//1)테이블을 활용해서 배열만드는 방법
			System.out.println(table);  // [[I@1f32e575 이렇게 객체의 기본 출력형태로 출력이 됨 ,
			                            //바꾸는건 나중에 알려주심
			
			System.out.println("table.length: " + table.length);//table의 length알아보기 (출력)
		
	}

}
