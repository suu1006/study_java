package study;

import java.util.Scanner;

public class Day6_1 {
//�������°� �ּ����� �ޱ� �Ĳ��ϰ�!! 1�������� i�ǰ�, a�� �� ����
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ϴ� ���ڸ� �Է��ϼ���. >>");
		int a = sc.nextInt();

		int i = 1;
		int sum = 0;
		while (i <= a) {
			sum = sum + i;
			i++;	
		}
//		System.out.println("1����" + a + "������ �հ�: " + sum);
		System.out.printf("1 ���� %d ������ �հ� : %d", a, sum);
	}
}