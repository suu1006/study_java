package study;

public class Day14_7 {

	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		//�������� t1�� t2�� ��� TvŬ������ �� �ּҸ� �����մϴ�. ������ t1�� t2�� ����� ���ּ��� ���� ���� ��, �� ���� ���� ����� �޸� �ּҴ� �ٸ��ϴ�.
		
		System.out.println("t1�� channel ����"+ t1.channel+"�Դϴ�.");
		System.out.println("t2�� channel ����"+ t2.channel+"�Դϴ�.");
	    // t1�� t2 �� ä�ΰ��� ȣ���ؼ� ������ݴϴ�. �̶� class Tv�� �Ӽ�(����)���� ���� ����� ������ �⺻������ ����Ǿ� �ִ� �����Դϴ�. ���� t1.channel = 0; t2.channel = 0�� ��µ˴ϴ�.
		
	    t1.channel = 7;
	    System.out.println("t1�� channel���� 7�� �����Ͽ����ϴ�.");
	    System.out.println("t1�� channel ����"+ t1.channel+"�Դϴ�.");
		System.out.println("t2�� channel ����"+ t2.channel+"�Դϴ�.");
		// �� �ΰ��� ��¹��� �����Ű�� t1.channel = 7; t2.channel = 0�� ������ �˴ϴ�. �� ���� �ٸ� ������ t1�� t2�� ���� TvŬ������ ���������� t1�� t2�� ���� �ٸ� �޸� �ּҿ� ����Ǿ� �ֱ� ������ ���ο��� ������ ���� �ʽ��ϴ�.
	}
}
	class Tv {
		String color;
		boolean power;
		int channel;
		
		void power() {power = !power;}
		void channelUp() { ++channel;}
		void channelDown() { --channel;}
	}
