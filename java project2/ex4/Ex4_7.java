package ex4;

public class Ex4_7 {

	public static void main(String[] args) {
		int num = 0;
		
		for (int i = 1; i<=5; i++) { //5�� �ݺ��Ѵ�!
			num = (int) (Math.random()*6) +1; //*6 = �������� ����!!!!
			System.out.println(num);
		}
	}
}