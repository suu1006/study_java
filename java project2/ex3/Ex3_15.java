package ex3;

import java.util.Scanner; //Scanner Ŭ������ ����ϱ� ���� �߰��Ͽ���~!

public class Ex3_15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char ch = ' ';
		
		System.out.printf("���ڸ� �ϳ� �Է��ϼ���.>");
		
		String input = scanner.nextLine(); // nextLine �޼ҵ� : Enterġ�� ������ �� ���ڿ� ��� ����!! 
		ch = input.charAt(0);
		
		//charAt() = String���� ����� ���ڿ� �߿��� �� ���ڸ� �����ؼ� charŸ������ ��ȯ���ִ� �༮!!!!
		//char(0)= ù��° ����, charAt(3)= �׹�° ���� >>> ���α׷��ֿ��� ���� 0���� ����!
		
		if ('0' <= ch && ch <= '9') {
			System.out.printf("�Է��Ͻ� ���ڴ� �����Դϴ�.%n");
		}
		
		if(('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
			System.out.printf("�Է��Ͻ� ���ڴ� �������Դϴ�.%n");
		}
	}
}