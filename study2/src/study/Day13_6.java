package study;

public class Day13_6 {

	public static void main(String[] args) {
		int [][] score = {
				{100, 100, 100}
				, {20, 20, 20}
				, {30, 30, 30}
				, {40, 40, 40}
		}; //3�� 2�� 
		int sum = 0;
		
		for(int i=0; i<score.length; i++) { //i ��
			for (int j=0; j<score.length; j++) { //j ��
				System.out.printf("score[%d][%d] = %d%n", i ,j, score[i][j] );
			}
		}
		for (int [] tmp : score ) {
			for (int i : tmp) {
				sum += 1;
			}
		}
		System.out.println("sum =" + sum);
	}

}
