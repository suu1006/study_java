package study;

public class Study2 {

	public static void main(String[] args) {
		Tv t;
		t = new Tv();
		t.channel =7;
		t.channelDown();
		System.out.println("���� ä����" + t.channel + "�Դϴ�.");
		

	}
}
	
class Tv{
	String color;
	boolean power;
	int channel;
	
	void power() {power =!power;} //������, �ٸ��� �˻�
	void channelUp() {++channel;}
	void channelDown() {--channel;}

		}