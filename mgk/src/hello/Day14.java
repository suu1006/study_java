package hello;

import java.util.Scanner;

public class Day14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] value = { 1, 2, 3, 4, 5};

		while (true) {
			try {
				System.out.print("���ڸ� �Է��ϼ���: ");
				int a = sc.nextInt();
				System.out.println(value[a]);
				System.out.println("���α׷� ����");
				break;
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("0~9 ������ ���� �Է��ϼ���");
			}
		}
		
		sc.close();
	}

}
