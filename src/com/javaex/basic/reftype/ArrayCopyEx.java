package com.javaex.basic.reftype;

import java.util.Arrays; //import 해줘야함 배열 유틸리티 클래스를 이용한 출력을 하기위함

public class ArrayCopyEx {
	//배열은 크기 변경이 불가하기때문에 공간을 늘리고자 한다면 새 배열을 생성후 복사해줘야 한다 주의
	public static void main(String[] args) {
		//(1)For 문을 이용한 배열 복사
		arrayCopyByFor(); 	//이것 먼저 선언해서 create method 한후 코드작성해야함 잊지말기 주의
		
		//(2)System을 이용한 배열 복사 //이걸 사용할때는 위에 (1)선언한거 잠시 주석처리해서 사용
	//	arrayCopyBySystem(); //우선 이름부터 만들고 메서드 만들기
		
	}
	
	////(1)For 문을 이용한 배열 복사 위에서 선언했으면 시작
	public static void arrayCopyByFor() {
		int scores[] = {1,2,3};     				//int(정수형) 배열로 선언하겠다는 뜻/
													//기존에는 int에 숫자 하나만 넣을수 있었다면 배열은 숫자 int형을 여러개 넣겠다고 선언후 할당해준 것
													//int배열을 scores라는 변수로 만들었어 스코어 안에 숫자 1,2,3을 넣었음 -> 몇개->3개
													//배열할때는 갯수를 length 곧 길이라고 함 //.length == 3 
													//컴퓨터는 0부터 세니까 ->index범위는 0~2까지 되겠음
		
			for (int i = 0; i < scores.length; i++) {  //for문은 반복하려고 쓰는건데 ,0부터 시작해서 총 3번돌기위한 코드를 이와같이 작성한다는 것.
				System.out.print(scores[i] + "\t"); 	//tab 표시 ("\t"->탭 표시)//1번째출력 //scores변수의 ((i번째것))을 꺼내겠다라는 뜻.
														//print/println/printf 언제 어떻게 써야 하는지... (printf 거의 안씀)
														//println(출력하고 한번 줄바꿈이란 뜻)/ print는 아버지가방에들어가신다 이런느낌.
														
			}
			System.out.println();     //강제개행 ->줄바꿈이라는 표시 .. 앞전의 코드 옆에 쓸순 없으니
			
			// 새 공간을 만들어서 복사해주는방법
			int target[] = new int[10];  // int배열에 타겟이라는 이름을 새로 생성; 이번에는 숫자 10개를 담을 공간 만들어주겠다/
										//아까 스코어는 세공간에 1,2,3이 순서대로 배열되어 있었고, 이제 타겟에는 10공간이 있음
			//(위의 3개를 카피하면 7개의 새공간 남게됨
	
			for (int i = 0; i< scores.length; i++) {   //
				target[i] = scores[i]; //위의 scores 안의 1,2,3배열을 target배열 안으로 넣어주기
									  //기존 타겟에 데이터는 비어있었는데, 타겟 n번째에 스코어 n번째인 데이터1 넣어주겠다
			}
			
			// 배열 유틸리티 클래스를 이용한 출력
			System.out.println(Arrays.toString(target));  //2번째출력 // 타겟이라는 array배열을 string문자열로 변환해주겠다는 뜻을 코드화한것
			
	}
	/////
	
	public static void arrayCopyBySystem() {
		int source[] = {1,2,3};
		int target[] = new int[10];
		
		//우선 소스부터 출력하기
		System.out.println("source: " + Arrays.toString(source));
		
		//배열 복제하기
		System.arraycopy(source,//원본배열					//소스배열의
				0, 				// (원본배열의)복사 시작할 인덱스 위치부터 (원본배열의) //0인덱스부터
				target, 		// 복사 대상 배열을 뜻함 		//target배열의
				3,				// 대상 배열의 시작 인덱스 	//3번 인덱스부터 시작해서(4번째순서부터 넣겠다)
				source.length); // 복사할 길이 (길이=갯수)   //(3개의 갯수=길이)만큼 복사해넣는다
		
		System.out.println("target: " + Arrays.toString(target));  
		//target: [0, 0, 0, 1, 2, 3, 0, 0, 0, 0] 이렇게 출력됨 최종
		
		//(3) Enhanced For
		//for (추출된 데이터: 원본 배열 혹은 컬렉션)
		for (int value: target) {             // 타겟의 길이만큼 총 10번돈다,-> 0번째 돌때 int value에다가 0을 집어 넣음 //0번부터 세야함 잊지말자
			System.out.print(value + "\t");  //그다음 value 를 프린트하면 0이 나옴 마찬가지로,,
											//위의 타겟이 0번째,1번째,2번째...9번째를 돌게 된다 (총 10번 돈다)
											//탭해준 상태로 0	0	0	1	2	3	0	0	0	0 이렇게 출력됨 	
		}
		System.out.println();    //강제 개행 줄바꿈해주고ㄴ		
	}
}

		
		
//===============================================================================	
//교안에 있는 소스코드 복붙한것		
//		// (1)For 문을 이용한 Copy
//		int[] intArray = { 1, 2, 3 };
//		int[] newArray = new int[10];
//		for (int i = 0; i < intArray.length; i++) {
//			newArray[i] = intArray[i];
//		}
//		for (int i = 0; i < newArray.length; i++) {
//			System.out.print(newArray[i] + " ");
//		}
//		System.out.println();
//		}
//	}
////============================================================================
////(2)System.arraycopy()를 이용판 배열 복사
//public class ArrayCopyByArrayCopy {
//public static void main(String[] args) {
//int[] intArray = { 1, 2, 3 };
//int[] newArray = new int[10];
//
//System.arraycopy(intArray, 0,newArray, 0,intArray.length);  
//== > System.arraycopy(원본배열, 시작인덱스,타겟배열, 시작인덱스, 복사할 길이)인 부분임
//
//for (int i = 0; i < newArray.length; i++) {
//System.out.print(newArray[i] + " ");
//}
//System.out.println();
//}
//}
//==============================================================================

////(3)enhanced for문 (for loop) 교안 
//char vowels[] = { 'a', 'e', 'i', 'o', 'u' };
//
//for (char vowel: vowels) {			//vowels 라는  char형 배열에 있는 여러 캐릭터 데이터들을 하나씩 빼서 사용 하겠다
//	System.out.print(vowel + " ");
//}
//
//	System.out.println();
//}
//}
//



