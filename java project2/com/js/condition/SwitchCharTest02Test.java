package com.js.condition;

public class SwitchCharTest02Test {

	public static void main(String[] args) {
		// A 또는 B 출력할때
		char alphabet =  'A';
		switch (alphabet) {
		case 'A':
		case 'B':
			System.out.println("alphabet is A or B");
			break;
		case 'C':
			System.out.println("alphabet is C");
			break;
		default:
			System.out.println("alphabet is D~Z");
			break;
		}

	}

}
		