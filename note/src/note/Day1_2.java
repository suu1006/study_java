package note;

public class Day1_2 {

	public static void main(String[] args) {
		int a = 1;
		Test myTest = new Test(); //��ü ����
		myTest.vartest(a); //ȣ�� ��������.�޼ҵ�
		System.out.println(a); //���

	}

}
class Test {
	public void vartest (int a) {
		a++;
	}
}