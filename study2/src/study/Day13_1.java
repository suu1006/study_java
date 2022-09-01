package study;

import java.util.Scanner;

public class Day13_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int addMoney = 10; // 이자

		System.out.println("원금을 입력해주세요.");
		int money = scanner.nextInt(); // 원금

		System.out.println("예치 일수를 입력해주세요.");
		int day = scanner.nextInt(); // 예치 일수

		for (int i = 0; i <= day; i++) {
			money += addMoney;
		}
		System.out.printf("day일 이후의 잔액은 %d원입니다.", money);
	}
}