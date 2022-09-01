package study;

import java.util.Scanner;

public class Day13_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("하나의 정수를 입력하세요.");
		int num = scanner.nextInt();
		
		while(true) { //if문과 else문은 같이 있어야한다! (같은 블록안에 있어야함.)
			
			if(num%2==0 && num%3==0) {
			System.out.printf("%d은 2와 3의 배수입니다.", num);
			break;
			
			} else {
				System.out.printf("%d은 2와 3의 배수가 아닙니다.", num);
				break;
			}
		}
	}
}