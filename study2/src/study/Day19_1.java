package study;

import java.util.Scanner;

public class Day19_1 {

	public static void main(String[] args) {
		Triangle triangle = new Triangle();
		
		Scanner scanner = new Scanner();
		
		System.out.println("첫번째 선분을 입력해주세요.");
		int a = scanner.nextInt();
		
		System.out.println("두번째 선분을 입력해주세요.");
		int b = scanner.nextInt();
		
		System.out.println("세번째 선분을 입력해주세요.");
		int c = scanner.nextInt();
		
		System.out.println(triangle.tri); //메서드 호출..?
	}
}
class Triangle {
	public void tri (int a, int b, int c) { 
		
		if((a*a) + (b*b) > (c*c)) {
			System.out.println("예각 삼각형입니다.");
		}	
		else if( (a*a) + (b*b) < (c*c)) {
			System.out.println("둔각 삼각형입니다.");
		}
		else if ((a*a) + (b*b) == (c*c)) {
			System.out.println("직각 삼각형입니다.");
			}
			}
		}