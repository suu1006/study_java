package com.js.oprator;

public class LogicOperatorXORTest {

	public static void main(String[] args) {
		boolean isOnPc = true;
		boolean isOnPhone = false;

		if (isOnPc ^ isOnPhone) { //^ = ��Ÿ�� ���� (���� �������� ������, �������� ���� �˾Ƶα�)
			// �ǿ����� �ΰ� �� �ϳ��� true, �ϳ��� false�� �Ǿ�� true ��ȯ
			System.out.println("XOR(^) is true..");
			System.out.println("isOnPc value is " + isOnPc);
			System.out.println("isOnPhone value is " + isOnPhone);
		} else {
			System.out.println("XOR(^) is the others case..");
			System.out.println("isOnPc value is " + isOnPc);
			System.out.println("isOnPhone value is " + isOnPhone);
		}
	}

}
