package hello;

public class Day11_1 {

	public static void main(String[] args) {
		int length = 100;
		int [] value = new int[length];
		
		for (int i=0; i<length; i++) {
			value[i] = i*10;
		}
		for (int i=0; i<length; i++) {
			System.out.printf("%d��° �ε����� ����� ���� %d�Դϴ�.\n",i,value[i]);
		}

	}

}
