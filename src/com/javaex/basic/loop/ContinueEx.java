package com.javaex.basic.loop;

public class ContinueEx {
		// 1~20 까지 루프를 설정
		// 2의 배수와 3의 배수는 출력 안함: 1,5,7,11,13,17,19 출력하고싶단얘기
		// 나머지는 출력 ㅇㅇ
		// for문, continue문 사용
	public static void main(String[] args) {  
		//여기선 스캐너 import하고열지 않는 이유???
		
		for (int i = 1; i <= 20; i += 1) { // for문은 반복문 일정한 횟수를 정해놓고 계속 반복하는거야 계속 로테이트개념.
			if (i % 2 == 0 || i % 3 == 0)
				continue; // 다음 루프로				
			System.out.println(i); //두개가 다 false여야만 출력이 됨 주의 
		}
			//스캐너 import,열지않았으니 닫을필요도없음.
	
	}
}
//이건 따로 입력하는 방식은 없어서 출력만 되는 시스템으로 루프를 설정해준거라 사용자가 입력하는 란은 따로 설정되있지 않음 
//그래서 스캐너 임포트, 열고닫기 굳이 안한건가?? ㅇㅇㅇ 그렇다고 함

//출력되는 방식 구체적으로 설명 a || b 중에 하나라도 true 라면 true가 됨 
//i가 1일때 //i<=20을 만족하고// if문에서 false ||(or) false니까 false로 나옴 //그래서 continue타고 다음루프로 가지않고 //바로 s.o.p(i);해서 출력되고// 1+=1해줘서 //i=2로 로테이트시작
//i가 2로 로테이트시작되서// i<=20을 만족하고 //if문에서 true ||(or) false니까 true로 나옴 //이경우 continue타고 다음루프로 가고 //출력은 안되며 // i+=1 해줘서 //i=3으로 로테이트시작
//이렇게 위에처럼 무한 로테이트해서 가는게아니라 출력할것은 출력되고 ,, 출력안되는것은 안되지만 계속 로테이트 되어서 21은 20보다 커지니까 21부터 출력안되어진다고 보면 됨
