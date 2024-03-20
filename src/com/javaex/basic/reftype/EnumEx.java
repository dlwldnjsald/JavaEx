

/* 열거형enum
 * 새로운 데이타타입을 만들어내는것이다
 * 몇가지로 한정된 값만을 가지는 경우, 예를들어 요일,계절, 성별등은 카테고리화할수있음 
 * //월화수목금토일,사계절들,남녀등등 이외의 데이터는 절대 안들어감
 *상수의 일종이라 열거 상수는 모두 대문자로 작성하는것이 관례인다
 *여러 단어로 구성될경우 _로 연결한다는 관례가 존재한다
 *열거형을 선언시 enum키워드를 사용하면 되고
 *열거타입명을 지정하여 {} 를 열어서 열거 상수를 쭉 나열해주면 된다 //이름을 열거타입명으로 명명해주면 됨
 *
 *열거객체도 상수가 되겠고
 *열거객체의 메서드를 알아보자
 *name은 리턴타입으로 스트링타입을 반환하게 변환하게?되있고
 *열거상수가 실제 문자열로 어떻게 확인할수 있는가_열거타입의 문자열을 리턴 //String name()
 *열거상수에서 하나의 데이터는 몇번 순번에 있는가를 나타날때 int ordinal()
 *int compareTo(열거객체인 매개분수가 들어감)_> 열거객체를 비교, 순번차를 리턴할대
 *열거타입 valueOf(String name)_>  String name()과 반대 개념의 ? 주어진 문자열의 열거 객체를
 * 열거타입 values() _> 모든 열거 객체들을 배열로 리턴 
 * 
 * 열거객체 하나 만들어보고
 * 활용할수있는 코드 만들어보기
 * Week -> 열거 객체(enum)
 * EnumEx -> Week 테스트
 * enum //Week.java 파일 만들기 클래스만드는 경로에서 클래스대신 enum클릭해서 만들면 됨 (enum선택 주의)
 * EnumEx 클래스 만들어주기 //class만드는 경로로 만들어주면 됨 
 *///package com.javaex.basic.reftype;

package com.javaex.basic.reftype;
public class EnumEx {
	// enum 메서드 테스트
	public static void main(String[] args) {
		Week today = Week.WEDNESDAY;//요일 데이터를 쓰기위해 week 타입 사용
		
		System.out.println(today);
		
		System.out.printf("Today is %s(%d)%n",
				today.name(),       //열거 상수의 문자열 표현을 얻어낼수 있고
				today.ordinal());	// 현재 열거 상수의 열거 객체 내의 순번을 표시
				
		String strWeek = "FRIDAY";  //문자열 데이터를 열거 상수로 표현해내는 방법
		Week obj = Week.valueOf(strWeek);  // obj 변수안에 friday라는 열거상수를 할당하게됨
		
		System.out.printf("obj is %s(%d)%n",
				obj.name(),
				obj.ordinal()
				);
		
	}

}


