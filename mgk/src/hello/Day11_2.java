package hello;

import java.util.Scanner;

public class Day11_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 값 입력받기
		
		int[] num = new int[5];  //int 타입의 숫자 
		
		System.out.print("숫자 5개를 띄어쓰기로 구분하여 입력하세요: ");
		
		for (int i=0; i<5; i++) { //5개 배열에 넣기
			num[i] = sc.nextInt(); //입력받아 넣기
		}
		System.out.println("=====입력 완료=====");
		System.out.println("=====출력 시작=====");
		
		for (int i=4; i>=0; i--) { //5개 거꾸로출력되게끔 하기
			System.out.println(num[i]); //
		}
		sc.close();
	}
}

