package study;

public class DAy17_1 {

	public static void main(String[] args) {
		Apple example = new Apple();
		//Ŭ���� Example ���ּҸ� �����ϴ� ��ü example ����. 
		//��ü example�� Ŭ���� Example�� ���ּҸ� ã�ư��� �޼��带 ȣ��, Ȱ���� �� ����.
		
		example.method1(); //���� �Է¹��� �ʴ� void�޼ҵ�. 
		System.out.println();
		
		example.method2(5); //method2�� �Ű����� int x �� 5�� ���� �־���.
		int x = 5;
		System.out.println(); //void�޼ҵ��̱⶧���� �����Ų ���� ��ȯ������ ����.
		
		example.method3(); //method3�� 10�� ��ȯ���ִ� �޼ҵ�
		System.out.println(); //10�� ��ȯ�ϱ� ������ ���ϰų� Ȱ�밡��
		
		example.method4(3,5); //�Ű����� a,b�� ���� 3, 5�� ���� �־���. int a = 3; int b=5;
		System.out.println();
		
		example.method5(1,2);
		System.out.println(); //void�޼ҵ� ��ȯ���ִ� ���� ���⶧���� �������� ������ ��, ��ȯ�� ����.
	}
}
class EXample13 {
	void method1() {
		//method1()���� ��ȣ �ȿ� ���� ���� �Ű�������� ��. �Ű������� �̿��ؼ� �޼ҵ��� ��� ��밡��.
		//method1(int a, int b){return a+b;}�̷������� �Ű����� Ȱ������.
		System.out.println("method1�� ����˴ϴ�.");
	} 	//return���� ���� ��� void�� �ۼ�.
	void method2(int x) { //int x �� �Ű�����. 
		System.out.println(x+"�� �̿��ϴ� method2�Դϴ�.");
		}
		// ���� int x�� �޾Ƶ��� ��, �������� �ʴ� �޼ҵ�.
		// �޾Ƶ��̴� ��(�Ű�����)�� � Ÿ���̶� �������, �޾Ƶ��̴� �Ű������� ���� �� �ϼ��� ����.
		//�������ϰ�� �޸�(,)�� ����.
	int method3() { //��ȣ ���� ����ֽ��ϴ�. �Ű������� �޾Ƶ����� �ʰ�, return���� �̿��� �������� ��ȯ�ϴ� �޼ҵ�.
	System.out.println("method3�� ����˴ϴ�.");
	return 10;
	}
	//�޼ҵ� �̸��տ� ���� Ÿ�� �����ֱ�
	//���� Ÿ���� �ϳ��� ��밡��.
	int method4 (int a, int b) {
		System.out.println("a�� b�� ���� �����ִ� �޼ҵ�(�Լ�)�Դϴ�.");
		return a+b; //a�� b�� ���� �����ְ� �� ���� ��ȯ���ݴϴ�.
		}
	void method5 (int a, int b) {
		System.out.println(a+","+b+"�� �����ִ� �޼ҵ��Դϴ�.");
	}
	}