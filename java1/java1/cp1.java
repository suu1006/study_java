package java1;

public class cp1 {

	public static void main(String[] args) {
		Child child = new Child();
		
		child.jenny();

	}

}
class Mother {
	public String blog = "jeongsu";
	public int Period = 3;
	
	public void jenny() {
		System.out.println(blog + "�� ��α״� " + Period + "���� �Ǿ����ϴ�.");
	}
}
class Child extends Mother {
	String blog = "jenny";
	int Period = 10;
	
	public void jenny() {
		super.jenny(); //�θ�Ŭ������ �޼��� ȣ��
		System.out.println(blog + "�� ��α״� " + Period + "���� �Ǿ����ϴ�.");
		System.out.println(super.blog + "�� ��α��Դϴ�." + super.Period + "���� �Ǿ����ϴ�.");
	}
}