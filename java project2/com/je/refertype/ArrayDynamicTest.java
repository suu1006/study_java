package com.je.refertype;

public class ArrayDynamicTest {

	public static void main(String[] args) {
		String[] names = new String[5]; //�̿� ���� ���·� ���� �����. 
		
		names[0] = "�μ�";
		names[1] = "ö��";
		names[2] = "����";
		names[3] = "����";
		names[4] = "����";

		for (int i = 0; i< names.length; i++) {
			System.out.println("names[" + i + "]" + names[i]);
		}
	}
}