package study;

public class Day6_3_Calc { //�ֵ� �ٽ� Ŭ����
	
	public static void main(String[] args) {
		Calc calc = new Calc(); //�򰥸��� �ʱ� ���� �̸��� ���� ��� / �������� ���
		//�빮�ڴ� Ŭ���� , �ҹ��ڴ� ��������
		//�޼��� ȣ�� >> ��������.�޼����̸�(�Ű�����)
		calc.plus(1,1); //�޼��� ȣ��
		calc.minus(1,1);
		calc.mul(1,1);
		calc.div(1,1);
		int a = calc.plus(1, 1); //ȣ���� ���� a�� ����
		int b = calc.plus(1, 1);
		int c = calc.plus(1, 1);
		int d = calc.plus(1, 1);
		System.out.println("plus�޼ҵ��� �����"+a+"�Դϴ�"); //������ �� ���
		System.out.println("minus�޼ҵ��� �����"+b+"�Դϴ�");
		System.out.println("mul�޼ҵ��� �����"+c+"�Դϴ�");
		System.out.println("div�޼ҵ��� �����"+d+"�Դϴ�");
	}
}
class Calc { //Ŭ������ ���赵 (���赵 �ȿ� ���赵 �ȵ�!)
	int plus(int a, int b) { //Ÿ�� �޼����̸�(�Ű�����(Ÿ�� �̸�)){������ ����}
		return a+b;
	}
	int minus(int a, int b) {
		return a-b;
	}
	int mul(int a, int b) {
		return a*b;
	}
	int div(int a, int b){
		return a/b;
	}
}