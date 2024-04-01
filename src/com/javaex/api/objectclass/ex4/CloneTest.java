package com.javaex.api.objectclass.ex4;

public class CloneTest {

	public static void main(String[] args) {
		
		Scoreboard s1 = new Scoreboard(new int[] {10, 20, 30, 40});
		System.out.println("s1=" + s1);
		
		//복제본 생성 [얕은복제의 결과 ]
		Scoreboard s2 = s1.getClone();
		System.out.println("s2=" + s2);
		
		System.out.println("s1 == s2 ? " + (s1 == s2)); //false 전혀 다른 객체임을 알려줌
		
		
		
		s1.getScores()[0] = 50;	//내부 참조 필드의 값을 변경할 경우?
		//s1의 scores[]의 0번 인덱스를 50으로 넣어줄경우 
		System.out.println("s2=" + s2);
		//s2를 출력하면 값이 변경된것을 알수 있음 그래서 아래와 같이
		
		System.out.println("s1.scores == s2.scores ? " +
				(s1.getScores() == s2.getScores()));
				//s1.scores, s2.scores는 같은 참조 주소인가를 확인 해보기 // 트루로 나올것.

		
	}

}
