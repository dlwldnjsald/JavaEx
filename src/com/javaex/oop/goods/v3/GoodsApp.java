//0325 강의문

package com.javaex.oop.goods.v3;

public class GoodsApp {

	public static void main(String[] args) {
//		Goods camera = new Goods();
		Goods camera = new Goods(
				"nikon", 400_000);

//		camera.setName("nikon");
//		camera.setPrice(40_000);
		
//		Goods notebook = new Goods();
		Goods notebook = new Goods(
				"LG그램",
				900_000
				);
		
//		notebook.setName("LG그램");
//		notebook.setPrice(900_000);
//		notebook.setPrice(-10000000);
		
//		Goods mug = new Goods();
//		
//		mug.setName("머그컵");
//		mug.setPrice(2_000);
		Goods mug = new Goods(
				"머그컵",
				2_000);
		
		//	상품 정보 출력(getter 활용)
		System.out.printf("%s, %,d원%n", 
				camera.getName(),
				camera.getPrice());
		System.out.printf("%s, %,d원%n", 
				notebook.getName(),
				notebook.getPrice());
		System.out.printf("%s, %,d원%n", 
				mug.getName(),
				mug.getPrice());
		
		//	상품 정보 출력 (메서드 활용)
		camera.showInfo();
		notebook.showInfo();
		mug.showInfo();
	}

}