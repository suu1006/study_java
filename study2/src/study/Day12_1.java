package study;

import java.util.Scanner;

public class Day12_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�����Ը� �Է����ּ���.");
		double weight = 0.0;
		weight = scanner.nextDouble();
		
		System.out.println("Ű�� �Է����ּ���.");
		double height = 0.0;
		height = scanner.nextDouble();
		
		double bmi = 0.0;
		bmi = weight/height*height;
		
		if(20<=bmi && bmi<25) {
			System.out.println("ǥ���Դϴ�.");
		} else {
			System.out.println("ü�߰����� �ʿ��մϴ�.");
		}
	}
}