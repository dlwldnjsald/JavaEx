package com.javaex.ex07;

import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

        Friend[] friendArray = new Friend[3];    //fried배열 3개 만들어주기 (length==3인)배열
        Scanner sc = new Scanner(System.in);	//스캐너 열기 개방

        System.out.println("친구를 3명 등록해 주세요");	//프롬프트를 출력했음

        
        //for문 시작 루프돌리기 
        //친구정보 3명 입력 로직 --> 반복문 사용
        for(int i =0; i<3; i++) {  //for(초기화,조건연산,증감)
        	
        	//이제 데이터 입력해주기
         	String name,hp,school;			//변수 선언하기
         	
         	name = sc.next();	//스캐너로부터 문자열을 전달받는다
        	hp = sc.next();		//스캐너로부터 문자열을 전달받는다
        	school = sc.next();	//스캐너로부터 문자열을 전달받는다
        	
        	Friend newFriend = new Friend();   //주의) 메모리상에 friend를 만들어주고
        	newFriend.setName(name);
        	newFriend.setHp(hp);
        	newFriend.setSchool(school);   //만들어 두고 이제 연결시키기
        	
        	
        	//배열에 참조주소 할당해주기
        	
        	
        	
        }  
      
        
        
        //for문 끝
        
        
        // 친구정보 출력
        for (int i = 0; i < friendArray.length; i++) {
            //친구정보 출력 메소드 호출
        }

        sc.close();
    }

}
