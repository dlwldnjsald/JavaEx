package com.javaex.io.charstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class BufferedCharStreamEx {

	private static String rootPath = System.getProperty("user.dir") + "\\files\\";
	private static String source = rootPath + "last-leaf.txt";
	private static String target = rootPath + "last-leaf-filtered.txt";

	public static void main(String[] args) {
		// 미션: files\last-leaf.txt -> "줄단위로 읽어들이고"
		// "leaf" or "leaves" 단어가 들어간 문장만 뽑아서 타겟파일 filtered.txt에 저장

		System.out.println("원본파일" + source);
		System.out.println("필터파일" + target);

		// stream 연결
		try (
				// 주스트림 연결
				Reader fr = new FileReader(source);
				Writer fw = new FileWriter(target);

				// 보조스트림 연결
				// 라인 단위 문자열 작업-> Buffer 기능 사용
				BufferedReader br = new BufferedReader(fr);
				BufferedWriter bw = new BufferedWriter(fw);

		)

		{ // 한줄 단위로 읽고 쓰는데에 특화됨
			String line = " ";

			while ((line = br.readLine()) != null) {// 한줄 읽어오기/읽어드릴 라인없으면 널이다
//1)				System.out.println(line);
				
//2)			//잠시 위에 출력코드 주석처리후 lear,leaves가 들어가있는 라인만 필터링하기
				if (line.toLowerCase().contains("leaf") ||  
					line.toLowerCase().contains("leaves")) {//소문자로 바꿨을때 leaf,leaves를 포함할경우 해당 명령을 수행해라
//					System.out.println(line);
					
//3)			//필터링된 라인만 별도 저장
				bw.write(line);
				bw.newLine();
					
				}
				
			}
			
			System.out.println("필터링 완료!");
//3)
			
			// 예외처리
		} catch (FileNotFoundException e) {
			System.err.println("파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
