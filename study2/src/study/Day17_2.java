package study;

public class Day17_2 { //�Է°��� ���µ� ��°��� �ִ� ��

	public static void main(String[] args) {
	int a = 1;
	Test3 myTest = new Test3(); //new Ŭ�����̸� �ۼ��ϱ�
	a = myTest.vartest(a); //a ������� , a �������� 
	System.out.println(a);
	}
}

//Ŭ���� �ּҸ� ���� �� �ִ� �������� �������ְ� >> ������� ���� �� �ִ� ���� ���� >> ȣ���� �޼��� ���� (��������.�޼����)
class Test3 {
	public int vartest(int a) {
		a++;
		return a;
	}
}