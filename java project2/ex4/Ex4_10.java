package ex4;

public class Ex4_10 {

	public static void main(String[] args) {
		int sum = 0; //합계를 저장하기 위한 변수
		
		for (int i=1; i<=5; i++) {
			sum += 1; // sum = sum+1
			System.out.printf("1부터 %2d까지의 합 : %2d%n", i, sum);
		}
	}
}