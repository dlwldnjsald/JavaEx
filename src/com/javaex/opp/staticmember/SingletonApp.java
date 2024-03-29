package com.javaex.opp.staticmember;

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



//
////0327 강의문
////주의할점
//	int val1 = 1; {
//	
//	int val2 = 2; {
//		
//	int val3 =3;
//		
//	}
//	System.out.println(val1);	//아직 메모리에 남아 있어서 ok출력됨
//	System.out.println(val2);	//동일 메모리 상 블록안에 있어서 ok출력됨
//	System.out.println(val3);	//블록을 나갔기때문에 삭제되서 출력x
//	}
//
//	System.out.println(val1);	// ok 출력됨
//	System.out.println(val2);	// 블록을 나가는순간 삭제되서 출력 x
//	System.out.println(val3);	// 블록을 나가는순간 삭제되서 출력 x
//
//
//	for (int x=0; x<10; x++) { //for(선언과초기화(할당)동시에해주고,조건검사연산; 증감연산)
//	//로직
//	}
//	System.out.println(x); //이런경우 x가 이미 블록 상에서 사라지기때문에 출력안됨
//		
//	int x; //먼저선언해주고
//	for (x=0; x<10; x++) { //할당(초기화)해주면서 for반복문 돌리면 됨
//	//로직
//	}	
//	System.out.println(x); 	//이런경우 x가 블록 밖에서 출력을 해도 이미 블록 전에 변수 선언을 해줘서 출력가능