package com.js.condition;

public class IfTest {

	public static void main(String[] args) {
		int mathScore = 51;
		
		if(mathScore > 50) {
			System.out.println("mathScore is > 50");
		}
		if (mathScore ==51) {
			System.out.println("mathScore is 51");
		}
		
		System.out.println("main method is end");
	}
}

//   if(조건식) {
//   여러 로직 수행
//   } 조건에 맞지 않으면 {}중괄호 부분 수행하지 않음