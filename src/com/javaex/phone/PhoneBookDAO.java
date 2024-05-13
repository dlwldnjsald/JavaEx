package com.javaex.phone;

import java.util.List;



// 2. DAO interface 클래스 구현하여 CRUD 메서드 정의 해보기 
public interface PhoneBookDAO {

	
	public List<PhoneBookVO> getList(); //전체 전화번호부 목록을 가져옵니다
	public boolean insert(PhoneBookVO phonebookvo); //새로운 전화번호부 항목을 추가합니다.
	public boolean delete(int index); //지정된 인덱스에 해당하는 전화번호부 항목을 삭제합니다.
	public PhoneBookVO search(int id);// 지정된 ID에 해당하는 전화번호부 항목을 가져옵니다.
	
	
	
	
	
}
