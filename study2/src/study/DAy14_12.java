package study;

public class DAy14_12 {

	public static void main(String[] args) {
		score = new int [5];
		/*
		 *  �迭�� ���� ���̴� 5�� �ƴ� 4 / �迭�� ��Ҵ� 0��°���� ����
		 *  0��°-1��°-2��°-3��°-4��° �迭 ��� ��, �̷��� 5�� �迭 ��Ұ� ����.
		 */
		int [] score = new int [5]; // �迭�� ���� �� ���� ����
		
		score[0] = 10;
		score[1] = 20;
		score[4] = 50; // �ε����� Ȱ���ؼ� ���� �ִ� ���.
		
		int [] score = new int[10];
		//�迭�� �����ϰ� ���̸� ��������. score.length�� 10�� ��.
		//�迭�� ��Ҵ� 0���� ���. 0~9���� 10���� �迭 ��Ұ� �����.
		
		for(int i=0; i<score.length; i++) {
			//i<=score.length�� �ƴ�  i<score.length�� ������ 
			//score.length�� 10������, ���� ���̴� 9��° �ε���������.
			//�迭�� ������ �ε����� score[9]�ε�, score.length��ŭ �ݺ��ϸ� 
			//score[10]���� �����ؼ� �迭�� ������ ����� ������ �߻���.! 
		}
		
		score[i] = i*10;
		//score[0] = 0*10; score[1]= 1*10 �̷��� �� �迭 ����� ������ �����.
		//System.out.println(score[i]); // �� �迭 ��ҵ��� ����Ͽ� �� Ȯ��/
		
		int [] score = new int [] {10,20,30,40};
		int [] score = {10,20,30,40}; // ������ ����� �� ����.
		//score.length = 4 
		
		
		
		
		
		
	}
}
