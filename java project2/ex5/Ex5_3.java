package ex5;

public class Ex5_3 {

	public static void main(String[] args) {
		
		int Mmax = 79;
		Mmax = 88;
		Mmax = 91;
		Mmax = 100;
		System.out.println(Mmax); // �� �ָ��ϰ� ������ȴµ� �׳� 

		
		int[] score = {79, 88, 91, 33, 100, 55,95};
		
		int max = score[0];
		int min = score[0];
		
		for(int i=1; i<score.length; i++) {
			if(score[i] > max) { 
				max = score[i];
				
			} else if(score[i] < min) {
				min = score[i];
			}
			System.out.println("�ִ밪 : " + max);
			System.out.println("�ּҰ� : " + min);
			
			
		}
	}
}
	
