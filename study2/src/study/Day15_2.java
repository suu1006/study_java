package study;

import java.util.Scanner;

public class Day15_2 {

	public static void main(String[] args) {
		
		int [] arr = new int[10]; //배열 선언, 길이 지정 실제길이 : 9
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("값을 차례대로 입력하세요.");
		arr[i] = scanner.nextInt(); // ??
		
		for(int i=0; i<arr.length; i++) {
			if(i%3==0) {
				System.out.println(arr[i]);
			}
		}
	}
}