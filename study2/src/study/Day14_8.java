package study;

public class Day14_8 {

	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		System.out.println("t1�� channel ����"+t1.channel + "�Դϴ�.");
		System.out.println("t2�� channel ����"+t2.channel + "�Դϴ�.");
		
		t2 = t1;
		/*
		 * �� �� �ڵ忡���� �������� t1�� t2�� ���� TvŬ������ ����������, 
		 * ���� t1�� t2�� ����� ������ �ٸ��ٰ� ����߽��ϴ�. ���⼱ t1�� ����Ǿ��ִ� �ּ� ���� t2�� �������ݴϴ�.
		 * �׷��� �Ǹ�  t1�� t2�� ����Ǿ��ִ� �Ӽ�(����)�� ���°� ���� ���°� �˴ϴ�.
		 * ( t1�� ���ּҸ� t2�� �־��ֱ� ������ t1�� t2���� ���� ���ּ�, �� ���� ���°� ����˴ϴ�.)
		 */
	    t1.channel = 7;
	    
		System.out.println("t1�� channel ����"+t1.channel + "�Դϴ�.");
		System.out.println("t2�� channel ����"+t2.channel + "�Դϴ�.");
		/*
		 * t1.channel �� t2.channel �� ���� �Ȱ��� 7�� �����°��� Ȯ�� �� �� �ֽ��ϴ�. 
		 * �ֳ��ϸ� t2 = t1���� ���� t1�� ���ּҰ� t2�� ���ԵǾ� ���� ���ּ�(����)�� ��Ÿ���� �����Դϴ�.
		 */
	}
}
class Tv {
	String color;
	boolean power;
	int channel;
	
	void power() { power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
	
}