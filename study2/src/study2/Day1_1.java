package study2;

public class Day1_1 {

	public static void main(String[] args) {
		Calculator calculator = new Calculator(3,5); //��ü����
		System.out.println(calculator.x);
		System.out.println(calculator.y);
//		int result = calculator.sum(3, 5); //ȣ��
//		System.out.println(result); //���
	}
}
class Calculator {
	int x;
	int y;
	
	Calculator(int x, int y){ // Ŭ�����̸�() {} : ������
		this.x = x;
		this.y = y;
	}
}
