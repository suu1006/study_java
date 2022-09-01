package study;

import java.util.Scanner;

public class Day4_1 {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.print("입력하실 숫자는?");
	int n = sc.nextInt();
	


	for(int i=2; i<=9; i++) {
		int sum = n *i;
		System.out.println(sum);
		
	}
	

	}
}