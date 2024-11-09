package com.javaex.problem04;

public class CConverter {
    
    public static double rate;
    
    public static void setRate(double r){
        CConverter.rate = r;
    }
    
    public static double toDoller(double won){
        return won / rate;
    }

    public static double toKRW(double dollar){
        return dollar * rate;
    }
    
	public void toString(){
		System.out.println("백만원은 " + this.toDoller + "달러입니다.");
		System.out.println("백달러는 " + this.toKRW + "입니다." );
	}
}
