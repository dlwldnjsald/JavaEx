package com.javaex.io.charstream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.StringTokenizer;

public class StringTokenizerEx {

	private static String rootPath = System.getProperty("user.dir") + "\\files\\";
	private static String filename = rootPath + "thieves.txt";

	public static void main(String[] args) {

		System.out.println("원본:" + filename);

		// try catch문
		try (
				// stream open
				Reader fr = new FileReader(filename); // 주스트림 열기 +import 잊지말기
				BufferedReader br = new BufferedReader(fr); // fr 에 보조스트림 연결

		) {
			String line; // 한줄을 읽어오기 위한 변수 설정

			while ((line = br.readLine()) != null) { // bufferedreader 로부터 한줄을 읽어오라는것을 while 문으로 코드작성

				// 토크나이징
				StringTokenizer st = new StringTokenizer(line, " ");
				while (st.hasMoreTokens()) { // 뒤에 토큰이 더 있는가를 확인해보는 코드
					String token = st.nextToken();
					System.out.println("Token:" + token);
				}
			}

			br.close(); // br을 닫는다 //보조스트림을 닫으면 주스트림도 닫힌다.

		} catch (FileNotFoundException e) {
			System.err.println("파일이 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
