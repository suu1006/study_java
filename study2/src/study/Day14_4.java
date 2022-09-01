package study;

public class Day14_4 {

	public static void main(String[] args) {
		 int [] score = new int [10]; 
		 // 배열을 선언하고 길이를 지정해줍니다. 이때 배열의 길이, 즉 score.length = 10 이 됩니다.하지만 배열의 요소는 0부터 출발하기 때문에, 0, 1, 2, ... 9까지 총 10개의 배열 요소가 저장됩니다.
		 
		 for(int i =0; i<score.length; i++) { //i<= score.length(이하) 가 아닌 i<score.length(미만)로 =가 없는 이유는 score.length는 10 이지만, score배열의 실제 길이는 9번째 인덱스 까지입니다. 따라서 score 배열의 마지막 인덱스는 score[9] 인데, score.length(=10)만큼 반복하면 존재하지 않는 score[10]에도 접근해서 배열의 범위를 벗어나는 에러가 발생하게 됩니다.
			
			 score[i] = i*10; // score[0] = 0*10; score[1] = 1*10 .... 이렇게 각 배열 요소의 값들이 저장됩니다.
			 System.out.println(score[i]);// 각 배열요소들을 출력하며 값을 확인해줍니다.


	}

}
