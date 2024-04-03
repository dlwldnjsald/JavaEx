package com.javaex.api.util.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
//java.sql.Date와 혼동하지 말것 주의 //ctrl+shift+o 해줘서 바로 임포트해주기

public class DateEx {

	public static void main(String[] args) {
		// 날짜, 시간 데이터를 표현하는 객체
		// 날짜 관련 기능은 Calendar 객체
			
		Date now = new Date();   // 현재 날짜와 시간
		
		System.out.println("현재시간:" + now);
		System.out.println(); 
		 //(KST stands for Korean Standard Time)
	
		//기본 출력
		//DateFormat 클래스로 기본적인 출력 형식을 맞출수 있음
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL); //FULL 형식
		System.out.println("FULL:" + df.format(now));
		df = DateFormat.getDateInstance(DateFormat.LONG);	//LONG 
		System.out.println("LONG:" + df.format(now)); 		
		df = DateFormat.getDateInstance(DateFormat.MEDIUM);	//MEDIUM
		System.out.println("MEDIUM:" + df.format(now));
		df = DateFormat.getDateInstance(DateFormat.SHORT);	//SHORT
		System.out.println("SHORT:" + df.format(now));
		System.out.println();
		//system setting 시스템 설정 정보를 이용해서 한글로 출력이 되는 이유임
		
		
		
		//date 포맷과 time 포맷을 사용하여 원하는 형식의 날짜 시간 문자열을 출력할수 있다
		//SimpleDateFormat클래스를 이용하는 방법을 많이 선호한다 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 55초");
		System.out.println("날짜 포맷:" + sdf.format(now));
		
		
		//최근에는 date보다 캘린더가 날짜조작 더 많이 담당중
		
	}

}
