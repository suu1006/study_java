package study;

import java.util.Scanner;

public class Day9_1 {

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���.>> ");
		int month = a.nextInt();
		
		switch(month) {
		case 12 :
		case 1 :
		case 2 :
			System.out.println("���� ������ �ܿ��Դϴ�.");
		break;
		case 3:
		case 4:
		case 5:
			System.out.println("���� ������ �����Դϴ�.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("���� ������ �����Դϴ�.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("���� ������ �ܿ��Դϴ�.");
			break;
		}
	}
}