package com.je.refertype;

public class ArraySeperateTest {

	public static void main(String[] args) {
		String[] names = null; 
		names = new String[] {"ö��", "����", "�浿"};//����� ������ �и��� new ���.
		
		System.out.println("names[0] value is " + names[0]);
		System.out.println("names[1] value is " + names[1]);
		System.out.println("names[2] value is " + names[2]);
		
		System.out.println("names.length value is " + names.length);

	}

}
