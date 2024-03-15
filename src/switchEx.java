package com.javaex.basic.conditional;

import java.utill.Scanner;

public class switchEx {

	public static void main(String[] args) {
		// 스캐너열기
		java.util.Scanner scanner = new Scanner(System.in);
		//과목번호 입력
		System.out.println("과목 번호를 입력하세요.");
		int subj = scanner.nextInt();
		
		//조건분기 (switch)
		switch(subj) {
		case1: //subj == 1 서브젝트가 1과 같다
			System.out.println("R101입니다.");
			break;
		case2: // subj == 2 //case는 항상 스위치 안쪽에 들어가있기
			System.out.println("R102입니다.");
			break;		
		case3: // subj == 3 //case는 항상 스위치 안쪽에 들어가있기
			System.out.println("R103입니다.");
			break;		
		case4: // subj == 4 //case는 항상 스위치 안쪽에 들어가있기
			System.out.println("R104입니다.");
			break;		
		default:// else문과 같다고 생각
			System.out.println("관리자에게 문의하세요");
			break;
		}
		//스캐너 닫기
	}
