package com.js.datatype;

public class CastingTest {

	public static void main(String[] args) {
	System.out.println("CastingTest");
	char inValue = '��';
	int outResult = inValue;
	System.out.println("�� to int value is [" + outResult + "]" );

	int inValue02 = 12594;
	char outResult02 = (char)inValue02;
	System.out.println("12594 to char value is [" + outResult02 + "]" );
	}
}
//���� ũ�� -> ū ũ�� : �ڵ�Ÿ�� ��ȯ / ū ũ�� -> ���� ũ�� : ����Ÿ�� ��ȯ(ĳ����)
//byte(1) < short(2) < int(4)