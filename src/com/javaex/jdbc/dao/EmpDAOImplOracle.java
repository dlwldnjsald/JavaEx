package com.javaex.jdbc.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmpDAOImplOracle implements EmpDAO {

	private Connection getConnection() throws SQLException {
		Connection conn = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String dburl = "jdbc:oracle:thin:@localhost:1521:xe";

			conn = DriverManager.getConnection(dburl, DatabaseConfigHr.DB_USER, DatabaseConfigHr.DB_PASS);
		} catch (ClassNotFoundException e) {
			System.err.println("CANNOT FIND DRIVER");

		}

		return conn;

	}

	@Override
	public List<EmpVO> getList() {
		List<EmpVO> list = new ArrayList<>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			
			String sql = "SELECT emp.employee_id, "
					+ "emp.first_name, "
					+ "emp.last_name empl, "
					+ "emp.email, "
					+ "emp.phone_number, "
					+ "emp.hire_date "
					+ "FROM employees ORDER BY empl DESC";
			
			rs = stmt.executeQuery(sql);
			
				while (rs.next()) {
					Long employeeid = rs.getLong(1);
					String fname = rs.getString(2);
					String lname = rs.getString(3);
					String email = rs.getString(4);
					String pnum = rs.getString(5);
					Date hdate = rs.getDate(6);
					
					EmpVO vo = new EmpVO(employeeid, fname, lname, email, pnum, hdate);
					list.add(vo);
				}
			
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					if (rs != null) rs.close();
					if (stmt != null) stmt.close();
					if (conn != null) conn.close();
				} catch (Exception e) {
					
				}
			}
		
		return list;
	}

	@Override
	public EmpVO get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert(EmpVO empvo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(EmpVO empvo) {
		// TODO Auto-generated method stub
		return false;
	}

}
