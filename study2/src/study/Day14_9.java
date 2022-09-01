package study;

public class Day14_9 {

	public static void main(String[] args) {
		Tv[] tvArr = new Tv[3];
		/*
		 * tvArr이라는 참조변수로 Tv객체의 배열을 선언 및 길이까지 지정해줍니다. 
		 * 우리가 어제 배웠던 배열 선언 방법과 같습니다. 배열 선언 방법은 다시 한번 복습해주세요!
		 * tvArr.length = 3입니다. 
		 */
		for(int i=0; i<tvArr.length; i++) {
			tvArr[i] = new Tv();
			//for문이 배열의 길이-1까지 반복되면서 0부터 2까지 Tv객체를 생성해서 0번째...2번째 배열에 저장해줍니다.
			
			tvArr[i].channel = i+10;
			//각 배열 요소 tvArr[i].channel에 i+10을 저장합니다.
		}
		for(int i = 0; i< tvArr.length; i++) {
			tvArr[i].channelUp(); // tvArr[i] 요소 당 channelUp()메소드를 호출시킵니다.(사용합니다) 그럼 각 배열 요소의 channel값은 1씩 더 증가합니다. 
			System.out.printf("tvArr[%d].channel = %d%n",i, tvArr[i].channel);//for문이 반복되는 동안 각 배열 요소들의 채널 값을 출력합니다. 
		}
	}
}
class Tv{
	String color;
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() { --channel;}
}