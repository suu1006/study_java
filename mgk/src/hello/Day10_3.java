package hello;

import java.util.Scanner;

public class Day10_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요.>>");
		
		int n = sc.nextInt();
		int sum1 = 0;
		
		for (int i=1; i<=n; i++) {
			sum1 = sum1+i;
		}
		System.out.println("for문>> 1부터 "+ n +"까지 합은 " +sum1+" 입니다.");
		}
	}