package study;

public class Day19 {

	public static void main(String[] args) {
		/*
		 * this�� �����ڿ� �޼ҵ��� �̸��� �ʵ�� ����� ���, �ν���Ʈ ����� �ʵ����� ����ϰ��� ��Ÿ��.
		 * static�޼ҵ� >> ��ü�� �������� �ʰ� Ŭ������. �޼ҵ������ ȣ�� ����.
		 * �ν��Ͻ��޼ҵ� >> ��ü ���� �� ȣ�� ����.(�ν��Ͻ�(��ü)�� �����ؾ߸� ��밡��)
		 * �����ε� >> �Ű������� ���� or Ÿ���� �ٸ� ��� �޼ҵ� ������ �� ����.
		 * �Ű����� �̸��� �ٸ��� Ÿ���� ������ ���� X, ���� Ÿ�Ը� �ٸ��ٸ� ����X.
		 * Ŭ�����̸� () {}
		 *
		 */
		Car12 car = new Car12();
		car.opendoor();
		Car12.toggleDoor(true);
	}

}
class Car {
	boolean door;
	
	void openDoor() {
		door = true;
		System.out.println(door);
	}
	static void toggleDoor(boolean d) {
		d = !d;
		System.out.println(d);
	}
}