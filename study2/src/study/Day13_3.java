package study;

import java.util.*;

public class Day13_3 {

	public static void main(String[] args) {
		int[] iArr1 = new int[10]; // 0~9����
		int[] iArr2 = new int[10]; // 0~9����
//	int [] iArr3 = new int[] {100,95, 80, 70, 60};
		int[] iArr3 = { 100, 95, 80, 70, 60 }; // �� �ٰ� ����.
		char[] chArr = { 'a', 'b', 'c', 'd' };

		for (int i = 0; i < iArr1.length; i++) {
		// iArr1.length = 10 �׸��� iArr1�� ������ �迭�� �ε����� 9�����̱⶧���� 
		// iArr.length�� �̸����� �ۼ����ش�.
			iArr1[i] = i + 1;
		}
		for (int i = 0; i < iArr2.length; i++) {
			iArr2[i] = (int)(Math.random() * 10) + 1;
			// Math.random�� double��(0.0~1.0����) 
			// (int) Math.random���� ����ȯ�ؼ� ���� ����.
			// int���� �� �� �ݿø����� ����. ex >> (int)1.8 = 1
		}
		for (int i = 0; i < iArr1.length; i++) {
			System.out.println(iArr1[i] + ",");
		}
		System.out.println();
		System.out.println(Arrays.toString(iArr2));
		//toString �� ���ڿ��� ��ȯ
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		System.out.println(iArr3);
		System.out.println(chArr);
	}
}