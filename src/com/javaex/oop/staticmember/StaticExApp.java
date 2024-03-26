package com.javaex.oop.staticmember;

public class StaticExApp {

	public static void main(String[] args) {
		StaticEx s1 = new StaticEx();		//1)클래스가 로드될것  -> 이것을 기반으로 heap영역에 객체가 생성될것 2)생성자호출됨
		System.out.println("refCount: " + s1.refCount);
		
		StaticEx s2 = new StaticEx();		//
		System.out.println("refCount: " + StaticEx.refCount);
		
		StaticEx s3 = new StaticEx();
		System.out.println("refCount: " + StaticEx.refCount);
		
		System.out.println("===========================");
		//=========================================================
		//
		//note.
		//이부분은 스태틱 영역에서 메모리 공유를 테스트 하기 위한 테스트일뿐,
		//직접 가비지 컬렉터를 호출하는것은 권장하지 않습니다
		s3 = null; //참조 해제
		System.out.println("s3 해제");
		System.out.println("refCount: " + StaticEx.refCount);
		
		
		System.gc(); 						//가비지 컬렉터 호출  
			try {
				Thread.sleep(3000);;	//3초 대기 후 입력되는 것을 알수 있음 
				System.out.println("refCount: " + StaticEx.refCount);
			} catch (Exception e) {
				
			}
	}
	
	
	
	
}
