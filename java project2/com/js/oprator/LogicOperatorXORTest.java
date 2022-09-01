package com.js.oprator;

public class LogicOperatorXORTest {

	public static void main(String[] args) {
		boolean isOnPc = true;
		boolean isOnPhone = false;

		if (isOnPc ^ isOnPhone) { //^ = 배타적 논리합 (많이 사용되지는 않지만, 가독성을 위해 알아두기)
			// 피연산자 두개 중 하나는 true, 하나는 false가 되어야 true 반환
			System.out.println("XOR(^) is true..");
			System.out.println("isOnPc value is " + isOnPc);
			System.out.println("isOnPhone value is " + isOnPhone);
		} else {
			System.out.println("XOR(^) is the others case..");
			System.out.println("isOnPc value is " + isOnPc);
			System.out.println("isOnPhone value is " + isOnPhone);
		}
	}

}
