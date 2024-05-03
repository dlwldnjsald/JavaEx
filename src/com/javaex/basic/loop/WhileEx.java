/*
 * package com.javaex.basic.loop;
public class WhileEx {
	// I Like Java0 ~ I Like Java 20
	
	public static void main(String[] args) {
		//while 반복문에 대한 공부
		//조건을 만족하는 동안 블록 반복한다
		//반복 조건 제어 변수가 필요/조건 변수를 개발자가 직접 제어하기
		int num = 0; //num변수 정수형데이터로 선언및 초기화
		
			while(num <= 20) {           //먼저 num변수가 20이하인지 판단했을대 
				System.out.println("I Like Java" + num);	//이 실행문을 실행시켜라
				//반복 제어 변수 증감
				num += 1; // num = num+1 과 같은 뜻.  	//num숫자가 1씩 증감해서 반복하도록 만드는것 (20까지
		    }
	}
}  
*/
//I Like Java0-Java 20까지 열거할때,, 반복되는 조건변수를 제어해주는것 필요하고 스캐너 여기도 마찬가지로
//사용자가 입력할 필요없으니 굳이 import와 여닫기 해주지 않아도 됨

//Do-while->먼저 행동을 하고 판단하는것 //
//while->먼저 판단을 하고 행동에 옮기는 것//
//이부분 주의


package com.javaex.basic.loop;

public class WhileEx {
	// I Like Java0 ~ I Like Java 20
	
	public static void main(String[] args) {
		//while 반복문에 대한 공부
		//조건을 만족하는 동안 블록 반복한다
		//반복 조건 제어 변수가 필요/조건 변수를 개발자가 직접 제어하기
		int num = 0; //num변수 정수형데이터로 선언및 초기화
		
			while(num < 21) {           
				num++;//num += 1; == num++;로도 표현가능
				System.out.println("I Like Java" + num);	
					
				if (num == 21) {
					System.out.println("\n" +"20 이하의 숫자로 출력해주세요.");
				}// 위의 코드를 이런식으로 while문 안에 if를 적어서 작성할수 있지만 앞의 코드와 같이 후자보다는 전자를 더 선호한다. 코드의 간결화 추구 //
				
			}
			
			//----------------------------------------------------------
			int tree = 0;
			while (tree < 10) {
				tree++; //또는 tree += 1;
				System.out.println("나무를 " + tree + "번 찍었습니다");			
				}if (tree == 10) {
					System.out.println("나무 넘어갑니다." + "\n");
				}
			//----------------------------------------------------------
			int coffee = 10;
			int money = 300;
			
			//패턴으로 이해하면 덜 어려움
			while (money>0) {
				System.out.println("돈을 받았습니다. 커피를 드립니다."); //1번 출력
				coffee--;
				System.out.println("남은 커피의 양은 " + coffee + "입니다."); //2번출력
					
					//while 문 안의 if loop 돌리기 //1-2번 패턴 동안에 3번 출력 하겠단 의미 
					if (coffee==0) {
						System.out.println("커피 재고가 다 떨어진 관계로 판매를 중지합니다.");
						break; 				//break 안하면 while문이 무한대로 돌아감 음수로 떨어짐..
					}
			}
			
			
	}
}
 
