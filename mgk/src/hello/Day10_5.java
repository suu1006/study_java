package hello;

import java.util.Scanner;

public class Day10_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요.>>");
		int num = sc.nextInt();
		
		int i = 1;
		int sum = 0;
		
		while (i<=num) {
			sum = sum + i;
			i++;
		}
		System.out.printf("1부터 %d까지의 합은 %d입니다.",num,sum);
	}

}
