package hello;

import java.util.Scanner;

public class Day10 {

	public static void main(String[] args) {
		int num = 0;
		int answer = 5;
		Scanner sc = new Scanner(System.in);
		
		do {  //do-while���� 1ȸ ���� �� ���ǹ� �˻�
			System.out.print("2+3�� ����?");
			num = sc.nextInt();
			
			if(num == answer) {
				System.out.println("�����Դϴ�!");
			} else {
					System.out.println("��! �ٽ� �Է����ּ���");
				}
			
	     	} while (num != answer);	
	}
}
		