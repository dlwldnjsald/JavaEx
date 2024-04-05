package com.javaex.collection.list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		// Queue 선언
		// Queue 는 인터페이스Interface
		// 실제 저장은 LinkedList의 기능을 활용한다
		
		Queue<Integer> queue = new LinkedList<>();	
		
		for (int i = 0; i < 10; i++) {
			queue.offer(i); 	//입력(제공)
			System.out.println("QUEUE:" + queue);
		}
		System.out.println();
		
		System.out.println("PEEK:" + queue.peek());	//출력방향의 데이터 확인
		System.out.println("POLL:" + queue.poll());	//인출
		System.out.println("QUEUE:" + queue);
		System.out.println();
		
		//poll할때는 비어있는지 체크
		while(!queue.isEmpty()) {	//queue가 비어있지 않은 동안dml  루프
			System.out.println("POLL:" + queue.poll());
			System.out.println("QUEUE:" + queue);
		}
		
	}

}
