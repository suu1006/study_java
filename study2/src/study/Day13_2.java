package study;

import java.util.Scanner;

public class Day13_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�ϳ��� ������ �Է��ϼ���.");
		int num = scanner.nextInt();
		
		while(true) { //if���� else���� ���� �־���Ѵ�! (���� ���Ͼȿ� �־����.)
			
			if(num%2==0 && num%3==0) {
			System.out.printf("%d�� 2�� 3�� ����Դϴ�.", num);
			break;
			
			} else {
				System.out.printf("%d�� 2�� 3�� ����� �ƴմϴ�.", num);
				break;
			}
		}
	}
}