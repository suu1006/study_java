package study;

public class DAy14_12 {

	public static void main(String[] args) {
		score = new int [5];
		/*
		 *  배열의 실제 길이는 5가 아닌 4 / 배열의 요소는 0번째부터 시작
		 *  0번째-1번째-2번째-3번째-4번째 배열 요소 즉, 이렇게 5개 배열 요소가 저장.
		 */
		int [] score = new int [5]; // 배열의 선언 및 길이 설정
		
		score[0] = 10;
		score[1] = 20;
		score[4] = 50; // 인덱스를 활용해서 값을 주는 방법.
		
		int [] score = new int[10];
		//배열을 선언하고 길이를 지정해줌. score.length는 10이 됨.
		//배열의 요소는 0부터 출발. 0~9까지 10개의 배열 요소가 저장됨.
		
		for(int i=0; i<score.length; i++) {
			//i<=score.length가 아닌  i<score.length인 이유는 
			//score.length는 10이지만, 실제 길이는 9번째 인덱스까지임.
			//배열의 마지막 인덱스는 score[9]인데, score.length만큼 반복하면 
			//score[10]에도 접근해서 배열의 범위를 벗어나는 에러가 발생함.! 
		}
		
		score[i] = i*10;
		//score[0] = 0*10; score[1]= 1*10 이렇게 각 배열 요소의 값들이 저장됨.
		//System.out.println(score[i]); // 각 배열 요소들을 출력하여 값 확인/
		
		int [] score = new int [] {10,20,30,40};
		int [] score = {10,20,30,40}; // 간략히 사용할 수 있음.
		//score.length = 4 
		
		
		
		
		
		
	}
}
