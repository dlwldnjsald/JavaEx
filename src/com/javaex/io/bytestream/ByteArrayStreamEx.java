package com.javaex.io.bytestream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class ByteArrayStreamEx {

	public static void main(String[] args) {
		// 입력 소스
		byte[] inScr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		// 출력 타겟
		byte[] outScr = null;
		

		System.out.println("입력소스: " + Arrays.toString(inScr));
		System.out.println();

		//----------------------------------------------
		/*
		InputStream bis = null;
		OutputStream bos = null;

		// 입력 스트림과 출력 스트림 열기
		bis = new ByteArrayInputStream(inScr); // ctrl shift o로 input
		bos = new ByteArrayOutputStream(); // ctrl shift o로 input

	/*	try { // try문으로 예외처리 묶음-------------------------------------------

			// data 저장할 변수 설정
			int data = 0; // 입력 스트림으로부터 넘어올 데이터 저장 변수

			// 루프
			while ((data = bis.read()) != -1) { 
				// 인풋 스트링으로부터 데이터를 한개를 읽어서
				// 이것을 4바이트 정수형으로 받아 data에 할당
				// -1이면 더이상 읽을 데이터가 없다는 얘기

				
				System.out.println("Read data: " + data);
				bos.write(data);
			}

			// 위의 아웃풋스트림을 원래자신으로 캐스팅으로 원상복귀해서 배열변환을 써보기?
			outScr = ((ByteArrayOutputStream) bos).toByteArray();

			System.out.println();
			System.out.println("최종결과:" + Arrays.toString(outScr));

		} catch (IOException e) { // IOException 처리해줌 예외처리
			e.printStackTrace();
		} catch (Exception e) { // 혹시 남아있을지 모를 예외처리
			e.printStackTrace();
		} finally {		
//			if (bis != null) {
//				try {
//					bis.close();
//				} catch (Exception e) {
//					
//				}
//				
//			if (bos != null) {
//				try {
//					bos.close();
//				} catch (Exception e) {
//					
//				}
//			} //원래 정상적으로 예외의 예외처리를 통해 안전하게 스트리밍을 완전히 열수있도록 
			
			try {
				bis.close();
				bos.close();
			} catch(Exception e) { 	//여기까지 작성해도 됨(완전히 정상적인 코드는 아니다)
				
			}
		
		}
*/
		//-------------------------------------------
		//-------------------------------------------
		//AutoCloseable -> 자동 자원 해제를 사용한 예외처리 :  try - with - resources
		
		try (	//자원 해제를 필요로 하는 객체를 초기화
			InputStream bis = new ByteArrayInputStream(inScr);
				OutputStream bos = new ByteArrayOutputStream();
				) {
			int data = 0;				//입력 스트림으로부터 입력된 데이터 저장할 변수
		
			while ((data = bis.read()) != -1) {
				System.out.println("Read data:" + data);
				bos.write(data);
			} 
			
			outScr = ((ByteArrayOutputStream)bos).toByteArray();
			System.out.println();
			System.out.println("최종 결과:" + Arrays.toString(outScr));
			
		} catch(IOException e) {
			e.printStackTrace();
		} catch ( Exception e) {
			e.printStackTrace();
		}

		
		
	}
}
