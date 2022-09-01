package study;

import java.util.Scanner;

public class Day4_4 {

	public static void main(String[] args) {

		// 기온을 입력받아서 20도 이하면 외투를 챙긴다.
		 Scanner scan = new Scanner(System.in);

		 System.out.print("기온을 입력해주세요: "); 

		int temp = scan.nextInt(); 

		if(temp <= 20)

		{ System.out.println("외투를 챙기고 "); } 

		else if(temp > 20)

		{ System.out.print("반팔 입고 "); }

		 System.out.println("나가자!"); } 
	}