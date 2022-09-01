package ex2_1;

import java.util.Scanner;

public class Scanner2_10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("두자리 정수를 하나 입력해주세요.>");
		String input1 = scanner.nextLine();
		int num1 = Integer.parseInt(input1);
		System.out.print("두자리 정수를 하나 더 입력해주세요.>");
		String input2 = scanner.nextLine();
		int num2 = Integer.parseInt(input2);
		
		System.out.println("입력내용 :" +input1);
		System.out.printf("num=%d%n", num2);
		
		System.out.println(num1 + num2 );
		// 끝!

		// input : String
		// num : int type 
		
		// 예제 
		// String -> int
		// int -> String
		// 으로 형변환 하는 예제 인 거 같아요. 왜 안됬는지는 이유를 모르겠는데요?..
		// 잉 되는데용? ㅋㅋㅋ
		//제가 했을때는 아까처럼 오류만 나구,, 아무것도 안나왔어요ㅠㅠ 잠시만요!
		//ㅜ 뭐가 문제였을까요 흐엉,,ㅠㅠㅠ 근데 이 예제자체가 저는 이해하는데 한참걸려서,, ㅈ사실 뭐가 바뀐지도 모르겠어요ㅠㅠ
		// 그러면 간단하게만 알려드릴까요?넹네유ㅠㅠ
	}

}
