package com.js.condition;

public class ForContinue {

	public static void main(String[] args) {
		for (int i = 0; i< 11; i++) {
			if (i % 2 ==0) { // 나머지가 없다. 2로나누어 떨어진다. 짝수
				continue; //아래로 이동하지 않고 조건문을 탄다.
			}
			System.out.println(i); //홀수만 출력
		}
	}
}