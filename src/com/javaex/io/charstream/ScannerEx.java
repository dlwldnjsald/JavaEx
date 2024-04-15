package com.javaex.io.charstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerEx {
	
	private static String rootPath = System.getProperty("user.dir") + "\\files\\";
	private static String filename = rootPath + "thieves.txt";
	
	public static void main(String[] args) {
		// 입력 소스(파일 정보)
		File file = new File(filename); //thieves 정보를 갖고있는 파일 객체 생성
		
		try {	//try-catch문으로 묶어주기
			
			Scanner scanner = new Scanner(file);	//scanner 열고 file정보 스캐너에 전달
		
			// data 저장 받기 위한 데이터 저장변수 선언
			String name;
			float height;
			float weight;
		
			while (scanner.hasNextLine()) {		//스캐너로부터 더 읽을 라인이 있는지 확인
				name = scanner.next();				//문자열 토큰 읽기
				height = scanner.nextFloat();		//실수 토큰 읽기
				weight = scanner.nextFloat();		//실수 토큰 읽기
		
				System.out.printf("%s, 키:%f, 체중:%f%n", name,height,weight);
				scanner.nextLine();
		
			}
	
			scanner.close();
		
		} catch (FileNotFoundException e ) {
		System.out.println("파일을 찾을 수 없습니다.");

		}
		
	}
}
