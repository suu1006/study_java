package ex2_1;

import java.util.Scanner;

public class Scanner2_10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("���ڸ� ������ �ϳ� �Է����ּ���.>");
		String input1 = scanner.nextLine();
		int num1 = Integer.parseInt(input1);
		System.out.print("���ڸ� ������ �ϳ� �� �Է����ּ���.>");
		String input2 = scanner.nextLine();
		int num2 = Integer.parseInt(input2);
		
		System.out.println("�Է³��� :" +input1);
		System.out.printf("num=%d%n", num2);
		
		System.out.println(num1 + num2 );
		// ��!

		// input : String
		// num : int type 
		
		// ���� 
		// String -> int
		// int -> String
		// ���� ����ȯ �ϴ� ���� �� �� ���ƿ�. �� �ȉ������ ������ �𸣰ڴµ���?..
		// �� �Ǵµ���? ������
		//���� �������� �Ʊ�ó�� ������ ����,, �ƹ��͵� �ȳ��Ծ��Ф� ��ø���!
		//�� ���� ����������� ���,,�ФФ� �ٵ� �� ������ü�� ���� �����ϴµ� �����ɷ���,, ����� ���� �ٲ����� �𸣰ھ��Ф�
		// �׷��� �����ϰԸ� �˷��帱���?�߳����Ф�
	}

}
