package com.je.refertype;

public class ArrayTest { //배열은 0부터

	public static void main(String[] args) {
		int[] ages = { 10, 20, 30, 40 };
		int score[] = { 100, 200, 300, 400 };
//
//		System.out.println("ages[0] value is " + ages[0]);
//		System.out.println("ages[1] value is " + ages[1]);
//		System.out.println("ages[2] value is " + ages[2]);
//		System.out.println("ages[3] value is " + ages[3]);
//
//		System.out.println("score[0] value is " + score[0]);
//		System.out.println("score[1] value is " + score[1]);
//		System.out.println("score[2] value is " + score[2]);
//		System.out.println("score[3] value is " + score[3]);
		
		System.out.println("ages.length value is " + ages.length);
		
		for (int i = 0; i<ages.length; i++) {
			System.out.println("ages[" + i + "]" + ages[i]);
		}
		System.out.println("score.length value is " + score.length);
		for (int j = 0; j<ages.length; j++) {
			System.out.println("score[" + j+ "]" + score[j]);
		}
	}
}