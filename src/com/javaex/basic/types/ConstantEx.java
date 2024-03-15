package com.javaex.basic.types;

public class ConstantEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Java Language
		//:상수 (Constant)
		//
		// 변경할 수 없는 고정된 데이터 ; 변하지 않는 수
		// 초기화,할당, 조회는 되나 //재할당,변경은 할 수 없음
		//        int a = 0 ; 이런식으로 선언할때 같이 할당해줘야함
		//   코드의 이해와 변경이 쉬움
		//   하나를 변경하면 나머지 데이터도 함께 연동되서 변경되는 형태
		//
		//   상태코드들은 상수로서 가급적 활용
		//   ex. 네트워크 시작 네트워크데이터 전송, 네트워크 종료 이런것들은 상수로 바꿔서 상수의 이름을갖고 만드는것이
		//   이후 유지보수 코드 변경도 쉽게 됨. java api 쪽에서도 많은 상수를 사용중
		
		//상수를 만드는 방법은 노트참고
		//static final double PI = 3.14159; //(final은 최종값이란 뜻 )
   
	    final double PI = 3.141259; // 상수의 이름은 모두 대문자, _로 단어 구분됨
		final int SPEED_LIMIT = 110; 
		
		System.out.println(PI);
		System.out.println(SPEED_LIMIT);
		
		//상수는 아래 코드처럼 재할당 불가
		//SPEED_LIMIT = 100; 이렇게 쓰면 오류뜸
		
		//아래와 같이 숫자를 나열하면 변경시 계속 나열된 숫자 110을 변경해줘야하는 번거로움때문에
		// 상수를 사용하게 되면
		System.out.println("현재 제한 속도는 " + SPEED_LIMIT + 110 + "입니다.");
		System.out.println("제한 속도 " + SPEED_LIMIT + 110 +"이하로 주행해 주세요");

		//그래서 상수를 사용하게 되면
		System.out.println("현재 제한 속도는 " + SPEED_LIMIT + "입니다.");
        System.out.println("제한 속도 " + SPEED_LIMIT + "이하로 주행해 주세요");

        // 상수의 사용 목적
        // 1. 코드 가독성을 높인다.
        // 2. 특정 데이터를 한 곳에서 일괄 관리한다
        // 3. 코드를 변경할 수 없다(불변성) //특정 데이터 자체를 변경될수 없게 막아둘 필요 있음 //
        //      특히나 상수코드같은 경우) 
       
        //System.out.println(Calendar, JANUARY);??
	 }		
}

//--------------------------------------------------------------------------
     



        
      
