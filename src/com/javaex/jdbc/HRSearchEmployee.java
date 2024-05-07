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
            			 "WHERE first_name like '%" + pattern +
            			"%' OR last_name like '%" + pattern + "%'";
            
            System.out.println("\n" + "SQL:" + sql + "\n");
            
			/*
			 String sql = "SELECT first_name || ' ' || last_name, email, phone_number, hire_date " +
            				+ "FROM employees WHERE lower(first_name) like '%" + pattern.toLowerCase() + "%' 
            				+ "OR lower(last_name) like '%" + pattern.toLowerCase() + "%'";
            			
			 */
			
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
