package com.js.condition;

public class SwitchTest {

	public static void main(String[] args) {
		double randNum = Math.random(); // ������ �Լ��� ����Ͽ� 1-10���� ����.
		System.out.println("randNum value is" + randNum);

		int divediceNumber = (int) (randNum * 10 + 1);
//random�� 0.0~ 0.99999 ���.. 10�� ���ϰ� +1�� ���ָ�.. ���ϴ� ���� �� �� 0�� ������ �ȵǹǷ�.. +1�� ���ش�.
		switch (divediceNumber) {
		case 1:
			System.out.println("divediceNumber is 1");
			break;
		case 2:
			System.out.println("divediceNumber is 2");
			break;
		case 3:
			System.out.println("divediceNumber is 3");
			break;
		case 4:
			System.out.println("divediceNumber is 4");
			break;
		case 5:
			System.out.println("divediceNumber is 5");
			break;
		default: 
			System.out.println("divediceNumber is 6~10");
			break;
		}
	}
}