package study;

import java.util.*;

public class Day13_3 {

	public static void main(String[] args) {
		int[] iArr1 = new int[10]; // 0~9까지
		int[] iArr2 = new int[10]; // 0~9까지
//	int [] iArr3 = new int[] {100,95, 80, 70, 60};
		int[] iArr3 = { 100, 95, 80, 70, 60 }; // 윗 줄과 같음.
		char[] chArr = { 'a', 'b', 'c', 'd' };

		for (int i = 0; i < iArr1.length; i++) {
		// iArr1.length = 10 그리고 iArr1의 마지막 배열의 인덱스는 9까지이기때문에 
		// iArr.length는 미만으로 작성해준다.
			iArr1[i] = i + 1;
		}
		for (int i = 0; i < iArr2.length; i++) {
			iArr2[i] = (int)(Math.random() * 10) + 1;
			// Math.random은 double형(0.0~1.0까지) 
			// (int) Math.random으로 형변환해서 자주 사용됨.
			// int형을 한 건 반올림하지 않음. ex >> (int)1.8 = 1
		}
		for (int i = 0; i < iArr1.length; i++) {
			System.out.println(iArr1[i] + ",");
		}
		System.out.println();
		System.out.println(Arrays.toString(iArr2));
		//toString 은 문자열로 변환
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		System.out.println(iArr3);
		System.out.println(chArr);
	}
}