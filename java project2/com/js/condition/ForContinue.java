package com.js.condition;

public class ForContinue {

	public static void main(String[] args) {
		for (int i = 0; i< 11; i++) {
			if (i % 2 ==0) { // �������� ����. 2�γ����� ��������. ¦��
				continue; //�Ʒ��� �̵����� �ʰ� ���ǹ��� ź��.
			}
			System.out.println(i); //Ȧ���� ���
		}
	}
}