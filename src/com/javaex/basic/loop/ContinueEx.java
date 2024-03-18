package com.javaex.basic.loop;

public class ContinueEx {
		// 1~20 까지 루프
		// 2의 배수와 3의 배수는 출력 안함
		// 나머지는 출력
		// for문, continue문 사용
	public static void main(String[] args) {  //여기선 스캐너 import하고열지 않는 이유???
		
		for (int i = 1; i <= 20; i += 1) { // for문은 반복문 일정한 횟수를 정해놓고 계속 반복하는거야 계속 로테이트개념.. 20번 돌고 if내용을 실행하겟다
			if (i % 2 == 0 || i % 3 == 0)
				continue; // 다음 루프로				
			System.out.println(i); //두개가 다 falsde여야 출력되겟지

		}

	}
}


