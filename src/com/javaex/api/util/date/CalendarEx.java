package com.javaex.api.util.date;

import java.util.Calendar;

public class CalendarEx {

	public static void main(String[] args) {
		
		// calendar 불러오기: .getInstance()를 통해 인스턴스 확보 가능하다
		Calendar now = Calendar.getInstance(); 		//현재 날짜와 시간
		Calendar custom = Calendar.getInstance();
		
		//시간 정보 설정
		custom.set(2012, 8, 24); 					//2012.9.24인 셈
		
		
		//상수를 이용한 날짜 정보 얻어오기 겟하기
		//년 월 일 정보를 가져오기
		int nowYear = now.get(Calendar.YEAR);
		int nowMonth = now.get(Calendar.MONTH) + 1; //월 정보는 +1해줘야 1월은 0부터시작하기때문	
		int nowDate = now.get(Calendar.DATE);
		
		System.out.printf("오늘은 %d년 %d월 %d일 입니다. %n", nowYear, nowMonth, nowDate);
		System.out.println();
		
		
		
		//미래로 여행을 떠나보기
		Calendar future = Calendar.getInstance();	//현재 시간
		future.add(Calendar.YEAR, 10);				//현재 날짜 정보에 10년 더함
		System.out.printf("10년 후 오늘은 %d년 %d월 %d일 입니다, %n" ,
				future.get(future.YEAR),
				future.get(future.MONTH) + 1,
				future.get(future.DATE));
		
		//요일 정보 확인
		int dow = future.get(Calendar.DAY_OF_WEEK);	//요일정보 확인 .2034.4.3은 월요일일것이다 (일요일은 1부터 세기)
		System.out.println(dow);
		
		
		
		
	}

}
