package note;

public class Day1_3 {

	public static void main(String[] args) {
		Tv t = new Tv(); // ��ü ���� 
		t.channel = 7;
		t.channelDown();
		System.out.println("���� ä���� " + t.channel + " �Դϴ�.");
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