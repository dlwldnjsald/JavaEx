
/*
 * 
 * 3.21 강의문
 * 다차원 배열 
 * int[] Dimen = new int[]; 에서 []뒤에다 []이 하나 더붙음으로서
 * int[][] twoDimen = new int[][] ; -> []행[]열자의 2차원 배열이 만들어지게됨 
 * 
 */

package com.javaex.basic.reftype;

public class ArrayMultiDimEx {
		// 2차원 배열의 선언 까지 공부예정
	public static void main(String[] args) {
		// 2차원배열
		int[][] twoDimen = new int[5][10]; // 5행 10열자의 2차원 배열이 만들어지게됨//5xx10 // [y][x]라고 생각하기
		int[][] table = {
				{1,2,3,4,5,6,7,8,9,10},
				{2,3,4,5,6,7,8,9,10,1},
				{3,4,5,6,7,8,9,10,1,2},
				{4,5,6,7,8,9,10,1,2,3},
				{5,6,7,8,9,10,1,2,3,4}
				
		};// 5행 10배열 테이블안에 데이터 직접 작성해줌.//1)테이블을 활용해서 배열만드는 방법
		
		//출력 및 확인
		System.out.println(table);  // [[I@1f32e575 이렇게 객체의 기본 출력형태로 출력이 됨 ,
			                            //바꾸는건 나중에 알려주심
			
		System.out.println("table.length: " + table.length);//table의 length알아보기 (출력)
		
		System.out.println("table[0].length: " + table[0].length); //table[0]인덱스의 length 알아보기(출력)
	
		
		int sum = 0;   //내부 데이터 합산해보기 
		// 행 루프 돌리기 row변수로 이름지어줌
		for(int row = 0; row < table.length; row++) {   //for(초기화시키기; 조건검사연산; 증감연산)	//table.length s는 앞의 [y]값 먼저 순서대로 루프돌고 
			//열 루프 돌리기 col변수로 이름지어줌
			for(int col = 0; col < table[row].length; col++) {   //그 행에 연결된 열의 length 알아보기위해 코드이렇게작성 //table[row].length는 그뒤의 [x]값 루프돌기
				System.out.print(table[row][col] + "\t");     //출력해보기 (10번 루프 도는것을 5번 루프안에 다 하는 관계로 총 50번 돌아서 50개의 값이 나오게됨)
				sum += table[row][col];	 					//(y,x)좌표값처럼 출력나오는 행열관계 테이블 값 나오게됨
			}
			System.out.println(); //강제 개행 해주기				
		}
		System.out.println("총합:" + sum);  //최종 출력
	}
}



