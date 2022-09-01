package com.js.datatype;

public class CastingTest {

	public static void main(String[] args) {
	System.out.println("CastingTest");
	char inValue = 'ㄲ';
	int outResult = inValue;
	System.out.println("ㄲ to int value is [" + outResult + "]" );

	int inValue02 = 12594;
	char outResult02 = (char)inValue02;
	System.out.println("12594 to char value is [" + outResult02 + "]" );
	}
}
//작은 크기 -> 큰 크기 : 자동타입 변환 / 큰 크기 -> 작은 크기 : 강제타입 변환(캐스팅)
//byte(1) < short(2) < int(4)