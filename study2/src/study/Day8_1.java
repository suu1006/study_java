package study;

import java.util.Scanner;

public class Day8_1 {

	public static void main(String[] args) {
		
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("������ �Է����ּ���.>> "); //���� a �Է¹ޱ�
			int a = sc.nextInt();
			
			//������ 2���̻��϶��� �������ڸ� Ȱ���Ѵ�!!
			//�ùٸ� ���� �ƴ� �� ������ �� �տ� ���ִ°� ����!
			if (80<=a && a<100) { //�������� ����ϱ�!!! (80<=score) && (score<100) ���� ����! 
				System.out.println("�հ��Դϴ�."); //80�� �̻� ~ 100�� �̸�
				break;
				
			} else if (0<a && a<80) { 
				System.out.println("���հ��Դϴ�."); //0�� �̻� ~ 80�� �̸�
				break; 
				
			} else {
					System.out.println("������ �߸� �ԷµǾ����ϴ�."); //�̿��� ��
					continue;
				}
		}
	}
}