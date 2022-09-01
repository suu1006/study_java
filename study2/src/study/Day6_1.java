package study;

import java.util.Scanner;

public class Day6_1 {
//굴러가는거 주석으로 달기 꼼꼼하게!! 1바퀴돌때 i의값, a의 값 적기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 숫자를 입력하세요. >>");
		int a = sc.nextInt();

		int i = 1;
		int sum = 0;
		while (i <= a) {
			sum = sum + i;
			i++;	
		}
//		System.out.println("1부터" + a + "까지의 합계: " + sum);
		System.out.printf("1 부터 %d 까지의 합계 : %d", a, sum);
	}
}