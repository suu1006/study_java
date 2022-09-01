package hello;

import java.util.Scanner;

public class Day6_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=====자기 소개 입력하기=====");
		
		System.out.print("이름을 입력하세요: ");
		String name = sc.next();

		System.out.print("나이를 입력하세요: ");
		int age = sc.nextInt();

		System.out.print("혈액형을 입력하세요: ");
		char bloodtype = sc.next().charAt(0);

		System.out.print("MBTI를 입력하세요: ");
		String mbti = sc.next();

		System.out.print("좌우명 한 문장을 입력하세요: ");
		sc.nextLine();
		String sentence = sc.nextLine();

		System.out.print("자기소개 입력완료!");
		

		System.out.println("아이엠 그라운드 자기소개 시작!=> 시작하려면 엔터를 누르세요.");
		System.out.printf("저는 %s 입니다. " + "나이는 %d 살이에요. 혈액형은 %s 형이구요, 저의 MBTI는 %s입니다.", name, age, bloodtype, mbti);
		System.out.printf("\n저의 좌우명은 '%s' 입니다!", sentence);
		sc.close();
	}
}
