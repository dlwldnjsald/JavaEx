package com.javaex.oop.goods.v2;

public class GoodsApp {

	public static void main(String[] args) {
		// 
		
		//1번째 문제
		Goods camera = new Goods();	 // Goods는 Goods 클래스에서 가져온것 ,
									 // camera는 참조 변수 
		
		//1번째 문제
		camera.setName("nikon");
		camera.setPrice(400_000);
		// GoodsApp 클래스를 따로 만들어서 레퍼런스 변수를  camera로 한다음
		//이객체의 데이터인 각각의 인스턴스변수는 다음과 같은 값을 설정해주기 
		
		
		//2번째 문제
		Goods notebook = new Goods(); //이거 꼭 써줘야함
				
		notebook.setName("LG그램");
		notebook.setPrice(900_000);
//		notebook.setPrice(-10_000_000); 누가 악의적으로 이렇게 세팅할수도 있기에
		//=============================================		
		Goods mug = new Goods();
				
		mug.setName("머그컵");
		mug.setPrice(2_000);
				
		//=============================================
		
		
//		// 최종 상품정보 출력해보기 (
//		
//		//1번문제
//		System.out.printf("%s, %,d원%n",
//				camera.getName(),
//				camera.getPrice());
//		//2번문제
//		System.out.printf("%s, %,d원%n",
//				notebook.getName(),
//				notebook.getPrice());
//		System.out.printf("%s, %,d원%n",
//				mug.getName(),
//				mug.getPrice());
//		
		
//================================================		
		
		
		// 최종 상품정보 출력해보기 (getter사용)
		
		//1번문제
		System.out.printf("%s, %,d원%n",
				camera.getName(),
				camera.getPrice());
		//2번문제
		System.out.printf("%s, %,d원%n",
				notebook.getName(),
				notebook.getPrice());
		System.out.printf("%s, %,d원%n",
				mug.getName(),
				mug.getPrice());
		
		// 상품 정보 출력 (메서드 활용)
		camera.showInfo();
		notebook.showInfo();
		mug.showInfo();
		
		
	}

}

//=================================================