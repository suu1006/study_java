package study;

public class Day14_4 {

	public static void main(String[] args) {
		 int [] score = new int [10]; 
		 // �迭�� �����ϰ� ���̸� �������ݴϴ�. �̶� �迭�� ����, �� score.length = 10 �� �˴ϴ�.������ �迭�� ��Ҵ� 0���� ����ϱ� ������, 0, 1, 2, ... 9���� �� 10���� �迭 ��Ұ� ����˴ϴ�.
		 
		 for(int i =0; i<score.length; i++) { //i<= score.length(����) �� �ƴ� i<score.length(�̸�)�� =�� ���� ������ score.length�� 10 ������, score�迭�� ���� ���̴� 9��° �ε��� �����Դϴ�. ���� score �迭�� ������ �ε����� score[9] �ε�, score.length(=10)��ŭ �ݺ��ϸ� �������� �ʴ� score[10]���� �����ؼ� �迭�� ������ ����� ������ �߻��ϰ� �˴ϴ�.
			
			 score[i] = i*10; // score[0] = 0*10; score[1] = 1*10 .... �̷��� �� �迭 ����� ������ ����˴ϴ�.
			 System.out.println(score[i]);// �� �迭��ҵ��� ����ϸ� ���� Ȯ�����ݴϴ�.


	}

}
