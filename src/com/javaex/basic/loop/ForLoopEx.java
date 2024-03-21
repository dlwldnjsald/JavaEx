package com.javaex.basic.loop;
import java.util.Scanner; //스케너 import
public class ForLoopEx { //클래스열기
	// 단을 입력
	// for 루프로 1-9 까지 반복
	// 단 * num = 
	
	public static void main(String[] args) {
		
		int dan, num; //dan,num변수를 활용하기위해 둘다 int로 선언하는것
		
		Scanner scanner = new Scanner(System.in); // 스캐너 열기_> 자바폴더 안의 유틸폴더 안에 있던 스케너를 가져와서 이 자바안에서 쓰겠다
			System.out.println("단을 입력하세요.");// 단 입력하세요 고객에게 문장 출력하여 입력 명령하기
			
			dan = scanner.nextInt(); // 여기가 사용자가 입력을 받게하는 부분인거임 사용자가 입력을 안하고 엔터를 누르지 않으면 여기서 더이상 안내려간다는 뜻
									//무조건 정수형 숫자를 넣어서 실행시키든, 또는 이상한걸 넣어서 에러가 나든  둘중 하나가 됨
									//여기서 에러나면 21번재 줄에 dan이 절대 못오는것, 숫자가 들어가야 무조건 진행가능함
									//_> 무조건 dan,num은 초기화 하지 않으면 출력할수 없음 주의  
									//정수형 데이터를 스캐너를 활용해서 단에 할당해주겟다 //dan은 이미 여기서 정수형으로 초기화가 된 상태.
		
			for (num = 1; num <= 9; num++) {  // for(num은 여기서 초기화시키기; 조건검사연산; 증감연산)
			// 1~9까지 반복 되는 부분
				System.out.println(dan + "*" + num + "=" + (dan * num));// 결과 출력
	        }
		scanner.close();  // 스캐너 닫기 _> 스캐너 이제 안쓰겠다 닫아주기 
		//만약의 경우 여기서 스캐너를 다시 쓰고 싶을경우 
		//scanner = new Scanner(System.in); 이렇게 코드 적으면 된다(꿀팁)
	}
}
