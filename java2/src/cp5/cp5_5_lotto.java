package cp5;

public class cp5_5_lotto {

	public static void main(String[] args) {
		// �迭 ���� : 45 �迭 ���� : 0~44
		int [] ball = new int [45];
		
		// for������ 0���� ���̱��� 
		for (int i=0; i<ball.length; i++) 
			// ���� i��Ҹ� i+1�ؼ� �ֱ� // ���� > ball[0] = 1
			ball[i] = i+1;
			
		    // ������ tmp ����, ������ j ������ 0���� �ʱ�ȭ
			int tmp = 0;
			int j = 0;
			
			//for������ 0���� 5��° ��ұ��� �� 6���� �ٲ۴�. 
			//j���� 45���� ���� ���ڸ� ���������� �ٲ� �ִ´�.
		for (int i=0; i<6; i++) { 
			j= (int)(Math.random() * 45); // ���� 0~44������ ������ ���� ��´�. 
			// ball[i] ��� ���� tmp���� �ְ�, ball[j]���� ball[i]�� �ְ�, tmp���� ball[j]�� �ִ´�.
			tmp = ball[i];
			ball[i] = ball[j];
			ball[j]= tmp;
		}
		// ball�� 6�� ��Ҹ� ����Ѵ�.
		for (int i = 0; i<6; i++) {
			System.out.printf("ball[%d] = %d%n", i, ball[i]);
		}
	}
}