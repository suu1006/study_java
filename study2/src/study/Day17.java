package study;

public class Day17 {

	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		
		Test myTest = new Test();
		int c = myTest.sum(a,b);
		
		System.out.println(c);

	}
 
}

class Test { //�޼��� ���� : public �����ڷ��� �޼ҵ��(�Է��ڷ���1 �Էº���1) {
	// return ���ϰ�; (void�� ��� return�� �ʿ����.)
	public int sum (int a, int b) {
		return a + b;
	}
}