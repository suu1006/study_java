package ex3;
public class Ex3_2 {
	public static void main(String[] args) {
		int i = 5, j=0;
		
		// ó�� ����
		// i = 5 ; j = 0;
		j=i++; // �׷��� i++ �̸� j���� �����ְ� i�� ������Ų����? <-- ���⼭ �� ���� ��
		// ����� 
		System.out.println(i); // �����
		System.out.println(j); // �����
		// �����
		// �����
		
		
		// �������� j���� �����ְ� i�� ������!
		i=5;
		j=0;
		
		// j���� �ֱ����� i�� ������Ű�� j���� ��! 
		j=++i; 
		System.out.println(i);
		System.out.println(j);
	}
}