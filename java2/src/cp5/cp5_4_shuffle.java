package cp5;

import java.util.Arrays;

public class cp5_4_shuffle {

	public static void main(String[] args) {
		//정수형 numArr 변수에 {0,1,2,3,4,5,6,7,8,9} 을 넣어준다.
		int [] numArr = {0,1,2,3,4,5,6,7,8,9};
		// numArr의 모든 요소 출력
		System.out.println(Arrays.toString(numArr));
		
		// for문을 통해 0부터 100까지 
		for (int i=0; i<100; i++) {
			// 정수형 n에 0~9까지 랜덤 개별값을 정수형으로 변환 후, 넣어준다.
			int n = (int)(Math.random()*10);
			// numArr[0]의 값을 정수형 tmp 변수에 넣어준다.
			int tmp = numArr[0];
			// numArr[n] 값을 numArr[0]값에 넣어준다.
			numArr[0] = numArr[n];
			//tmp의 값을 numArr[n]자리에 넣어준다.
			numArr[n]= tmp;
		}
		// numArr의 모든 요소 출력
		System.out.println(Arrays.toString(numArr));
	}

}
