package ex2_1;

public class Ex2_8 {

	public static void main(String[] args) {
		int x = 10 , y= 5; 
		System.out.println("x="+x);
		System.out.println("y="+y);

		int tmp = x; //x�� ���� tmp�� ����
		x = y; //y�� ���� x�� ����
		y= tmp; // tmp�� ���� y�� ����
		System.out.println("x="+x);
		System.out.println("y="+y);
	}

}
