package study;

public class Day14_2 {

	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		
		int result = (x>y) ? x: y; // x�� y���� ũ�ٸ�, result = x; �� �ǰ�, ���ǽ��� �����̶�� result = y;�� �̷�����ϴ�.
		System.out.println(result); // 3�� 5���� ������ result = y �� ����Ǿ� result ������ 5�� ����˴ϴ�.
		
		char a = 'a';
		char b = 'b';
		
		char result1 = (a==b) ? a : b; //a�� b�� ���� ���ڶ�� result���� ���� a�� ����\�ǰ�, �ƴ϶�� b�� ���� �˴ϴ�.
		System.out.println(result1); // a�� b�� �ٸ� �����̱� ������ ���ǽ��� �����̰�, char result1���� b�� ����˴ϴ�.
	}
}