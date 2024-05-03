package com.javaex.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe"; //오라클 db에 있는 프로젝트생성시 만들었던 로컬호스트정보 
		String dbuser = "hr";
		String dbpass = "hr";
		
		Connection conn = null;
		
		try { 
			// 드라이버 로드 
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 접속 문자열, 계정, 비번을 이용 데이터베이스 접속 시도
			conn = DriverManager.getConnection(dburl, dbuser, dbpass);
			
			// 데이터 베이스 접속 성공
			System.out.println(conn);
			System.out.println("연결 성공!");
		} catch (ClassNotFoundException e) {
			System.err.println("JDBC 드라이버를 로드하지 못했습니다.");
			e.printStackTrace();
		} catch (SQLException e) {
			System.err.println("SQLError!");
		} finally {
			try { 
				conn.close();
			} catch (Exception e) {
		}
		
	}

   }
}
