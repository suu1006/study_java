package step2;

import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {
		int t = 3;
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 1; i <= t; i++) {
			
			System.out.print("a�� �Է����ּ���");
			int a = scanner.nextInt();
			
			System.out.print("b�� �Է����ּ���");
			int b = scanner.nextInt();
	
			int sum = a+b;			
			
			System.out.println(sum);
		}
	}
}