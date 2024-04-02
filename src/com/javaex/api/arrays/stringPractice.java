package com.javaex.api.arrays;

public class stringPractice {

	public static void main(String[] args) {
		
		String str1;
		String str2, str3; // String 클래스변수 str1, str2, str3 선언
		
		str1 = "abc"; // str1은 생성된 String 클래스의 객체(Object)를 가리킴
		str2 = "cde"; // str2은 생성된 String 클래스의 객체(Object)를 가리킴
		str3 = str2; // str3에 str2의 주소 할당
		
		System.out.println( "str1:" + str1 + " str2:" + str2 + " str3:" + str3);
		System.out.println();
		
		//==============================================================================
		
		String greet = "Hello";
		String name = "JAVA";
		
		System.out.println( greet + name + "!" );
		System.out.println( greet + " " + name + "!" );
		System.out.println();
		
		//==============================================================================
		
		String greeting = "Global JAVA!";
		
		greeting.charAt(0);
		greeting.charAt(10);
		greeting.substring(1, 3);
		
		System.out.println( greeting.charAt(0));		//0번째 인덱스부터 시작하는 인덱스번호 중 0번째 인덱스 출력
		System.out.println( greeting.charAt(10));		//10번째 인덱스 출력
		System.out.println( greeting.substring(1, 3)); //1번 인덱스부터 3번 전까지를 출력한다는 말 (헷갈림 주의)
		System.out.println();
		
		//==============================================================================
		//Java의 String 객체는 한번 생성하면 변경할 수 없고 재할당시 새로운 String 클래스 객체가 생성된다
		
		String str4 = "efg";							//변수 선언후 할당
		String str5 = str4.toUpperCase();				//변수 선언후 위 코드에 .toUpperCase() 메서드 할당
		String str6 = str5.concat("??");				//변수 선언후 위 코드에 .concat() 메서드 할당
		String str7 = "!".concat(str5).concat("@");		//변수 선언후 위 코드와 병합? 응용?해서 할당
		
		System.out.println("str4: " + str4);
		System.out.println("str5: " + str5);
		System.out.println("str6: " + str6);
		System.out.println("str7: " + str7);
		System.out.println();
		
		//==============================================================================
		//실습예제
		
		//다음의 실행결과와 같이 출력하는 프로그램을 작성하세요.
		//1) “aBcAbCabcABC” 문자열 String 객체를 생성한다.
		//2) 3번째 문자열 출력한다
		//3) “abc”문자열이 처음으로 나타나는 인덱스를 추적한다.
		//4) 위 문자열의 문자 개수를 출력한다.
		//5) ‘a’를 ‘R’로 대체한 결과를 출력한다.
		//6) “abc”문자열을 “123’문자열로 대체한 결과를 출력한다.
		//7) 처음 3개의 문자열만을 출력한다.
		//8) 문자열을 모두 대문자로 변경하여 출력한다.
		
		
			
	
	
	}

}
