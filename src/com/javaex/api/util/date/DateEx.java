package com.javaex.api.util.date;

import java.text.DateFormat;
import java.util.Date;
//java.sql.Date와 혼동하지 말것 주의 //ctrl+shift+o 해줘서 바로 임포트해주기

public class DateEx {

	public static void main(String[] args) {
		// 날짜, 시간 데이터를 표현하는 객체
		// 날짜 관련 기능은 Calendar 객체
			
		Date now = new Date();   // 현재 날짜와 시간
		
		System.out.println("현재시간:" + now); //(KST stands for Korean Standard Time)
		System.out.println(); 
	
		//기본 출력
		//DateFormat 클래스로 기본적인 출력 형식을 맞출수 있음
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL); //FULL 
		System.out.println("FULL:" + df.format(now));
		df = DateFormat.getDateInstance(DateFormat.LONG);	//LONG ->full과 비교시 요일정보 빠져있음
		System.out.println("LONG:" + df.format(now)); 		
		df = DateFormat.getDateInstance(DateFormat.MEDIUM);	//MEDIUM
		System.out.println("MEDIUM:" + df.format(now));
		df = DateFormat.getDateInstance(DateFormat.SHORT);	//SHORT
		System.out.println("SHORT:" + df.format(now));
		
		
		//date 포맷과 time 포맷을 사용하여 표기할수 있다.
	}

}
