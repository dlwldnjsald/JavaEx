package com.javaex.basic.conditional;

import java.util.Scanner;

public class switchEx {

	public static void main(String[] args) {
		// 스캐너열기
		Scanner scanner = new Scanner(System.in); 
		//과목번호 입력
		System.out.println("과목 번호를 입력하세요.");
		int subj = scanner.nextInt();
		
		//조건분기 (switch)
		switch (subj) {
			case 1: //subj == 1 서브젝트가 1과 같다
				System.out.println("R101입니다.");
				break;
			case 2: // subj == 2 //case는 항상 스위치 안쪽에 들어가있기
				System.out.println("R102입니다.");
				break;		
			case 3: // subj == 3 //case는 항상 스위치 안쪽에 들어가있기
				System.out.println("R103입니다.");
				break;		
			case 4: // subj == 4 //case는 항상 스위치 안쪽에 들어가있기
				System.out.println("R104입니다.");
				break;		
			default:// else문 과 같다고 생각하기
				System.out.println("관리자에게 문의하세요");
				break;
			}
		
		}
		//스캐너 닫기
		
		Scanner.close();	
}
