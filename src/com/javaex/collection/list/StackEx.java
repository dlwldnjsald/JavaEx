package com.javaex.collection.list;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		//Stack 선언
		//Stack<Integer> stack = new Stack<Integer>();
		Stack<Integer> stack = new Stack<>(); 		//이렇게 생략 가능 위의코드를
		
		
		//데이터 입력
		for (int i = 0; i < 10; i++) {
			stack.push(i);
			System.out.println("STACK:" + stack);	
		} 
		System.out.println();
		
		
		//가장 마지막에 있는 데이터 확인
		System.out.println("PEEK:" + stack.peek()); 	//peek를 하면 데이터는 삭제되지 않는다
		System.out.println("STACK:" + stack);
		System.out.println();

		
		//인출
		System.out.println("POP:" + stack.pop());		//pop으로 뽑아내면 데이터는 삭제된것을 확인한다
		System.out.println("STACK:" + stack);
		System.out.println();
		
		
		
//		while(true) {
//			System.out.println("POP:" + stack.pop());
//			System.out.println("STACK:" + stack);
//		}
//Stack이 비어있는지 확인해야 한다
		while(!stack.empty()) {	//비어있지 않으면, 이라는 조건 걸어야 오류 안남
			System.out.println("POP:" + stack.pop());
			System.out.println("STACK:" + stack);
		}
	
		
		
	}

}
