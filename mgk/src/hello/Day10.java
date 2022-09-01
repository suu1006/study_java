package hello;

import java.util.Scanner;

public class Day10 {

	public static void main(String[] args) {
		int num = 0;
		int answer = 5;
		Scanner sc = new Scanner(System.in);
		
		do {  //do-while문은 1회 실행 후 조건문 검사
			System.out.print("2+3의 답은?");
			num = sc.nextInt();
			
			if(num == answer) {
				System.out.println("정답입니다!");
			} else {
					System.out.println("떙! 다시 입력해주세요");
				}
			
	     	} while (num != answer);	
	}
}
		