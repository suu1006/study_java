package ex6;

public class Ss {

	public static void main(String[] args) {
		Data3 d = new Data3();
		d.x = 10;

		Data3 d2 = copy(d);//����� �ּҰ������� ��.
		System.out.println("d.x = " + d.x);
		System.out.println("d2.x = " + d2.x);
		System.out.println(d);
		System.out.println(d2);
	}
	static Data3 copy(Data3 d) {
		Data3 tmp = new Data3();
		tmp.x = d.x;
		return tmp; //��ü�� �ּҸ� ��ȯ�Ѵ�. �ּҰ� ������ ȣ��� ������ ���°�!
	}
}