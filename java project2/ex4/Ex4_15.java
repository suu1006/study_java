package ex4;

import java.util.Scanner;
public class Ex4_15 {

	public static void main(String[] args) {
		// �׷� ����ٰ� �ۼ��غ����� 123
		// if �� �Ⱦ��� ��� �� �� �������? �ᵵ�ǰ� �Ƚᵵ �ǿ� �ۼ��ϴ°� �������....
		// ������ 2�� ��, 3�� ����?
		
		
		
		
		
		int input = 0, answer = 0; 
		// �̰� ����ϰ�
		
		answer = (int)(Math.random()*100) +1;
		Scanner scanner = new Scanner(System.in);
		
		do { //�ٵ� 
			System.out.print("1�� 100������ ������ �Է��ϼ���.>");
			input = scanner.nextInt();
			// �ȳ��ϼ��信 ������ a�� �Ȱ���? ��!! a�� input?! ����
			if(input > 1) {
				System.out.println("�ȳ�");
				// �� �¾ƿ�
				System.out.println("�� ���� ���� �õ��غ�����.");
			} else if (input < answer) {
				System.out.println("��");
				System.out.println("�� ū ���� �õ��غ�����.");
				
			}
		}while(input!=answer); //���� ��ġ���� ������ ��� �ݺ��Ѵ�..?��𼭺��� ������ �ݺ��ؿ�?
		
		System.out.println("�����Դϴ�.");
	}
			}
