package cp5;

public class cp5_3_max_min {

	public static void main(String[] args) {
		// ������ score ���� �ȿ� {79,88,91,33, 100,55,95}�� �־��ش�.
		int [] score = {79,88,91,33, 100,55,95}; // �迭 ���� : 7 / �迭 ���� : 0~6����
		
		// score[0]���� ������ max����, ������ min ������ �ʱ�ȭ �����ش�.
		int max = score[0];
		int min = score[0];
		
		//for������ 1���� ������ i�� ���̸�ŭ �ݺ��ϵ�, ���� �񱳵Ǵ� i�� ������ max��(79)���� ũ�ٸ� score[i]�� max ������ �����Ѵ�.
		// �񱳵Ǵ� score[i]�� ���� ���� �۴ٸ� min ������ �ִ´�.
		for (int i=1; i<score.length; i++) {
			if (score[i]> max) {
				max = score[i];
			} else if (score[i] < min) {
				min = score[i];
			}
		}
		
		// �ִ밪, �ּҰ��� ����Ѵ�.
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� :" + min);
	}

}
