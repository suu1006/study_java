package hello;

import java.util.Scanner;

public class Day10_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���.>>");
		int num = sc.nextInt();
		
		int i = 1;
		int sum = 0;
		
		while (i<=num) {
			sum = sum + i;
			i++;
		}
		System.out.printf("1���� %d������ ���� %d�Դϴ�.",num,sum);
	}

}
