package ex7;

class Product {
	int price; //제품 가격
	int bonusPoint; //보너스포인트
	
	Product(int price){ //조상
		this.price = price; //필드 (this)price = 매개변수 price 
		bonusPoint =(int)(price/10.0); //보너스점수는 제품가격의 10%
	}
}

class Tv1 extends Product { //tv1 = 자손 / product = 조상
	Tv1() {
		super (100); //조상클래스의 생성자 Product(int price)를 호출
	}                //Tv1의 가격을 100만원으로 한다.
	
	public String toString() { return  "Tv";}
}

class Computer extends Product {
	Computer() {super (200);}
	
	public String toString () {return "Computer";}
}

class Buyer { //고객, 물건을 사는 사람
	int money= 1000; //소유금액
	int bonusPoint =0; //보너스점수
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
	money -= p.price;
	bonusPoint += p.bonusPoint;
//	System.out.println(p.toString() + "을/를 구입하셨습니다.");
	System.out.println(p + "을/를 구입하셨습니다.");
	}
}

class Ex7_8 {
	public static void main(String args[]) {
		Buyer b = new Buyer();
		
		//Product p = new Tv1();
		//b.buy(p); 
		//두줄을 합친 문장 >>> b.buy(new Tv1(); 
;		
		b.buy(new Tv1()); //buy(Product p)
		b.buy(new Computer()); //buy(Product p)
		
		System.out.println("현재 남은 돈은" + b.money + "만원입니다.");
		System.out.println("현재 보너스점수는" + b.bonusPoint + "점입니다.");
	}
	
}






