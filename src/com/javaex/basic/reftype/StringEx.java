//stack 메모리와 Heap 메모리의 영역
//reference Variable 참조변수는 특정 heap에서 어떤것?을 가리키고있음
//null은 가르키지않고 있음

//참조타입 reference type

//참조타입의 참조변수의 == , != 은 
//값이 같은지 비교하는것이 아닌 동일한 객체를 참조하는지 아닌지 확인위해 사용됨
//refvar1 == refvar2 같은 객체를 참조하는가 확인하는건 같은 메모리주소를 바라보고있는가라는 내용
//!= 다른 객체를 참조하는가 확인하는 작업//같은 메모리 주소가 아닌가를 확인하는 작업
//null은 참조하는 객체가 없음을 나타냄

//reference type : 문자열 
//문자열을 저장하기 위해선 String 타입으로 선언

//String varname;  //선언해주는것 /(varname ->식별자라는 부분)
//varName ="문자열"; //문자열 할당해주는것. " "사이에 문자열 리터럴
//(소스코드상에 리터럴로 고정된 값)을 넣음
//또는
//String varName = "문자열"; //위처럼 선언하고 할당해주는것보단 선언과 할당을 동시에 하는 방법
//
//String varName = new String("문자열"); 
//
//String값이 같은지 비교하려면 .equals 메서드를 사용한다
//strVal1.equals(strVal2); // strVal1과 strVal2가 같은 값을 가지고 있는가?
//Str: equals(Str2)

//========================================================================

package com.javaex.basic.reftype;

public class StringEx {

	public static void main(String[] args) {   //main 메서드 체크 잊지말기
		// 선언 이후 할당, 선언동시할당, 눌null을 이용한 객체생성
		String str1;    //1)선언  //스택메모리안에 str1이라는 참조변수가 생성되었다 이제 값 세팅하기
		str1 = "Java";  //할당	//
		
		String str2 = "Java";	//2)선언후 할당하는것 
		
		String str3 = new String("Java");   //자바라는 데이터를 갖고있는 변수가 새로운 공간으로 저장되있는 상태기때문에 새로운 주소를 갖고있으므로 위의 자바 메모리 주소와 다름
			
		// 요 위에 세 참조변수는 같은값을 가지고있다
		// 참조변수의 경우 ==은 메모리 주소의 비교이다
		System.out.println(str1 == str2);     // true로 출력될것
		System.out.println(str2 == str3);	  // false로 출력될것	
		
		// 값의 비교는 .equals 메서드 이용한다 //참조자료형의 값의 비교는 거의무조건 .equals 쓴다보면됨 // data값의 비교는 a.equals(b) 형태로 비교해준다
		System.out.println(str1.equals(str2));   
		System.out.println(str2.equals(str3));  //어떤게 주체가 되느냐도 주의
	}

}


 


