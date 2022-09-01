package study;

public class Study2 {

	public static void main(String[] args) {
		Tv t;
		t = new Tv();
		t.channel =7;
		t.channelDown();
		System.out.println("현재 채널은" + t.channel + "입니다.");
		

	}
}
	
class Tv{
	String color;
	boolean power;
	int channel;
	
	void power() {power =!power;} //같은지, 다른지 검사
	void channelUp() {++channel;}
	void channelDown() {--channel;}

		}