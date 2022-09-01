package com.js.condition;

public class NullPionterExceptionTest { //null관련 에러들이 많이 발생
 // length는 문자열의 길이를 출력하는 method.
	public static void main(String[] args) {
		String test = "refer";
		System.out.println("test value is " + test);
		System.out.println("test length value is " + test.length());
	}
}