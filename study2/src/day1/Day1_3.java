package day1;

class Outer {
	private int outerIv = 0;
	static int outerCv = 0;
	
	class InstanceInner {
		int iiv = outerIv; //�ٽ� >> �ܺ� Ŭ������ private ����� ���ٰ����ϴ�.
		int iiv2 = outerCv;
	}
	static class StaticInner {
		//int siv = outerIv; // static Ŭ������ �ܺ� Ŭ������ �ν��Ͻ� ����� ������ �� ���� 
		static int scv = outerCv;
	}
	void myMethod() {
		int lv = 0;        // >>���� ����(x) �޼��� ����� �Բ� �Ҹ�
		final int LV = 0;  // >>���(o)
		
		class LocalInner {  // ���� Ŭ������ ��ü�� ������������ �� ���� ���簡��
			//�ܺ� Ŭ������ ���������� final�� ���� ����(=���)�� ���� ����
			int iiv = outerIv;
			int iiv2 = outerCv;
//			int iiv3 = lv; ���� (JDK1.8���� ���� �ƴ�)
			int iiv4 = Lv;
		}
	}
}