package ex7;

class Product {
	int price; //��ǰ ����
	int bonusPoint; //���ʽ�����Ʈ
	
	Product(int price){ //����
		this.price = price; //�ʵ� (this)price = �Ű����� price 
		bonusPoint =(int)(price/10.0); //���ʽ������� ��ǰ������ 10%
	}
}

class Tv1 extends Product { //tv1 = �ڼ� / product = ����
	Tv1() {
		super (100); //����Ŭ������ ������ Product(int price)�� ȣ��
	}                //Tv1�� ������ 100�������� �Ѵ�.
	
	public String toString() { return  "Tv";}
}

class Computer extends Product {
	Computer() {super (200);}
	
	public String toString () {return "Computer";}
}

class Buyer { //��, ������ ��� ���
	int money= 1000; //�����ݾ�
	int bonusPoint =0; //���ʽ�����
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;
		}
	money -= p.price;
	bonusPoint += p.bonusPoint;
//	System.out.println(p.toString() + "��/�� �����ϼ̽��ϴ�.");
	System.out.println(p + "��/�� �����ϼ̽��ϴ�.");
	}
}

class Ex7_8 {
	public static void main(String args[]) {
		Buyer b = new Buyer();
		
		//Product p = new Tv1();
		//b.buy(p); 
		//������ ��ģ ���� >>> b.buy(new Tv1(); 
;		
		b.buy(new Tv1()); //buy(Product p)
		b.buy(new Computer()); //buy(Product p)
		
		System.out.println("���� ���� ����" + b.money + "�����Դϴ�.");
		System.out.println("���� ���ʽ�������" + b.bonusPoint + "���Դϴ�.");
	}
	
}






