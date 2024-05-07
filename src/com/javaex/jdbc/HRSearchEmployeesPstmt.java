package com.javaex.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.Scanner;

public class HRSearchEmployeesPstmt {

	public static void main(String[] args) {
		// db 접속정보연결
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbuser = "hr";
		String dbpass = "hr";

		// connection, preparedStatement, resultSet 변수 선언, 초기화
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;

		// scanner open
		Scanner scanner = new Scanner(System.in);

		// try- catch
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(dburl, dbuser, dbpass);

			// scanner 입력받기
			System.out.print("Enter:");
			String pattern = scanner.nextLine();

			// 실행 계획 수립 sql 작성 ---------------------------------
			String sql = "SELECT first_name || ' ' || last_name, email, phone_number, hire_date " 
    				+ "FROM employees WHERE lower(first_name) like ? " 
    				+ "OR lower(last_name) like ?";
       
      
			// -->실행계획을 기반으로 PSTMT 세워주기
			pstmt = con.prepareStatement(sql);

			// -->동적 파라미터 바인딩하기
			pstmt.setString(1, "%" + pattern + "%");
			pstmt.setString(2, "%" + pattern + "%");

			// 쿼리를 수행해주세요
			rset = pstmt.executeQuery();
			// -----------------------------------------------------

			// while문 loop 돌기
			
			while (rset.next()) {
				String name = rset.getString(1);
				String email = rset.getString(2);
				String phoneNumber = rset.getString(3);
				Date hireDate = rset.getDate(4); // date 함수 써주기

				System.out.printf("%s: %s, %s, %s%n", name, email, phoneNumber, hireDate);
			}
			
			
		} catch (ClassNotFoundException e) {
			System.err.println("JDBC 드라이버를 로드하지 못했습니다.");
			e.printStackTrace();

		} catch (SQLException e) {
			System.err.println("SQLException");
			e.printStackTrace();

	

		} finally {
			try {
				if(rset != null) rset.close();
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (Exception e) {

			}
			
		}

		scanner.close();
	}

}

