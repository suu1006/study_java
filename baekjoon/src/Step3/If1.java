package Step3;

import java.util.Scanner;

public class If1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학년을 입력하세요.");
		int a = sc.nextInt(); //학년
		
		System.out.println("점수를 입력하세요.");
		int b = sc.nextInt();  //점수
		
		if (b < 0 || b > 100 ) {
			System.out.println("범위를 벗어났습니다.");
		} else if (a == 4 && b >= 70) {
			System.out.println("합격입니다.");
		} else if (a == 4 && b < 70) {
			System.out.println("불합격입니다.");
		} else if (b >= 60) {
			System.out.println("합격입니다.");
			}
		}
	}