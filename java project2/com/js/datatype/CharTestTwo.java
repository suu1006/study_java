package com.js.datatype;

public class CharTestTwo {

	public static void main(String[] args) {
		char ch1 = 'a'; //���� ���� ����
		char ch2 = 97; //10������ ����
		char ch3 = '\u0061'; //16������ ����

		char ch01 = '��';
		char ch02 = 44057;
		char ch03 = '\uAC19';
		
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