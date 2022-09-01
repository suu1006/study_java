package ex4;

import java.util.Scanner;
public class Ex4_15 {

	public static void main(String[] args) {
		// 그럼 여기다가 작성해보세요 123
		// if 문 안쓰고 어떻게 할 수 있을까요? 써도되고 안써도 되요 작성하는게 어려워요....
		// 나머지 2일 때, 3일 때는?
		
		
		
		
		
		int input = 0, answer = 0; 
		// 이거 비슷하게
		
		answer = (int)(Math.random()*100) +1;
		Scanner scanner = new Scanner(System.in);
		
		do { //근데 
			System.out.print("1과 100사이의 정수를 입력하세요.>");
			input = scanner.nextInt();
			// 안녕하세요에 저장한 a랑 똑같죠? 넹!! a가 input?! ㅇㅇ
			if(input > 1) {
				System.out.println("안녕");
				// 네 맞아요
				System.out.println("더 작은 수로 시도해보세요.");
			} else if (input < answer) {
				System.out.println("하");
				System.out.println("더 큰 수로 시도해보세요.");
				
			}
		}while(input!=answer); //답이 일치하지 않으면 계속 반복한다..?어디서부터 어디까지 반복해요?
		
		System.out.println("정답입니다.");
	}
			}
