package com.javaex.oop.goods.v2;

public class GoodsApp {

	public static void main(String[] args) {
		// 
		
		//1번째 문제
		Goods camera = new Goods();	 // Goods는 Goods 클래스에서 가져온것 ,
									 // camera는 참조 변수 
		
		//1번째 문제
		camera.name = "nikon";
		camera.price = 400_000;
		// GoodsApp 클래스를 따로 만들어서 레퍼런스 변수를  camera로 한다음
		//이객체의 데이터인 각각의 인스턴스변수는 다음과 같은 값을 설정해주기 
		
		
		//2번째 문제
		Goods notebook = new Goods(); //이거 꼭 써줘야함
				
		notebook.name = "LG그램";
		notebook.price = 900_000;
		//=============================================		
		Goods mug = new Goods();
				
		mug.name = "머그컵";
		mug.price = 2_000;
				
		//=============================================
		
		
		// 최종 상품정보 출력해보기
		
		//1번문제
		System.out.printf("%s, %,d원%n",
				camera.name,
				camera.price);
		//2번문제
		System.out.printf("%s, %,d원%n",
				notebook.name,
				notebook.price);
		System.out.printf("%s, %,d원%n",
				mug.name,
				mug.price);
		
		
//================================================		
		
		
	}

}