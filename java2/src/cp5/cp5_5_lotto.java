package cp5;

public class cp5_5_lotto {

	public static void main(String[] args) {
		// 배열 길이 : 45 배열 범위 : 0~44
		int [] ball = new int [45];
		
		// for문으로 0부터 길이까지 
		for (int i=0; i<ball.length; i++) 
			// 뽑힌 i요소를 i+1해서 넣기 // 예시 > ball[0] = 1
			ball[i] = i+1;
			
		    // 정수형 tmp 변수, 정수형 j 변수를 0으로 초기화
			int tmp = 0;
			int j = 0;
			
			//for문으로 0부터 5번째 요소까지 총 6개를 바꾼다. 
			//j에는 45개의 랜덤 숫자를 정수형으로 바꿔 넣는다.
		for (int i=0; i<6; i++) { 
			j= (int)(Math.random() * 45); // 랜덤 0~44까지의 임의의 값을 얻는다. 
			// ball[i] 요소 값을 tmp값에 넣고, ball[j]값을 ball[i]에 넣고, tmp값을 ball[j]에 넣는다.
			tmp = ball[i];
			ball[i] = ball[j];
			ball[j]= tmp;
		}
		// ball의 6개 요소를 출력한다.
		for (int i = 0; i<6; i++) {
			System.out.printf("ball[%d] = %d%n", i, ball[i]);
		}
	}
}