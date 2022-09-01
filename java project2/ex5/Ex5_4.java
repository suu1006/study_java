package ex5;

import java.util.Arrays;

public class Ex5_4 {

	public static void main(String[] args) {
		int[] numArr = {0,1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(numArr));
		
		for (int i=0; i<2; i++) { 
			// i = 1 일 때, n 의 랜덤값이 9가 뽑혔다고 가정하고 계산해보세요.
			
			int n = (int)(Math.random()*10); // n이 8이라면,     n이 9라면 
			// 애가 9가 뽑히면 밑에서 n은 어디있어요?
			int tmp = numArr[0];             // tmp = 0,       // tmp = 7..?
			numArr[0] = numArr[9];           // numArr[0] = 7; // numArr[0] =8 정답
 			numArr[9] = tmp;                 // numArr[7] = 0; // numArr[9] = 
			// 								 // n이 8 일때, 0번지에서부터 니까 7
		}									// 간단하게 다 분리해서 생각하시면 되요.
		// 1. 반복문의 반복횟수를 가정하고 (100이라면 너무 많으니까 2번만 해보자)
		// 2. 1번 째 돌 때 값을 적어놓고,
		// 3. 2번 째 돌 때, 값을 적어놓고. ㅇㅋ? 
		//그게랜덤의 값!? 랜덤의 값이지만, 저희가 이해를 하기 위해서는 가정해서 넣어보는 거에요
		//아까 말씀해주신 0이 랜덤숫자로 바뀌고,
		System.out.println(Arrays.toString(numArr));
	}
}

