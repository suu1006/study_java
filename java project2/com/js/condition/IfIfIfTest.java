package com.js.condition;

public class IfIfIfTest { //3중 if문은 지양할 것 (읽기 너무 힘듬)

	public static void main(String[] args) {
		char gubun = 'F';
		int age = 20;
		boolean join = true;
		
		if (gubun == 'F') {
			if (age ==20) {
				System.out.println("Female.. age is 20");
				
				if(join) {
					System.out.println("Female.. age is 20 join true");
				} else { System.out.println("Female.. age is 20 join false");
				}
			} else { System.out.println("Female.. age is not 20");
		}
		} else if (gubun=='M') {
			System.out.println("male");
		} else { System.out.println("unknown case");
	}
	}
}