package ex6;

public class Ex6_9 {

	long a, b; // �ʵ�
	
	long add() { // �޼���
		return a + b;
	}

	long substract() {
		return a - b;
	}

	long multiply() {
		return a * b;
	}

	long divide() {
		return a / b;
	}

	static long add(long a, long b) { // Ŭ���� �޼���
		return a + b;
	}

	static long substract(long a, long b) {
		return a - b;
	}

	static long multiply(long a, long b) {
		return a * b;
	}

	static double divide(long a, long b) {
		return a / b;
	}

	public static void main(String args[]) { // main�� �Ѱ���!
		System.out.println(Ex6_9.add(200L, 100L)); // �빮�ڷ� ����.�޼ҵ� �̸�() = Ŭ���� �޼���
		System.out.println(Ex6_9.substract(200L, 100L));
		System.out.println(Ex6_9.multiply(200L, 100L));
		System.out.println(Ex6_9.divide(200L, 100L));
				
		Ex6_9 mm = new Ex6_9(); // �ڹٴ� �����ڸ� �ȸ���� �⺻������ �� �����ڸ� ������ش�.
		mm.a = 200L; 
		mm.b = 100L;

		System.out.println(mm.add()); //�޼��带 ȣ���Ҷ�, �ҹ��ڷ� ����.�޼ҵ� �̸�() = �ν��Ͻ� �޼���
		System.out.println(mm.substract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());
	}
}


//class �����{ // ��� �ý���
//	�ʵ�; (�����)// �ν��Ͻ� ���� ��� �ҷ���
//	String ������; = ������
//	String ����; = ������
//	
//	
//	������; //Ŭ�����̸� = ������ �̸�
//	�����(String ������,String ����){ // �� �ʿ��Ѱ� �־��ִ� ����
//		this.������ = ������; ������
//		this.���� = ����; ������ 
//	}
//	
//	
//	�޼���; //Ŭ������ �� �� �ִ� ��
//	String �̸��θ���() {
//		return ����;
//	}
//	
//}
//
//����� lg����� = new �����("������", "������");
//lg�����.�̸��θ���();





























