package study2;

class buyer {

	int money = 1000; //소유금액
	int bonusPoint = 0; //보너스점수
	Product11 [] cart =  new Product11[10]; //구입한 제품을 저장하기 위한 배열
	int i = 0; // Product 배열에 사용될 카운터
	
	void buy (Product11 p) {
		if (money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		money -= p.price; //가진 돈 - 구입 가격
		bonusPoint += p.bonusPoint; // 제품의 보너스 점수 추가
		cart[i++] = p; // 제품을 Product[ ] cart 에 저장
		System.out.println(p + "을/ 를 구입하셨습니다.");
	}
	
	void summary() { //구매한 물품 정보 요약해서 보여줌.
		int sum = 0; // 구입한 물품의 가격합계
		String itemList = ""; //구입한 물품목록
		
		//반복문을 이용해서 구입한 물품의 총 가격과 목록을 만듬. 
		for (int i = 0; i< cart.length; i++) {
			if(cart[i] == null) break;
			sum += cart[i].price;
			itemList += cart[i] + ",";
		}
		System.out.println("구입하신 물품의 총 금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
		}
	}

public class Product11 { //public 제어자가 붙으면, 파일명과 동일한 클래스 이름을 가져야함.
	public static void main(String args[]) { 
		//main : main 자체가 하나의 프로그램의 시작과 끝 /모든 실행프로그램의 기본이 되는 함수
		//기본 함수이기 때문에 어디에서나 접근이 가능해야함. 
		//static :  static 을 선언하여 메모리에 항상 상주하도록 해야함.(Garbage collector에 의해 정리되지 않게!) 
		//main 함수만은 public을 지정해야함. 
		//args 문자열을 배열로 사용하겠다
		// args는 변수명이기때문에 꼭 args가 아니어도 상관없으나, String []args 구문 자체를 뺄 수는 없음.
		
		buyer b = new buyer();
		
		b.buy(new Tv2());
		b.buy(new Computer2());
		b.buy(new Audio2());
		b.summary();
	}
}


