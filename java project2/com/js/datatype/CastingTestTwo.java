package com.js.datatype;

public class CastingTestTwo {

	public static void main(String[] args) {
		float inRectRate = 3.14F;
		int outRectRate = (int) inRectRate; //int는 정수값만 출력. (소수점버리고 3출력)
		System.out.println("outRectRate value is [" + outRectRate + "]" );
	}
}