package study;

import java.util.Scanner;

public class Day13_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int addMoney = 10; // ����

		System.out.println("������ �Է����ּ���.");
		int money = scanner.nextInt(); // ����

		System.out.println("��ġ �ϼ��� �Է����ּ���.");
		int day = scanner.nextInt(); // ��ġ �ϼ�

		for (int i = 0; i <= day; i++) {
			money += addMoney;
		}
		System.out.printf("day�� ������ �ܾ��� %d���Դϴ�.", money);
	}
}