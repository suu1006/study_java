package cp6;

public class cp6_6_Ex6_8 {

	public static void main(String[] args) {
		Data3 d = new Data3();
		//Data3 �� ��ü ����� (���� d)
		d.x = 10;
		// d.x�� 10 
		
		Data3 d2 = copy(d);
		// copy(d) �޼��� ȣ���ؼ� d2�� �ֱ�
		System.out.println("d.x = " + d.x);
		// d.x�� ����ϱ� 
		System.out.println("d2.x = " + d2.x);
		// d2.x�� ����ϱ�
	}
		static Data3 copy(Data3 d) {
	// ��ȯŸ�� : Data3 /  copy �޼��� �Ű����� Data3 d  
		Data3 tmp = new Data3();
		// Data3 ��ü�� tmp ������ ����
		tmp.x = d.x;
		// d.x �� �� tmp.x �� �����Ѵ� 
		return tmp;
		// tmp  ��ȯ�ϱ� (��ü�� �ּҸ� ��ȯ)
	}
}