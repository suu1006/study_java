package com.js.condition;

public class ForTenSumTest {
//for문(루프)는 반복문에서 가장 많이 사용됨. 꼭 숙지할것!
	public static void main(String[] args) {
		int totalSum =0;
		for (int i =1; i<101; i++) {
			totalSum = totalSum + i;
			System.out.println(totalSum);
		}
	}
}