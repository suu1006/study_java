package ex7;

public class Test {

	public static void main(String[] args) {
		// �츮�� ģ�� ����̰� �־��
		// ����̴� �����̿���
		// �ٵ� �ĺ��� ���ٰ� ���� �٫����
		// �׷��� ����̴� ��ָ� ������ �Ǿ����
		// ������ ���� ġ�Ḧ �߹ް� ��������
		// �� ��ģ����̰� ��
		Disabled ��ģ����� = new Disabled("�����", "���� ����");
		��ģ�����.���ܼ�();
		Person ����� = null;
		����� = ��ģ�����; // ġ�Ḧ �߹޾Ƽ� �� �����������
		�����.�ڱ�Ұ�();
		
		Disabled �Ǵ�ģ����� = null;
		�Ǵ�ģ����� = (Disabled) �����;
		�Ǵ�ģ�����.���ܼ�();
		
		
	}

}

class Person{
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public void �ڱ�Ұ�() {
		System.out.println("���� " + name + "�Դϴ�.");
	}
}

class Disabled extends Person{
	private String ��ֳ���;
	
	public Disabled(String name, String ��ֳ���) {
		super(name);
		this.��ֳ��� = ��ֳ���;
	}
	
	public void ���ܼ�() {
		System.out.println("���� " + ��ֳ��� + "�� ������ �ֽ��ϴ�.");
	}
}