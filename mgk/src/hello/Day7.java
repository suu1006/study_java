package hello;

import java.util.Scanner;

public class Day7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하세요. ");
		int a = sc.nextInt();
		
		System.out.print("두번째 숫자를 입력하세요. ");
		int b = sc.nextInt();
		
		System.out.println("===사칙연산 출력하기===");
		System.out.printf("%d + %d = %d\n", a, b, a+b);
		System.out.printf("%d - %d = %d\n", a, b, a-b);
		System.out.printf("%d * %d = %d\n", a, b, a*b);
		System.out.printf("%d / %d = %d\n", a, b, a/b);
		System.out.printf("%d %% %d = %d\n", a, b, a%b);//나머지 연산자 %% 두번사용
		
		sc.close();
	}
}
