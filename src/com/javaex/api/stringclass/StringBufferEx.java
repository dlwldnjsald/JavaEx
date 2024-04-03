package com.javaex.api.stringclass;

public class StringBufferEx {

	public static void main(String[] args) {
		//String은 불변, immutable,
		//StringBuffer는 내부에 버퍼를 두고, 버퍼에서 작업
		//최종 소비되는 시점에서 문자열로 반환
		//메모리 관리 축변에서 String 보다 유리
		
		//버퍼 생성 
		StringBuffer sb = new StringBuffer("This");   // This 라는 10개짜리 버퍼 생겨남 
		System.out.println(sb);				//추가는 append 삽입은 insert 변경은 replace 제거는 remove 소환
		
		//문자열 추가 : append
		sb.append(" is pencil");			//새로 만들어져 생성되는게 아니고 공백공간에 추가됨
		System.out.println(sb);	
		
		//문자열 삽입 : insert
		sb.insert(7, " my");				//7번 인덱스에 (문자열이있으면 뒤로 밀고) 그 위치에삽입하겠다는 코드
		System.out.println(sb);			
		
		//문자열 치환 : replace 
		sb.replace(7, 10, " your");			//7번 부터 10번 인덱스까지를 your로 변경한다
		System.out.println(sb);
	
		System.out.println(); 
		System.out.println("-------------------------------------------------");
		
		
		// 메서드 세이닝 : 메서드를 연속적으로 호출해서 객체를 변화시키는 방법 // 위 코드의 단순화 작업
		StringBuffer sb2 = new StringBuffer("this")
			.append(" is pencil")		
			.insert(7, " my")
			.replace(7, 10, " your");			
		
		System.out.println(sb2);
		
		
	}

}


// StringBuilder 와 StringBuffer의 차이점
//스트링 버퍼는 서로 똑같은 객체를 다룰수 있게 되는 데 
//중복 접근을 막아줌 내부데이터의 동기화 작업을 수행해 주고 Thread-Safe라고 하는데 안전함
//싱글 스레드용 멀티 스레드용 다양함

