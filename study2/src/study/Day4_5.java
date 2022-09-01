package study;

import java.util.Scanner;

public class Day4_5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); 
		System.out.print("돈이 얼마 있나요? ");

		 int money = scan.nextInt(); 

		if(money >= 2500) 

		{ System.out.println("아이스 바닐라 라떼!");} 

		else if(1500 < money && money < 2500) 
		{ System.out.print("아아 "); } 

		else 
		{ System.out.print("물이나 "); } 

		System.out.println("사먹자!"); } 
	}