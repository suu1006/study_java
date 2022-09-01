package study;

import java.util.Scanner;

public class Day12_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("몸무게를 입력해주세요.");
		double weight = 0.0;
		weight = scanner.nextDouble();
		
		System.out.println("키를 입력해주세요.");
		double height = 0.0;
		height = scanner.nextDouble();
		
		double bmi = 0.0;
		bmi = weight/height*height;
		
		if(20<=bmi && bmi<25) {
			System.out.println("표준입니다.");
		} else {
			System.out.println("체중관리가 필요합니다.");
		}
	}
}