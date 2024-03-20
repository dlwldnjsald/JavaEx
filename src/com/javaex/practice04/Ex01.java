package com.javaex.practice04;

public class Ex01 {
	// 아래의 코드를 실행하면 출력결과에 오류가 발생한다. 
	// 오류 수정 후 출력결과를 예상하고 코드로 확인해보시오.
	
//	public static void main(String[] args) {
//		
//		int[] intArray = new int[5];
//		intArray[0] = 3;
//		intArray[1] = 7;
//		intArray[2] = 12;
//
//		int result = 0;
//		
//		for ( int i =0; i<= intArray.length; i++) {
//			result = result + intArray[i];	
//		}
//		System.out.println(result);
//	}
//
//}

public static void main(String[] args) {
		
	int[] intArray = new int[3];     // 5에서 문제 발생 -> intArray[3], intArray[4] 는 데이터값을 0으로 두게됨
		
		intArray[0] = 3; 
		intArray[1] = 7;
		intArray[2] = 12;

		int result = 0;
		for ( int i =0; i< intArray.length; i++) {   // 부등호 <미만 주의
			result = result + intArray[i];	         // 합산변수로 3+7+12+0+0 = 22
				
		}
		System.out.println(result);
	}

}//		public static void main(String[] args) {	

	