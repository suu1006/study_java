package step2;

import java.util.Scanner;

public class IfElse2 {
//if�� ���� 2���Դϴ�.
	
	public static void main(String[] args) {
		int score;
		char grade;
		
		System.out.println("������ �Է��ϼ���: ");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		
		if (90 <= score && score <= 100) {
			grade = 'A';
		
		} else if (80 <= score && score <= 89) {
			grade = 'B';
		
		} else if (70 <= score && score <= 79) {
			grade = 'C';
		
		} else {
			grade = 'F';
	}
		System.out.println("grade is " + grade);
	}
}