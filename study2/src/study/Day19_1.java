package study;

import java.util.Scanner;

public class Day19_1 {

	public static void main(String[] args) {
		Triangle triangle = new Triangle();
		
		Scanner scanner = new Scanner();
		
		System.out.println("ù��° ������ �Է����ּ���.");
		int a = scanner.nextInt();
		
		System.out.println("�ι�° ������ �Է����ּ���.");
		int b = scanner.nextInt();
		
		System.out.println("����° ������ �Է����ּ���.");
		int c = scanner.nextInt();
		
		System.out.println(triangle.tri); //�޼��� ȣ��..?
	}
}
class Triangle {
	public void tri (int a, int b, int c) { 
		
		if((a*a) + (b*b) > (c*c)) {
			System.out.println("���� �ﰢ���Դϴ�.");
		}	
		else if( (a*a) + (b*b) < (c*c)) {
			System.out.println("�а� �ﰢ���Դϴ�.");
		}
		else if ((a*a) + (b*b) == (c*c)) {
			System.out.println("���� �ﰢ���Դϴ�.");
			}
			}
		}