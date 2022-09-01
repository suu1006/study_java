package study;

import java.util.Scanner;

public class Day9_1 {

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		System.out.print("숫자를 입력하세요.>> ");
		int month = a.nextInt();
		
		switch(month) {
		case 12 :
		case 1 :
		case 2 :
			System.out.println("현재 계절은 겨울입니다.");
		break;
		case 3:
		case 4:
		case 5:
			System.out.println("현재 계절은 여름입니다.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("현재 계절은 가을입니다.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("현재 계절은 겨울입니다.");
			break;
		}
	}
}