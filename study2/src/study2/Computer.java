package study2;

public class Computer {
	public static void main(String[] args) {
		sum1(new int[] {1,2,3,4,5});
		sum2(new int[] {1,2,3,4,5});
	}

	static int sum1(int[] values) {
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}

	static int sum2(int... values) { // �迭 �� ���� �� �Ѵ� ���� �� ����.
		// ���Ѱ� �ۼ����� (�����ϴϱ� �޸� ���� ������)
		// ��ġ�� ���� �� (�ų� �ٲ�� �Ź� �ٲ���ϴϱ� �������ϱ�,, ���!)
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}

}