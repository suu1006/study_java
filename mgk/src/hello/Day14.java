package hello;

import java.util.Scanner;

public class Day14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] value = { 1, 2, 3, 4, 5};

		while (true) {
			try {
				System.out.print("숫자를 입력하세요: ");
				int a = sc.nextInt();
				System.out.println(value[a]);
				System.out.println("프로그램 종료");
				break;
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("0~9 사이의 값을 입력하세요");
			}
		}
		
		sc.close();
	}

}
