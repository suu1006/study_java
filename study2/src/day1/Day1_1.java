package day1;
class Day1_1 {
	//�ν��Ͻ� ���� Ŭ����
	class InstanceInner{ //�ν��Ͻ� ���� Ŭ����
	int iv=100;
//	static int cv=100; // ����! static ������ ������ �� ����. 
	final static int CONST=100; //final static => ����̹Ƿ� ���
}
	// static ���� Ŭ���� //��ü ���� ���� ��� �����ؾ���. 
	// static ���� Ŭ���������� �ܺ� Ŭ���� �ν��Ͻ� ����� ������ �� ����. 
	static class StaticInner { 
	int iv = 200;
	static int cv = 200; //static Ŭ������ static ����� ������ �� �ִ�. 
}
	// ���� ���� Ŭ����
	void myMethod() {
		class LocalInner { //  �������� Ŭ����
			int iv = 300;
//			static int cv = 300; //����! static������ ������ �� ����.
			final static int CONST = 300; //final static �̹Ƿ� ���
		}
	}
// class �� ���������� : default / public 
// ����Ŭ������ ���������� : default / public / protected / private
public static void main(String args[]) { 
	System.out.println(InstanceInner.CONST); //100
	System.out.println(StaticInner.cv); //200
	System.out.println(LocalInner.CONST); //����.>> ���� Ŭ�����ȿ����� ����
	//���� ���� : �������� Ŭ������ static ����� �޼��� �������� ��밡��
}
}