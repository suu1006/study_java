package study;

import java.util.Scanner;

public class Day15_2 {

	public static void main(String[] args) {
		
		int [] arr = new int[10]; //�迭 ����, ���� ���� �������� : 9
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� ���ʴ�� �Է��ϼ���.");
		arr[i] = scanner.nextInt(); // ??
		
		for(int i=0; i<arr.length; i++) {
			if(i%3==0) {
				System.out.println(arr[i]);
			}
		}
	}
}