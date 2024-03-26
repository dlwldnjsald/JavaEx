package com.javaex.opp.staticmember;////

public class SingletonApp {

	public static void main(String[] args) {

//		Singleton s1= new Singleton(); // 오류; 생성자가 private이기때문
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
	
		// 두 객체는 같은 객체? 인가를 출력시
		System.out.println("s1 == s2 ?" + (s1 == s2));
		
	
	}

}
