package cp5;

import java.util.Scanner;

public class cp5_11_2Arrays_2 {

	public static void main(String[] args) {
		String [][] words = {
				{"chair", "의자"},
				{"computer", "컴퓨터"},
				{"integer", "정수"}
		};
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i=0; i<words.length; i++) {
			System.out.printf("Q%d.%s의 뜻은?", i+1, words[i][0]); //%s는 문자열 출력할 때 쓰는 지시자
			
			String tmp = scanner.nextLine();
			
			if(tmp.equals(words[i][1])) {
				System.out.printf("정답입니다.");
			} else {
				System.out.printf("틀렸습니다. 정답은 %s입니다. %n%n", words[i][1]);
			}
		}
	}
}
