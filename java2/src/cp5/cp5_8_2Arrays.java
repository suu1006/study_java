package cp5;

public class cp5_8_2Arrays {

	public static void main(String[] args) {
		int [][] score = { // 4�� 3�� 2���� �迭 
				{100,100,100}, 
				{20,20,20}, 
				{30,30,30},
				{40,40,40},
		};
		int sum = 0;
		for (int i=0; i<score.length; i++) { // score.length = 4
			for(int j=0; j<score[i].length; j++) { // score[i].length = 3
				System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);
				
				sum += score[i][j]; 
				
			}
		}
		System.out.println("sum=" + sum);
	}
}