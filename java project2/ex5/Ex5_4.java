package ex5;

import java.util.Arrays;

public class Ex5_4 {

	public static void main(String[] args) {
		int[] numArr = {0,1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(numArr));
		
		for (int i=0; i<2; i++) { 
			// i = 1 �� ��, n �� �������� 9�� �����ٰ� �����ϰ� ����غ�����.
			
			int n = (int)(Math.random()*10); // n�� 8�̶��,     n�� 9��� 
			// �ְ� 9�� ������ �ؿ��� n�� ����־��?
			int tmp = numArr[0];             // tmp = 0,       // tmp = 7..?
			numArr[0] = numArr[9];           // numArr[0] = 7; // numArr[0] =8 ����
 			numArr[9] = tmp;                 // numArr[7] = 0; // numArr[9] = 
			// 								 // n�� 8 �϶�, 0������������ �ϱ� 7
		}									// �����ϰ� �� �и��ؼ� �����Ͻø� �ǿ�.
		// 1. �ݺ����� �ݺ�Ƚ���� �����ϰ� (100�̶�� �ʹ� �����ϱ� 2���� �غ���)
		// 2. 1�� ° �� �� ���� �������,
		// 3. 2�� ° �� ��, ���� �������. ����? 
		//�װԷ����� ��!? ������ ��������, ���� ���ظ� �ϱ� ���ؼ��� �����ؼ� �־�� �ſ���
		//�Ʊ� �������ֽ� 0�� �������ڷ� �ٲ��,
		System.out.println(Arrays.toString(numArr));
	}
}

