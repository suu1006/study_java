package cp7;

public class cp7_7_1 {

	public static void main(String[] args) {
		Buyer b = new Buyer();

		b.buy(new Tv1());
		b.buy(new Computer());

		System.out.println("현재 남은 돈은" + b.money + "만원입니다.");
		System.out.println("현재 남은 보너스점수는" + b.bonusPoint + "점입니다.");
	}
}

class Product {
	int price;
	int bonusPoint;

	Product(int price) { // Product 생성자 (정수형 가격)
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}
}

class Tv1 extends Product { // Product 상속받은 Tv1 클래스
	Tv1() { // Tv1 생성자
		super(100); // 조상클래스 생성자 호출 Tv가격 100만원으로 설정
	}

	public String toString() {
		return "Tv";
	} // 객체의 정보를 문자열 형태로 표현하고자 할 떄
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
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "을/를 구입하셨습니다.");
	}
}