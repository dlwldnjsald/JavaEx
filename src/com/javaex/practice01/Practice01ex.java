package com.javaex.practice01;

public class Practice01ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println();
		System.out.println("< Practice 01 >");
		System.out.println("--------------------------------------------------");
		
		System.out.println("Ex01.java: " + "2)float");
		System.out.println("Ex02.java: " + "4) JDK에는 javac.exe가 포함되어있지 않다(x)");

//JDK와 JRE의 차이점// 
//JDK에는 Java 프로그램을 작성하는 데 필요한 도구(그래서 Kit라고 부름)와
//이를 실행하는 데 필요한 JRE가 포함되어 있습니다.
//Java SE 구현체는 JDK와 JRE가 있는데 
//JDK는 프로그램 개발에 필요한 JVM, 라이브러리 API, 컴파일러 등 개발 도구가 포함되어 있고 
//JRE는 프로그램 실행에 필요한 JVM, 라이브러리 API만 포함되어 있다. 
//자바 프로그램을 컴파일하기 위해선 JDK가 필요하고 
//바이트코드로 실행만 하려면 JRE만 있으면 되겠다. 
//JDK는 오라클에서 무료로 다운로드 받을 수 있다. 
//JDK를 설치하면 bin 디렉토리에 컴파일러 (javac.exe)와 JVM 구동 명령어 (java.exe)가 포함되어 있다.
	
		System.out.println("Ex03.java: " + "");
		//소스코드를 작성한다. 
		//(.java 확장자의 소스파일) 컴파일러 (javac.exe)가 바이트코드로 변한다. 
		//(.class 확장자의 클래스 파일) 런처 (java.exe)로 자바 가상 머신을 구동시킨다. 
		//자바 가상 머신이 바이트코드를 해석하여 자바 프로그램이 실행된다. 
		//자바 가상 머신만 설치되어 있다면 바이트코드는 어떤 운영체제에서라도 실행될 수 있다
		
		//바이트코드는 자바 가상 머신(JVM)이 실행할 수 있는 플랫폼 독립적인 코드 형식입니다. 
		//반면에 JVM은 특정 운영체제(OS)에 맞게 설계되어 있어서 OS에 종속적입니다. 
		//이것은 자바가 '한 번 작성하면 어디서나 실행된다(Write Once, Run Anywhere)'는 이념을 실현하기 위한 것입니다. 
	
	
	}
}
