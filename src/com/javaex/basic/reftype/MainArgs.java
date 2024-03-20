/*
 * package com.javaex.helloworld;
 * 
public class MainArgs {

	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println("args [" + i + "] : " + args[i]);
			}
		}
}

*> java MainArgs Java Language is fun
args[0] = Java
args[1] = Language
args[2] = is
args[3] = fun
*

*main 함수에서의 배열
 * args라는 이름의 스트링 배열이 메인메서드 안쪽으로 전달되는 상황
 * (배열 형태의 값 목록이 main함수로 전달된다는 내용)
 */


package com.javaex.basic.reftype;

public class MainArgs {
		//배열 형태의 값 목록이 main 메서드로 전달
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.printf("args[%d] = %s%n" ,
					i, args[i]);
			
		}

	}

}

//arguments 항목에다 Java Language is Fun 을 입력후 실행해보기
//MainArrgs라는 파일 우클릭> run as> run configuration> arguments>
//program arguments 라인에다가 Java Language is Fun을 입력후 실행하면 된다.
//안되면 arguments항목 아닌 main항목 들어가서 확인하기
//이걸 함으로써?


//배열의 복사는 내일부터 .. 
//오늘까지 했던 내용들 practice 예정


//jar파일 실행하는 방법은 동영상 보면서

