package note;

public class Day1_1 {

	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		
		Test myTest = new Test(); //��ü ����
		
		int c = myTest.sum(a, b); // ȣ���� : ��������.�޼ҵ� 
		
		System.out.println(c);
	}
}
class Test {
	public int sum (int a, int b) { //�Է°� = �޼ҵ� �μ�, �Է��μ�
		return a+b; // ���ϰ� = ��°�, ��� ��, �����ִ� ��
	}
}