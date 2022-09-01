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

	static int sum2(int... values) { // 배열 및 단일 값 둘다 받을 수 있음.
		// 무한개 작성가능 (무한하니까 메모리 낭비가 심해짐)
		// 유치원 원생 수 (매년 바뀌면 매번 바꿔야하니까 귀찮으니까,, 사용!)
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}

}