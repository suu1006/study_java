package day2;

public class Day1_1 {

	public static void main(String[] args) {
		System.out.println("Hello, World"); //���ڸ� �ٹٲ��ϰ� Hello, World �� ���
		System.out.print("Hello"); // ���ڸ� �ٹٲ� ���� �ʰ�, Hello ���
		System.out.println("World");// ���ڸ� �ٹٲ� �ϰ�, Hello ���
		
		System.out.println("jeong su");
		System.out.print("jeong"); // ���ٿ� �״�� ����Ѵٰ� ��������~
		System.out.print("su");
		System.out.println("jjang");
		
		System.out.println("3+5="); //����ǥ �ȿ� ������ ���ڸ� ����ϰ�
		System.out.println(3+5); // ����� ���� �����ش�. / ��Ģ������ ���Ե� �� ����Ϸ��� > ��ȣ �ȿ� �ĸ� ������ ��
		
		System.out.println(5+3);
		System.out.println(5-3);
		System.out.println(5*3);
		System.out.println(5/3); // ���� ������ ������ ����!
		
		//������ �ϳ��� ���� ������ �� �ִ� ������� (���� �ϳ��� ��! �̹� ����� ���� ��������, ���ο� �� �����)
		//���� ���� ��� : ����Ÿ�� �����̸�
		// = �� ������ �ǹ̰� �ƴ϶�, �������� ���� ���ʿ� �����϶�� �ǹ�! >> ���Կ�����
		int x; // ���� x ����
		x = 5; //5�� x�� ����
		
		System.out.println(x);
		
		x=10;
		System.out.println(x); // �̹� ����� ���� ��������, ���ο� �� �����
		
	    // int/long     >> ���� ���� Ÿ�� (20�� ������ long)
		// float/double >> �Ǽ� ���� Ÿ��(�������� 7�ڸ�, double�� 15�ڸ�)
		// char         >> ���� ���� Ÿ��
		// String       >> ���ڿ�(=���� ����) ���� Ÿ��
		
		int f = 100;
		double pi = 3.14;
		char ch = 'a';
		String str = "abc";
		
		System.out.println(f);
		System.out.println(pi);
		System.out.println(ch);
		System.out.println(str);
		
		// ��� >> ���� ������ �� �ִ� ���� but, �ٸ� ������ ������ �� ����(������������ ����)
		// final �ٿ��ֱ� (��� ����� �Ŀ��� ��� �� �����ϴ� �� ������ ����)
		// ����̸� ��� �빮��, ���� �ܾ�� �̷���� �ִ� ��� > '_'
		// ���� : �ϳ��� ���� �����ϱ� ���� ���� / ��� : ���� �ѹ��� ������ �� �ִ� ���� / ���ͷ� : �� ��ü�� ���� �ǹ��ϴ� ��
		// �������� long Ÿ�� ���ͷ��� ���̻� 'l', 'L' ����. ���̻簡 ������ int Ÿ���� ���ͷ�
		// byte�� short Ÿ��(���ͷ� ���� ����X)�� ������ ���� ������ ���� int Ÿ���� ���ͷ� ���
		
		//16���� ǥ�� : 'Ox' 'OX' ���̱� 8���� : 0 ���̱�
		int octNum = 010; // 8���� 10, 10������ 8
		int hexNum = 0x10; // 16���� 10, 10������ 16
		
		// JDK 1.7���� ������ ���ͷ��� �߰��� ������-�� ���� �� ����
		long big = 100_000_000_000L;
		long hex = 0xFFF_FFF_FFF_FFFL;
		
		// �Ǽ��� float Ÿ�� :  ���̻� f / F  // double Ÿ�� : ���̻� d / D
		float pi0 = 3.14f;
		double rate = 1.618d; //d�� ��������
		
		// String�� Ŭ���� new �����ڸ� ��������� 
		String name = new String("JAVA");
		String name2 = "JAVA"; // ���� ������ ������! 
		
		
	}

}
