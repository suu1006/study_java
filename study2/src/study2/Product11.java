package study2;

class buyer {

	int money = 1000; //�����ݾ�
	int bonusPoint = 0; //���ʽ�����
	Product11 [] cart =  new Product11[10]; //������ ��ǰ�� �����ϱ� ���� �迭
	int i = 0; // Product �迭�� ���� ī����
	
	void buy (Product11 p) {
		if (money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;
		}
		money -= p.price; //���� �� - ���� ����
		bonusPoint += p.bonusPoint; // ��ǰ�� ���ʽ� ���� �߰�
		cart[i++] = p; // ��ǰ�� Product[ ] cart �� ����
		System.out.println(p + "��/ �� �����ϼ̽��ϴ�.");
	}
	
	void summary() { //������ ��ǰ ���� ����ؼ� ������.
		int sum = 0; // ������ ��ǰ�� �����հ�
		String itemList = ""; //������ ��ǰ���
		
		//�ݺ����� �̿��ؼ� ������ ��ǰ�� �� ���ݰ� ����� ����. 
		for (int i = 0; i< cart.length; i++) {
			if(cart[i] == null) break;
			sum += cart[i].price;
			itemList += cart[i] + ",";
		}
		System.out.println("�����Ͻ� ��ǰ�� �� �ݾ��� " + sum + "�����Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� " + itemList + "�Դϴ�.");
		}
	}

public class Product11 { //public �����ڰ� ������, ���ϸ�� ������ Ŭ���� �̸��� ��������.
	public static void main(String args[]) { 
		//main : main ��ü�� �ϳ��� ���α׷��� ���۰� �� /��� �������α׷��� �⺻�� �Ǵ� �Լ�
		//�⺻ �Լ��̱� ������ ��𿡼��� ������ �����ؾ���. 
		//static :  static �� �����Ͽ� �޸𸮿� �׻� �����ϵ��� �ؾ���.(Garbage collector�� ���� �������� �ʰ�!) 
		//main �Լ����� public�� �����ؾ���. 
		//args ���ڿ��� �迭�� ����ϰڴ�
		// args�� �������̱⶧���� �� args�� �ƴϾ ���������, String []args ���� ��ü�� �� ���� ����.
		
		buyer b = new buyer();
		
		b.buy(new Tv2());
		b.buy(new Computer2());
		b.buy(new Audio2());
		b.summary();
	}
}


