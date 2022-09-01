package com.js.oprator;

public class TernaryOperatorTest { //삼항연산자

	public static void main(String[] args) {
		int gildongAge = 30;
		
		char isAdult = (gildongAge  > 20 ) ? 'T' : 'F';//성인여부 확인로직
		
		System.out.println("gildong isAdult value is [" + isAdult + "]" );
	}
}