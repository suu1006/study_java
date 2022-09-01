package com.je.refertype;

public class ArrayStringTest {

	public static void main(String[] args) {
		String[] names = { "Ã¶¼ö", "¿µÈñ", "±æµ¿" };

//		System.out.println("names[0] value is" + names[0]);
//		System.out.println("names[1] value is" + names[1]);
//		System.out.println("names[2] value is" + names[2]);

		for (int i = 0; i < names.length; i++) {
			System.out.println("names value[" + i + "]" + names[i]);
		}
	}
}
