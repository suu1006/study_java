package com.js.condition;

public class IfIfTest {

	public static void main(String[] args) {
		char gubun = 'F' // m:male f : female / gubun은 구분
		int age = 20;
	
		if(gubun =='F') {
			if (age == 20) {
				System.out.println("Female .. age is 20");
			} else { System.out.println("Female .. age is not 20");
		}
		} else if (gubun =='M') {
			System.out.println("male");
		}
		else {
		System.out.println("unnknown case..");
	}
	}
}

// 이중 if문까지 알고있으면 됨