package cp5;

import java.util.Arrays;

public class cp5_4_shuffle {

	public static void main(String[] args) {
		//������ numArr ������ {0,1,2,3,4,5,6,7,8,9} �� �־��ش�.
		int [] numArr = {0,1,2,3,4,5,6,7,8,9};
		// numArr�� ��� ��� ���
		System.out.println(Arrays.toString(numArr));
		
		// for���� ���� 0���� 100���� 
		for (int i=0; i<100; i++) {
			// ������ n�� 0~9���� ���� �������� ���������� ��ȯ ��, �־��ش�.
			int n = (int)(Math.random()*10);
			// numArr[0]�� ���� ������ tmp ������ �־��ش�.
			int tmp = numArr[0];
			// numArr[n] ���� numArr[0]���� �־��ش�.
			numArr[0] = numArr[n];
			//tmp�� ���� numArr[n]�ڸ��� �־��ش�.
			numArr[n]= tmp;
		}
		// numArr�� ��� ��� ���
		System.out.println(Arrays.toString(numArr));
	}

}
