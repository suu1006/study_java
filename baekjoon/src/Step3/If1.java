package Step3;

import java.util.Scanner;

public class If1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�г��� �Է��ϼ���.");
		int a = sc.nextInt(); //�г�
		
		System.out.println("������ �Է��ϼ���.");
		int b = sc.nextInt();  //����
		
		if (b < 0 || b > 100 ) {
			System.out.println("������ ������ϴ�.");
		} else if (a == 4 && b >= 70) {
			System.out.println("�հ��Դϴ�.");
		} else if (a == 4 && b < 70) {
			System.out.println("���հ��Դϴ�.");
		} else if (b >= 60) {
			System.out.println("�հ��Դϴ�.");
			}
		}
	}