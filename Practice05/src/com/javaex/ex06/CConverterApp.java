package com.javaex.ex06;


public class CConverterApp {

    public static void main(String[] args) {

        double dollar;
        double won;
        
        CConverter.setRate(1118.70); //환율 세팅	
        
        //100만원을 달러로 출력하기
        dollar = CConverter.toDollar(1_000_000);
        System.out.println("백만원은 " + dollar + "달러입니다.");
        
        //100달려를 원으로 출력하기
        won = CConverter.toKWR(100);
        System.out.println("백달러는 " + won + "원입니다.");
        
        
    }

}
