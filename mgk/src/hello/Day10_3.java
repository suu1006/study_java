package hello;

import java.util.Scanner;

public class Day10_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ���.>>");
		
		int n = sc.nextInt();
		int sum1 = 0;
		
		for (int i=1; i<=n; i++) {
			sum1 = sum1+i;
		}
		System.out.println("for��>> 1���� "+ n +"���� ���� " +sum1+" �Դϴ�.");
		}
	}