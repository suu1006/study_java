package study;

import java.util.Scanner;

public class Day4_5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); 
		System.out.print("���� �� �ֳ���? ");

		 int money = scan.nextInt(); 

		if(money >= 2500) 

		{ System.out.println("���̽� �ٴҶ� ��!");} 

		else if(1500 < money && money < 2500) 
		{ System.out.print("�ƾ� "); } 

		else 
		{ System.out.print("���̳� "); } 

		System.out.println("�����!"); } 
	}