
//==================================================================		// //
		// 3/20일자 102pg practice 시작
		//6의 배수이자 14의 배수인 가장 적은 정수 찾기 미션
		//for문은 반복의 ㅎ쇳수를 알수 있을때 = for
		//while문은 반복의 횟수를 알수 없을대 = while 
		// 6,14의 배수인 가장 적은 정수를 찾을때 빠져 나와서 출력되야하므로 break;를 사용해주기 
		//위의 미션인 경우 횟수를 알수 없는 경우 while문이 적당하다 추천

//package com.javaex.basic.loop;
//	
//public class BreakEx {
//	//6으로나눳을때 나머지 0 14로 나눴을때 나머지 0인 정수 찾기
//	public static void main(String[] args) {
//		
//		int num =1; //(1부터 시작)
//		
//		while(true) {      						 //(true->무한루프 돌릴것)
//			if (num % 6 == 0 && num % 14 == 0 ) {
//				break;     							 //위의 if 상황이되면 탈출위해 break걸기	
//			}
//			num += 1;
//		}
//		System.out.println(num);
//	}
//	
//}



//==================================================================		==================================================================		//==================================================================
		//103 pg. Math.random() 으로 정수값 생성하기
		// 프로그래밍 random은 난수는 아니고 수학적으로 계산된 난수고 난수인것처럼 보일 뿐이고
		// 어떤 수식을 통해 계산된 특정값이라고 생각해보기
		//Math.random()의 출력값은 0.0<= 숫자 <1.0이 해당된다( 0.0dltkd 1.0 미만인 실수값 반환)
		//double 형 값 반환
		//double 형을 int 형으로 강제 형변환하면 소수점 아래가 버림처리됨 4.12556433 -> 4
		//정수 난수값 필요시에 주로 사용된다
	
//==================================================================		//==================================================================
		// 105pg.연습문제 
		//미니로또 
		//1-45까지의 숫자중 임의의 6개의 숫자를 출력하세요(중복체크는 하지말것)
		//for문 혹은 while문을 이용하여 1-45 사이의 정수값 여섯개를 생성하기

package com.javaex.basic.loop;
	
public class BreakEx {
	//6으로나눳을때 나머지 0 14로 나눴을때 나머지 0인 정수 찾기
	public static void main(String[] args) {
		forLotto();    //있어야 부를수있기때문에 불러와야댐
		
		
			for (int i = 0; i< 6; i++) {
				System.out.print((int)(Math.random()*45)+1 + " ");
			}
		}
	
	private static void forLotto() {
		
	}	
	
}

//==================================================================

//		public static void whileLotto()) {
//			int = 0
//					
//			}
//		}int num = (int)(Math.random()*45)+1;
//			
//			while(num <= 45) {
//				System.out.println(num);
//				
//			}
//			num += 1;
//	}
//	 
//}  
///위의 코드 줌 강의문 보고 다시 수정해작성 및 정리하기
	
