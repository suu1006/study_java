package study;

import java.util.Scanner;

public class Day8_1 {

	public static void main(String[] args) {
		
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("점수를 입력해주세요.>> "); //점수 a 입력받기
			int a = sc.nextInt();
			
			//조건이 2개이상일때는 논리연산자를 활용한다!!
			//올바른 값이 아닐 때 범위를 맨 앞에 써주는게 좋음!
			if (80<=a && a<100) { //논리연산자 사용하기!!! (80<=score) && (score<100) 보기 편함! 
				System.out.println("합격입니다."); //80점 이상 ~ 100점 미만
				break;
				
			} else if (0<a && a<80) { 
				System.out.println("불합격입니다."); //0점 이상 ~ 80점 미만
				break; 
				
			} else {
					System.out.println("점수가 잘못 입력되었습니다."); //이외의 값
					continue;
				}
		}
	}
}