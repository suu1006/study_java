package com.js.datatype;

public class CharTest {

	public static void main(String[] args) {
		char ch1 = 'A'; //���ڸ� ���� ����
		char ch2 = 65; // 10������ ����
		char ch3 = '\u0041'; //16����(2������ 10������ ���� ����)�� ����

		char ch01 = '��';
		char ch02 = 12593;
		char ch03 = '\u3131';

		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);

		System.out.println(ch01);
		System.out.println(ch02);
		System.out.println(ch03);

		int uniCode = ch01;
		System.out.println(uniCode);
	}
}
