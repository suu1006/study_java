package com.js.condition;

public class IfScoreTest {

	public static void main(String[] args) {
		int score = 100;
		char grade = ' ';

		if (score == 90) {
			System.out.println("grade is A");
		} else if (score == 80) {
			System.out.println("grade is B");
		} else if (score == 70) {
			System.out.println("grade is C");
		} else
			System.out.println("grade is D");
	}
}
//학원 답안
//if (score == 90) {
//	grade = 'A'
//} else if (score == 80) {
//	grade = 'B'
//} else if (score == 70) {
//	grade = 'C'
//} else
//	grade = 'D'
//System.out.println("Math Grade is [" + grade + "]" )
//}
//}