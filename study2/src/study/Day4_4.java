package study;

import java.util.Scanner;

public class Day4_4 {

	public static void main(String[] args) {

		// ����� �Է¹޾Ƽ� 20�� ���ϸ� ������ ì���.
		 Scanner scan = new Scanner(System.in);

		 System.out.print("����� �Է����ּ���: "); 

		int temp = scan.nextInt(); 

		if(temp <= 20)

		{ System.out.println("������ ì��� "); } 

		else if(temp > 20)

		{ System.out.print("���� �԰� "); }

		 System.out.println("������!"); } 
	}