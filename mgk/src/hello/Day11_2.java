package hello;

import java.util.Scanner;

public class Day11_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // �� �Է¹ޱ�
		
		int[] num = new int[5];  //int Ÿ���� ���� 
		
		System.out.print("���� 5���� ����� �����Ͽ� �Է��ϼ���: ");
		
		for (int i=0; i<5; i++) { //5�� �迭�� �ֱ�
			num[i] = sc.nextInt(); //�Է¹޾� �ֱ�
		}
		System.out.println("=====�Է� �Ϸ�=====");
		System.out.println("=====��� ����=====");
		
		for (int i=4; i>=0; i--) { //5�� �Ųٷ���µǰԲ� �ϱ�
			System.out.println(num[i]); //
		}
		sc.close();
	}
}

