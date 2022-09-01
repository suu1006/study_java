package cp5;

public class cp5_3_max_min {

	public static void main(String[] args) {
		// 정수형 score 변수 안에 {79,88,91,33, 100,55,95}을 넣어준다.
		int [] score = {79,88,91,33, 100,55,95}; // 배열 길이 : 7 / 배열 범위 : 0~6까지
		
		// score[0]값을 정수형 max변수, 정수형 min 변수에 초기화 시켜준다.
		int max = score[0];
		int min = score[0];
		
		//for문으로 1부터 정수형 i를 길이만큼 반복하되, 만약 비교되는 i의 값들이 max값(79)보다 크다면 score[i]를 max 변수에 대입한다.
		// 비교되는 score[i]의 값이 보다 작다면 min 변수에 넣는다.
		for (int i=1; i<score.length; i++) {
			if (score[i]> max) {
				max = score[i];
			} else if (score[i] < min) {
				min = score[i];
			}
		}
		
		// 최대값, 최소값을 출력한다.
		System.out.println("최대값 : " + max);
		System.out.println("최소값 :" + min);
	}

}
