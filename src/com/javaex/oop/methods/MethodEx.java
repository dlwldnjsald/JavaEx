package com.javaex.oop.methods;

public class MethodEx {

	public static void main(String[] args) {     //
		// 4가지 케이스 구현해보기
		
//		1)매개변수 x(입력x) , 리턴 x(출력x)
//		printMessage(); 						//매개변수와 리턴 모두 없음
		
		
//		2)매개변수 x, 리턴 o						
//		String message = getMessage();			//매개변수없지만 리턴은 있음	
//		System.out.println(message);			//출력
		
		
//		3)매개변수 o, 리턴 x
//		printDevice(4,0);						//매개변수 4, 0 있지만 리턴은 없음
		
		
//		4)매개변수 o, 리턴 o
		int num1 = 4, num2 = 5;					//매개변수 ㅇ
		
//		double sum = getSum(num1, num2);       //4-(1) 를 사용할경우
		double sum = getSum(num1, num2, 6);    //4-(2) 를 사용할경우
		
		System.out.println(sum);				//출력
	
		
	}
	
	//=메소드 구현하기========================================================================================
	//1)
	private static void printMessage() {          //void 들어가있음
		
		//매개 변수 x
		//리턴    x  -> void 로 해줘야 리턴안됨 주의 /막혀있단 뜻 void 메서드 내에서 리턴을 하지 않아도 무방하다
		//매개변수없는상태이며 리턴타입없다를 void로 표시한결과 리턴도 하지 않겟다는뜻
		
		System.out.println("매개변수 없고, 리턴도 없는 메서드");
	}//1)끝나서 2)로 가는 루트
	
	//==============================================
	//2)
	private static String getMessage() {
		return "매개변수 없지만 리턴은 있는 메서드";     //문자열을 return해주게 됨
		
	}
	
	//=================================================	
	//3
	private static void printDevice(int num1, int num2) {
		//리턴타입이 없어도 return 할수있음
		//남은코드를 더이상 수행하지않고 제어를 돌려줄 때
		System.out.println("매개변수 있고, 리턴 없는 메서드");
		if(num2 == 0) {
			System.out.println("0으로는 나눌 수 없습니다.");
			return;
		}
		System.out.printf("%d / %d = %d%n", 
				num1,num2,num1 / num2);
	}
	
	//================================================
	//4-(1)
	private static double getSum(double num1, double num2) {
		System.out.println("매개변수 있고, 리턴도 있는 메서드");
		return num1 + num2;
		
	}
	
	//==================================================
	//4-(2)
	private static double getSum(double num1, double num2, double num3) {
		System.out.println("매개변수 있고, 리턴도 있는 메서드");
		return num1 + num2 + num3;
		
	}
	
	//==================================================

}	
	
/*===============================================
 * 3/21강의문
 * 메서드
 * 
 * 객체의 기는 또는 행동을 정의한다
 * 
 * 
 *  public int getSum( int i, int j ) {
		int result = i + j;
		return result;
   }
   //
   접근지정자 리턴타입 메서드이름( 메서드인자 i, 메서드인자 j) {
   		(구현코드);
   		(리턴문);
   으로 해석하면 된다
   
 * 호출방법>
  int sum = util.getSum(3, 2);
  //유틸이라는 인스턴스 안의 getsum메서드 안의 정수피라미터 2개 3,2를 sum이라는 정수형 변수에 할당해준다라는 뜼?
   * 
  자료형 변수명 = 레퍼런수변수.메서드명(메서드인자(파라미터)=>ㅇ,ㅇ)
  으로 해석하면 된다
  
 * ================================================
 * 매개변수(parameter)
-메서드를 선언할 때 괄호 안에 표현된 Input 값을 나타내는 변수 (type1 name1, type2
name2, ...)
-메서드 호출에서 들어가는 구체적인 값은 인자(Argument)라고 함

* 반환타입(return type)
-메서드는 0개 혹은 1개의 값을 Output으로 반환할 수 있음
반환 값이 없을 때: void
반환 값이 있을 때: int, boolean, Goods, ...
반환 되는 값은 메서드 선언에서 정의된 반환 타입과 일치해야 함

*메서드 이름
-자바의 식별자 규칙 대/소문자, 숫자, _, $ 조합하여 지을 수 있고 숫자로 시작할 수 없다.
-관례에 따라 소문자로 작성하고 두 단어가 조합될 경우 
두 번째 시작문자는 대문자로 짓는다.
-메서드 명은 기능을 쉽게 알 수 있도록 작성하는 것이 좋다
 *
 * ================================================
 * 가변인수
-메소드의 매개 변수의 개수를 알 수 없을 때 사용
-가장 간단한 해결방법은 매개변수를 배열로 선언하는 것
double sum(double[] values) { }

이러한 경우, 메소드 호출시 배열을 넘겨주어 여러 개의 값을 전달할 수 있다
double[] numbers= { 1, 2, 3, 4, 5 };
double result = sum(numbers);
double result = sum(new double[] { 1, 2, 3, 4, 5 });

방법 2: 매개 변수를 ... 를 이용하여 선언
자동으로 배열이 생성되고 매개값으로 사용된다
double sum(double ... values) { }

double result = sum(1, 2, 3, 4, 5 );
// * 
 * 
 * 
 */
