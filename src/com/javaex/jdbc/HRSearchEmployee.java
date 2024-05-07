/*
package com.javaex.jdbc;


import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class HRSearchEmployee {

	public static void main(String[] args) {
//		// statement 사용해서 만들어보기 (teacher's code)
//		
//		  [실습 2] 사원 검색 프로그램 : 클래스 Scanner 를 사용하여 사원 이름을 입력 받아 사원 정보를 검색하는 프로그램 을 작성해
//		  봅시다 부분 이름 검색이 가능해야 합니다 / 성, 이름 컬럼에 대해 OR 검색이 되어야 합니다 / 출력 사원 정보는 이름 성, Email,
//		 전화번호, 입사일입니다  HRSearchEmployees 프로젝트를 만들고 HRSearchEmployee 클래스에서 실행되어야 합니다
//		  

		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbuser = "hr";
		String dbpass = "hr";
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rset = null;
		
		Scanner scanner = new Scanner(System.in);
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(dburl, dbuser, dbpass);
			stmt = con.createStatement();
			
			System.out.print("Enter:");
			String pattern = scanner.nextLine();
			
			
			
			String sql = "SELECT first_name || ' ' || last_name, email, phone_number, hire_date "
					+ "FROM employees WHERE lower(first_name) LIKE '%" + pattern.toLowerCase() + "%' "
					+ "OR lower(last_name) LIKE '%" + pattern.toLowerCase() + "%'";
			
			System.out.println("\nQuery:" + sql + "\n");

			rset = stmt.executeQuery(sql); // DB Cursor 반환

			// ResultSet 순회
			while (rset.next()) {
				String name = rset.getString(1);
				String email = rset.getString(2);
				String phoneNumber = rset.getString(3);
				Date hireDate = rset.getDate(4);

				System.out.printf("%s: %s, %s, %s%n", name, email, phoneNumber, hireDate);
			}
			 	
		} catch (ClassNotFoundException e) {
			System.err.println("jdbc 드라이버를 로드하지 못하였습니다.");
			e.printStackTrace();
		} catch (SQLException e) {
			System.err.println("SQLError");
			e.printStackTrace();
		} finally {
			
			try {
				 rset.close();
			} catch (Exception e) {
				
			}
			
			try {
				con.close();
			} catch (Exception e) {
				
			}
			
			try {
				stmt.close();
			} catch (Exception e) {
				
			}
			
			
		}
		scanner.close();
		
	}
}
*/

package com.javaex.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Scanner;

public class HRSearchEmployee {

	public static void main(String[] args) {
		
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbuser = "hr";
		String dbpass = "hr";
		
		Connection con = null;  
		Statement stmt = null;
		ResultSet rset = null;
		
		 Scanner scanner = new Scanner(System.in);
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			con = DriverManager.getConnection(dburl,dbuser,dbpass);
			stmt = con.createStatement();
			
			// scanner
            
            System.out.println("Enter:");
            String pattern = scanner.nextLine(); // Reading user input
            
				
            String sql = "SELECT first_name, " +
            			 "last_name, " +
            			 "email, " +
            			 "phone_number, " +
            			 "hire_date " +
            			 "FROM employees " +
            			 "WHERE first_name like '%" + pattern + "%' " + //공백주의
            			 "OR last_name like '%" + pattern + "%'";
            
            System.out.println("\nSQL:" + sql + "\n");
            
            rset = stmt.executeQuery(sql);
            
            			while (rset.next()) {
            				String fname = rset.getString(1);
            				String lname = rset.getString(2);
            				String email = rset.getString(3);
            				String phone = rset.getString(4);
            				Date hdate = rset.getDate(5); 		//date 함수 써주기
            	
            				System.out.println("EMPLOYEENAME:" + fname + " " + lname + 
            									" EMAIL:" + email + 
            									" PHONENUM:" + phone +
            									" HIREDATE:" + hdate);
            			}
            
            
		} catch (ClassNotFoundException e) {
			System.err.println("JDBC 드라이버를 로드하지 못했습니다.");
			e.printStackTrace();
			
		} catch (SQLException e) {
			System.err.println("SQLException");
			e.printStackTrace();
			
		} finally { 
			
			try {
				rset.close();
			} catch (Exception e) {
				
			}//1
			
			try {
				con.close();
			} catch (Exception e) {
				
			}//2
			
			try {
				stmt.close();
			} catch (Exception e) {
				
			}//3

			
		}
		scanner.close();

	}

}
