package hello;

import java.util.Scanner;

public class Day6_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=====�ڱ� �Ұ� �Է��ϱ�=====");
		
		System.out.print("�̸��� �Է��ϼ���: ");
		String name = sc.next();

		System.out.print("���̸� �Է��ϼ���: ");
		int age = sc.nextInt();

		System.out.print("�������� �Է��ϼ���: ");
		char bloodtype = sc.next().charAt(0);

		System.out.print("MBTI�� �Է��ϼ���: ");
		String mbti = sc.next();

		System.out.print("�¿�� �� ������ �Է��ϼ���: ");
		sc.nextLine();
		String sentence = sc.nextLine();

		System.out.print("�ڱ�Ұ� �Է¿Ϸ�!");
		

		System.out.println("���̿� �׶��� �ڱ�Ұ� ����!=> �����Ϸ��� ���͸� ��������.");
		System.out.printf("���� %s �Դϴ�. " + "���̴� %d ���̿���. �������� %s ���̱���, ���� MBTI�� %s�Դϴ�.", name, age, bloodtype, mbti);
		System.out.printf("\n���� �¿���� '%s' �Դϴ�!", sentence);
		sc.close();
	}
}
