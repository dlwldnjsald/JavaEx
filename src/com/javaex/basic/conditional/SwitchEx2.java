package com.javaex.basic.conditional;

import java.util.Scanner;

public class SwitchEx2 {
	// 1,3,5,7,8,10,12 : 31일입니다
	//4,6,9,11:30일입니다.
	//나머지 2월은 : 28일 입니다.

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //대소문자 주의 S,s
		
		System.out.print("월을 입력하세요:");
		int month = scanner.nextInt(); //새로운 정수형데이터 선언시 nextInt();로 선언함
		String message ;
		
		switch(month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				message = "31일입니다.";
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				message = "30일입니다.";
				break;
			case 2:
				message = "28일입니다.";
				break;	
		default:
				message = "?";
				break;
		}//switch-case/ default 구문 닫는 표시 }
		
		System.out.println(month + "월은 " 
								+ message); //1번 마지막으로 데이터 출력하기
		scanner.close();//2번 스태너닫기
		
		//위의 1,2번의 스캐너닫기와 출력문은 순서 바꿔도 상관없음 
		//어차피 순서 상관없이 둘다 기능을 할거기 때문 
		//그리고 위에처럼 한번에 다 해놓고 마지막에 s.o.p();문써서 출력하는것이 더 효율적
		//프로그래밍은 최대한 효율적이고 간편한것을 찾아야 나중에 수정도 가독성에도 효율적
		
	}// 항상 주의하기 스케너와 출력 사인 모두 p.s.v.main {}안으로 들어가야함 :: 위치주의
		
}//마지막으로 패키지 닫는 표시 }

	