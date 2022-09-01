package cp7;

public class cp7_7_Product {

	public static void main(String[] args) {
		Buyer b = new Buyer();

		b.buy(new Tv1()); // Tv t = new Tv1(); + b.buy(t) ����
		b.buy(new Computer()); // buy(Product p) ȣ���� ��

		System.out.println("���� ���� ����" + b.money + "�����Դϴ�.");
		System.out.println("���� ���ʽ������� " + b.bonusPoint + "���Դϴ�.");
	}

}
class Product {
	int price;
	int bonusPoint;

	Product(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}
}

class Tv1 extends Product {
	Tv1() {
		super(100); // tv�� ������ 100���� // ����Ŭ������ ������ Product(int price)�� ȣ��
	}

	public String toString() {
		return "Tv";
	}
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
		money -= p.price; // ���� ������ ������ ��ǰ�� ������ ��
		bonusPoint += p.bonusPoint; // ��ǰ�� ���ʽ� ������ �߰��Ѵ�.
		System.out.println(p + "��/�� �����ϼ̽��ϴ�.");
//		System.out.println(p.toString() + "��/�� �����ϼ̽��ϴ�."); �� ����� ���� ������.
	}
}