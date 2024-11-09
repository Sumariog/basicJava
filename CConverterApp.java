package com.javaex.problem04;


public class CConverterApp {

    public static void main(String[] args) {

        double dollar;
        double won;
        
        CConverter.setRate(1154.42);
        
        
        //백만원을 달러로 출력
		CConverter.toDoller(1000000);
		CConverter.toString();
        
        //100달러를 원으로 출력
		CConverter.toWon(100);
		CConverter.toString();
        
        
    }

}
