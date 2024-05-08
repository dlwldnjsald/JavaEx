package com.javaex.jdbc.dao;

import java.util.Iterator;
import java.util.List;

public class EmpDAOApp {

	public static void main(String[] args) {
		listEmployees();
		System.out.println();
		

	}

	
	//----------------------------------------------------------
	private static void listEmployees() {
		
		EmpDAO dao = new EmpDAOImplOracle();
		System.out.println("=========Employees List========");
		
		List<EmpVO> list = dao.getList();
			
			if(list.size() > 0) {
				Iterator<EmpVO> it = list.iterator();
					while (it.hasNext()) {
						EmpVO vo = it.next();
						System.out.printf("%d\t%s\t%s\t%s\t%s\t%d%n", 
								vo.getEmployeeId(), vo.getFname(), vo.getLname(),
								vo.getEmail(), vo.getPnum(), vo.getHdate());
					}
					
			} else {
				System.out.println("HAVE NO DATA");
			}
	
	}
	//----------------------------------------------------------	
	

	
	
}
