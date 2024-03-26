package com.javaex.basic.loop;

public class MiniLotto {

	public static void main(String[] args) {
		forLotto();
		System.out.println();
		whileLotto();
	}
	
	public static void forLotto() {
		for (int i = 0; i < 6; i++) {
			System.out.print((int)(Math.random() * 45) + 1 + " ");
		}
	}
	
	public static void whileLotto() {
		int i = 0;
		while(i < 6) {
			System.out.print((int)(Math.random() * 45) + 1 + " ");
			i += 1;
		}
	}

}
