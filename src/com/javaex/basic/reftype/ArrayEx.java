/* 배열 Array
 * 동일한 자료 유형의 여러값들로 이루어진 객체
 * new로 생성되는 참조 자료형이다
 * 30명의 성적을 처리한다고 생각해보자 30개의 변수를 선언할것인가 ? int score 1....30까지 만들것인지
 * 배열에 포함된 값들은 기본 자료형일수도있고
 * 다른객체를 참조하는 참조 자료형일수도 있음 _ 메모리구조를 잘 생각해야한다 
 * 
 * 타입[]식별자로 선언하게되면 해당타입의 배열을 만들어 낼수 있게되는데 
 * 
 * char[] c = new char[3];
 * c[0]='B'; 
 * 란 식이 있다하면
 * 
 * char[] c = new char[3];에서 캐릭터의 크기가 2바이트라 할때 2*3 총 6바이트의 공간을 할당해준다는 것이다
 * c[0]='B'; // 해석해보면 c의 0번방은 1234라고 한다면 
 * 1234(배열의 heap 메모리주소)+ 2(데이터사이즈) * 방번호(0번/index라 표시하자)) 
 * 
 * int[]arr //타입[]변수; //arr은 배열이다라고 선언하는건데 크기에 대해 선언하는것은 
 * int arr[] //타입 변수[]; // 여기에는 없다 ??// 그래서 new int[3];을 만든다 
 * 선언할때는 데이터의 개수가 나올수 없다는점 주의?
 * 
 * 배열의 초기화
 * 값 목록이 있다면 
 * Strin[] days = {"월", "화", "수", "목", "금", "토", "일"}; 
 * 이방식은 배열 변수 선언과 동시에 해주어야 허용되는 방법들이고
 * 다음과 같이 new 연산자 뒤에도 나열 가능하다 
 * String[] days;
 * days = new String[] {"월요일", "화요일", "수요일", "목요일", "금요일", "토
요일", "일요일"};
*
* new 연산자로 배열 생성 
* int[] intArray = new int[3];
intArray[0] = 3;
intArray[1] = 6;
intArray[2] = 9;
* new라는 뜻은 heap메모리에 만든다는 뜻이고 정수형 4바이트를* 공간 3개해서 12바이트로 만들어준다고 함
* 주의 타입 선언시 배열 크기 지정 안되는 이유
* 힘 메모리 안에서 공간 할당 되어야 그제서야 크기를 잡을수 있기 때문에 타입 선언시를 사이즈를 지정할수 없는 이유

 * int[] intArray 만 놓고 봣을땐 사이즈 알수 없으니 길이 알아야 /배열의length멤버는 배열의 길이 알아낼수있음
 * 배열의 길이를 동적 판단 해서 사이즈 잡아야
 * 
 * int[] intArray = new int[3];
intArray[0] = 3;
intArray[1] = 6;
intArray[2] = 9;
 * System.out.println(intArray[0]);
System.out.println(intArray[1]);
System.out.println(intArray[2]);
 * 
 * for(int i=0; i<3; i++){
System.out.println(intArray[i]);
}
 * 
 * for(int i=0; i<intArray.length; i++){
System.out.println(intArray[i]);
}
 * 
 * 배열의 선언->생성->초기화 // 만들어보기 
 * 
 * 
 */



package com.javaex.basic.reftype;

public class ArrayEx{
		//
	public static void main(String[] args) {
		//배열 생성하는 여러가지 방법
		//학생의 데이터를 이름,신장,체중,점수 등 
		//4가지 정보를 갖고있는 총4개의 배열을 관리해보기
				
		
		//배열선언하기
		String[] names;   //타임[]식별자 의 방법도 있고
		int scores[];     //타입 식별자[] //식별자 뒤에 []놓는 방법이 있다
		
		//초기화 방법
		names = new String[] {  //주어진 값의 목록을 가지고 갯수 판별 가능하기때문에 총 스트링배열 4개가 할당될것
			"김","이","박","정"
			//참조타입의 스프릴 배열이니까 스택과 힙이 잇으면 힙에 4개짜리 배열이 만들어지고 
			//거기에 주석처럼 리터럴 스트링인 4개의 김,이,박,정이 순서대로 달리는거라 생각하기
		
		};   // new 키워드로 기본값과 함께 생성하는 방법이었다
		
		float height[] = {
				175.5f,
				170.2f,
				180.3f,
				165.2f
		};  // 값 목록을 가지고 있을 때,
		
		
		//만약에 값을 가지고 있지 않고, 공간의 개수만 알고있을때,
		//아래와 같이 소스코드를 쓴다
		scores = new int[4];   //이때는 공간의 개수를 명시해두어야한다 
		// 인덱스는 0부터 시작하고 
		// 총 길이는.length - 1
		
		scores[0] = 80;
		scores[1] = 90;
		scores[2] = 85;
		scores[3] = 88;
//		scores[4] = 100;  //-> 여기는 공간이 없어서 오류뜨게 됨 IndexOutOfBounds
		
		//항상 배열을 다룰땐 그래서 항상 .length를 체크하고 인덱스에 접근하자 
		
		for (int i = 0; i < names.length; i++) {
			//총 길이는 .length - 1 라고 생각을 해야 함
			System.out.printf("%s (%.2f) : score = %d%n", 
					names[i],
					height[i],
					scores[i]);
		}
			
	}
	
}
	

