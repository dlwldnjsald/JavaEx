package com.javaex.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class HRSalaryPstmt {

	public static void main(String[] args) {
		// sql 부분에서 동적으로 바인딩 할 파라미터를 집어넣는다고 할때 
		// PREPAREDSTATEMENT 사용해보기 
		
		//db 접속정보 연결(url,user,pass)
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbuser = "hr";
		String dbpass = "hr";
	
		// Connection, PreparedStatement, ResultSet 변수선언 및 초기화
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		//스캐너 오픈
		Scanner scanner = new Scanner(System.in);

		
		//try-catch문---------------------------------------------------
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); 			//driver 로드 
			conn = DriverManager.getConnection(dburl, dbuser, dbpass);  //conn 얻어오기

			
			//오픈한 스캐너 설정 및 입력받기
			System.out.print("최소급여 최대급여:");
			String keyword = scanner.nextLine();
			
			//스트링 배열 input선언 공백문자 기준으로 스플릿
			String[] input = keyword.trim().split(" ");

				
				//-->실행 계획 수립 ----------------------------------------------------
				String sql = "SELECT first_name || ' ' || last_name, salary FROM employees " +//공백주의
					"WHERE salary BETWEEN ? AND ? ORDER BY salary ASC";
				
				//-->실행계획을 기반으로 PSTMT 세워주기
				pstmt = conn.prepareStatement(sql);
				
				//-->동적 파라미터 바인딩하기 
				pstmt.setString(1, input[0]); //1번째 ?로된 바인딩 컬럼 위치에다 input[0]을 연결시키는것을 세팅해줌
				pstmt.setString(2, input[1]); //same
				
				//--> 쿼리를 수행해주세요
				rs = pstmt.executeQuery(); // DB Cursor 반환 //
				//-------------------------------------------------------------------
				
				// ResultSet 순회-while loop 
				while (rs.next()) {
					
					String name = rs.getString(1);
					int salary = rs.getInt(2);

					System.out.printf("%s\t%d%n", name, salary); //%d 숫자데이터 %n 개행
				}
				
		//예외처리 		
		} catch (ClassNotFoundException e) {
			System.err.println("JDBC 드라이버를 로드하지 못했습니다.");
			e.printStackTrace();
		} catch (SQLException e) {
			System.err.println("SQLError!");
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e) {

			}
			
		}

		scanner.close();
	}

}

