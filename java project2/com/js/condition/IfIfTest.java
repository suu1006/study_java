package com.js.condition;

public class IfIfTest {

	public static void main(String[] args) {
		char gubun = 'F' // m:male f : female / gubun�� ����
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

// ���� if������ �˰������� ��