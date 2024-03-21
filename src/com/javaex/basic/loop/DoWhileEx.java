package com.javaex.basic.loop;
import java.util.Scanner;   //입력할때 쓰는 스캐너 // 장볼때 담는 바구니와 같은 존재 
public class DoWhileEx {
	
	// 정해지지 않은 수의 정수를 입력,합산
	//0이 입력되면 종료
	public static void main(String[] args) {
		
		// 합산변수
		int total = 0, num; // int라는 타입에다 total변수와 num변수 선언하는거임
		// 스케너열고 
		Scanner scanner = new Scanner(System.in);
		//스케너로부터 정수입력
			do {
				System.out.println("정수를 입력하세요 . 0이면 종료:");
				num = scanner.nextInt(); //정수형데이터를 스캐너를 사용해서 num 변수에 할당선언하고
				total += num; //total = total+ num이 된다고 할때
		
				//0이 아니면 입력계속 받는다는 내용 무한으로 
				//근데 0이 되면 total 총합은 그동안 나온 정수의 누적된 total 합산으로 나오고 종료함
			} while (num != 0);//(num이 0이 아니면 계속 do내용 하라는 뜻) //while 동안
		
		System.out.println("총 합은 " + total + " 입니다"); // 출력문도 추가해주기
		//스케너 닫기
		scanner.close();      //바구니안에 뚜껑이 있다치면 이제 더이상 바구니안에 안담겠단 뜻으로 닫아주는것 필요

	}

}
