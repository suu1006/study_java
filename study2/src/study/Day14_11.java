package study;

public class Day14_11 {

	public static void main(String[] args) {
		System.out.println("Card.width="+Card.width);
		System.out.println("Card.height="+Card.height);
		Card c1 = new Card();//CardŬ������ �����ϴ� �������� c1�� �ҷ����ݴϴ�. 
		c1.kind = "HEART"; // CardŬ������ kind �ν��Ͻ������� c1�� ȣ��, "HEART" �� �ʱ�ȭ ���ݴϴ�. 
		c1.number = 7;  // CardŬ������ number �ν��Ͻ������� c1�� ȣ��, 7 �� �ʱ�ȭ ���ݴϴ�. 
		
		Card c2 = new Card();
		c2.kind = "SPADE";
		c2.number = 4;
		
		System.out.println("c1��"+c1.kind+","+c1.number+"�̸�, ũ��� (" + c1.width+","+c1.height+")");
		System.out.println("c2��"+c2.kind+","+c2.number+"�̸�, ũ��� (" + c2.width+","+c2.height+")");
		/*
		 * ��¹��� Ȯ���ϸ� width, height�� ��� ���� ���� ������ �ִ� ���� �� �� �ֽ��ϴ�. 
		 * �� ������ width, height �� CardŬ������ Ŭ���� ������ ���Ǳ� �����Դϴ�. ��� �ν��Ͻ��� ����� ��������� ���� �ֱ� ������ ����� ���� ��µ˴ϴ�.
		 */
		
		System.out.println("c1�� width, height �� ���� 50, 80���� �����մϴ�.");
		
		c1.width = 50;
		c1.height = 80;
		/*
		 * Ŭ���� ������ ���� ���� 50, 80���� �ʱ�ȭ ���־����ϴ�. �ٽ� ���ؼ� width, height ������ ����� ��������� ���ο� ���� �־��� ���Դϴ�. 
		 */
		
		System.out.println("c1��"+c1.kind+","+c1.number+"�̸�, ũ��� (" + c1.width+","+c1.height+")");
		System.out.println("c2��"+c2.kind+","+c2.number+"�̸�, ũ��� (" + c2.width+","+c2.height+")");
		/*
		 * Ŭ���� ���� width, height�� ���� ������ �� ��¹��� ��� ���� ���� ������ ����� ����� ���� �˼� �ֽ��ϴ�. 
		 * �̷��� Card.width, c1.width, c2.width�� ��� ���� ��������� �����ϹǷ� �׻� ���� ���� ���� �˴ϴ�.
		 * 
		 */
	}
}
class Card{
	
	String kind;
	int number;
	/*
	 * kind, number�� �ν��Ͻ� �����Դϴ�. �ν��Ͻ�(��ü)�� �����ɶ� ���� �����˴ϴ�. 
	 */
	static int width = 100;
	static int height = 250;
	/*
	 * Ŭ���� ���� width, height�Դϴ�. �� ���� ��� �ν��Ͻ�(��ü)���� ����� �������(������)�� ���� �˴ϴ�. 
	 * ȣ���� Ŭ�����̸�.Ŭ�������� �� �ҷ����ݴϴ�. 
	 */
}