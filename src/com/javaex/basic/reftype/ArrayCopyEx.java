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
		int scores[] = {1,2,3};     					// .length == 3 /index범위는 0~2까지 되겠음
			for (int i = 0; i < scores.length; i++) {
				System.out.print(scores[i] + "\t"); 	//tab 표시 ("\t"->탭표시)//1번째출력
				
			}
			System.out.println();     //강제개행 ->줄바꿈이라는 표시 .. 앞전의 코드 옆에 쓸순 없으니
			
			// 새 공간을 만들어서 복사해주는방법
			int target[] = new int[10];  //10개의 새로운 공간이 만들어지게됨 (위의 3개를 카피하면 7개의 새공간 남게됨
	
			for (int i = 0; i< scores.length; i++) {
				target[i] = scores[i]; //위의 scores 안의 1,2,3배열을 target배열 안으로 넣어주기	
			}
			
			// 배열 유틸리티 클래스를 이용한 출력
			System.out.println(Arrays.toString(target));  //2번째출력
			
	}
	
	public static void arrayCopyBySystem() {
		int source[] = {1,2,3};
		int target[] = new int[10];
		
		//우선 소스부터 출력하기
		System.out.println("source: " + Arrays.toString(source));
		
		//배열 복제하기
		System.arraycopy(source,//원본배열					//소스배열의
				0, 				// (원본배열의)복사 시작할 인덱스 위치부터 (원본배열의) //0인덱스부터
				target, 		// 복사 대상 배열을 뜻함 		//target배열의
				3,				// 대상 배열의 시작 인덱스 	//3번 인덱스부터 시작해서
				source.length); // 복사할 길이   			//복사해넣는다
		
		System.out.println("target: " + Arrays.toString(target));  
		//target: [0, 0, 0, 1, 2, 3, 0, 0, 0, 0] 이렇게 출력됨 최종
		
		//(3) Enhanced For
		//for (추출된 데이터: 원본 배열 혹은 컬렉션)
		for (int value: target) { 
			System.out.print(value + "\t");     
			//탭해준 상태로 0	0	0	1	2	3	0	0	0	0 이렇게 출력됨 
			
		}
		System.out.println();    //강제 개행 줄바꿈해주고
			
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

//(3)enhanced for문 (for loop) 교안 
//char vowels[] = { 'a', 'e', 'i', 'o', 'u' };
//for (char vowel: vowels) {
//System.out.print(vowel + " ");
//}
//System.out.println();
//}
//}




