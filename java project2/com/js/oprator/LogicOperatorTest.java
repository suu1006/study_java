package com.js.oprator;
//������ ���� : �׽�Ʈ = 1:1 ���� ���α׷��̴��� �� Ȯ���ϱ�!
public class LogicOperatorTest {

	public static void main(String[] args) {
		boolean isOnTv = true;
		boolean isOnRadio = false;

		if (isOnTv && isOnRadio) { //���� �ǿ����ڸ� �˻��Ͽ� false�� �ڿ� �����ڸ� 
			//�˻����� �ʽ��ϴ�. ȿ�����̹Ƿ� �ǹ����� �̰��� ���� ���ϴ�.
			System.out.println("AND(&&) is true.. isOnTv isOnRadio ");
			System.out.println("isOnTv value is " + isOnTv);
			System.out.println("isOnRadio value is " + isOnRadio);
		} else {
			System.out.println("AND(&&) the others case..");
			System.out.println("isOnTv value is " + isOnTv);
			System.out.println("isOnRadio value is " + isOnRadio);
		}

		System.out.println("==============================");
		
		if(isOnTv & isOnRadio) {
			System.out.println("AND(&&) is true.. isOnTv isOnRadio ");
			System.out.println("isOnTv value is " + isOnTv);
			System.out.println("isOnRadio value is " + isOnRadio);
		} else {
			System.out.println("AND(&&) the others case..");
			System.out.println("isOnTv value is " + isOnTv);
			System.out.println("isOnRadio value is " + isOnRadio);
		}
	}

}
