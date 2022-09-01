package ex4;

import java.util.Scanner;

public class Ex4_4 {

	public static void main(String[] args) {
		int score = 0;
	    char grade = ' ';
		
		System.out.print("점수를 입력하세요.>");
		Scanner scanner = new Scanner(System.in); //사용자의 입력을 받아야할 때 scanner 참조변수 사용.
		score = scanner.nextInt(); // nextInt (다음 토큰을 int 타입으로 리턴.)
		
		if (score>=90) {
			grade = 'A';
		} else if (score >=80) {
			grade = 'B';
		} else if (score>=70) {
			grade = 'C';
		} else {
			grade = 'D';
		}
			System.out.println("당신의 학점은 "+grade+" 입니다.");
		}
}