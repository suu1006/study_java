package rerere;

public class Ex6_01 {

public static void main(String[] args) {
		Tv t; //��ü ������ ���� �������� t ����
		t = new Tv(); // tv�ν��Ͻ� ���� / �ּҸ� t�� ����
		t.channel = 7; //������� channel�� ���� 7�� �Ѵ�
		t.channelDown(); // �޼��� channeldown�� ȣ���Ѵ�.
		System.out.println("���� ä����" + t.channel + "�Դϴ�.");
	}
}

class Tv {
	String color;
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp(){++channel;}
	void channelDown() {--channel;}
}