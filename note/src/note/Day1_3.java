package note;

public class Day1_3 {

	public static void main(String[] args) {
		Tv t = new Tv(); // 객체 생성 
		t.channel = 7;
		t.channelDown();
		System.out.println("현재 채널은 " + t.channel + " 입니다.");
	}
}
class Tv {
	String color;
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
	
}