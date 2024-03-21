package com.javaex.practice04;

public class Ex03 {

	public static void main(String[] args) {
		
		int[] intA = {3,6,9};
		
		int[] intB;
		intB = intA;
		intB[0] = 20;
		intB[2] = 10;
		
		for(int i =0; i<intA.length; i++) {
			System.out.println(intA[i]);	
		}

	}

}
//========================================================
//출력값 예상
//3
//6
//9
//로 나오게 됨 ?
//a가 b에 할당되어서 ?

//----------------------------------------------------------
/*int[] int A를 선언하고 할당하면서
 * stack memory가 intA가 힙메모리에 int형으로 3,6,9로 저장이 되었고
 * 
 * int[] int B를 선언했는데,
 * intB가 int A힙메모리로 가게되고
 * 
 * int[0]이라는 인덱스공간에 값을 20으로 바꾸고
 * int[2]부분의 공간에 값을 10으로 바꾸게 되어버림
 * 
 * 그래서 
 20
 6
 10
 
 으로 출력하게됨. 
A값을 건든적이 없는데 데이터가 바뀌어 출력하게 된 부분 주의
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
