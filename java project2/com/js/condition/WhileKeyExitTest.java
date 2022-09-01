package com.js.condition;

import java.io.IOException;

public class WhileKeyExitTest {

	public static void main(String[] args) throws IOException {
		boolean isRun = true;
		int keyCode =0;
		
		while (isRun) {
			keyCode = System.in.read(); //키를 입력 받습니다.
			
			if(keyCode  == 49) { //숫자1의 키코드
				isRun = false; //while 탈출 / 조건문이 거짓이면 빠져나옴
			} else { System.out.println("keyCode value is " + keyCode);
		}

	} System.out.println("Program is End");

	}
}