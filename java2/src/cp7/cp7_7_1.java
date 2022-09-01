package cp7;

public class cp7_7_1 {

	public static void main(String[] args) {
		Buyer b = new Buyer();

		b.buy(new Tv1());
		b.buy(new Computer());

		System.out.println("���� ���� ����" + b.money + "�����Դϴ�.");
		System.out.println("���� ���� ���ʽ�������" + b.bonusPoint + "���Դϴ�.");
	}
}

class Product {
	int price;
	int bonusPoint;

	Product(int price) { // Product ������ (������ ����)
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}
}

class Tv1 extends Product { // Product ��ӹ��� Tv1 Ŭ����
	Tv1() { // Tv1 ������
		super(100); // ����Ŭ���� ������ ȣ�� Tv���� 100�������� ����
	}

	public String toString() {
		return "Tv";
	} // ��ü�� ������ ���ڿ� ���·� ǥ���ϰ��� �� ��
}

class Computer extends Product {
	Computer() {
		super(200);
	}

	public String toString() {
		return "Computer";
	}
}

class Buyer {
	int money = 1000;
	int bonusPoint = 0;

	void buy(Product p) {
		if (money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "��/�� �����ϼ̽��ϴ�.");
	}
}