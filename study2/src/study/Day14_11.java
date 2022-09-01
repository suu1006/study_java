package study;

public class Day14_11 {

	public static void main(String[] args) {
		System.out.println("Card.width="+Card.width);
		System.out.println("Card.height="+Card.height);
		Card c1 = new Card();//Card클래스를 참조하는 참조변수 c1을 불러와줍니다. 
		c1.kind = "HEART"; // Card클래스의 kind 인스턴스변수를 c1이 호출, "HEART" 로 초기화 해줍니다. 
		c1.number = 7;  // Card클래스의 number 인스턴스변수를 c1이 호출, 7 로 초기화 해줍니다. 
		
		Card c2 = new Card();
		c2.kind = "SPADE";
		c2.number = 4;
		
		System.out.println("c1은"+c1.kind+","+c1.number+"이며, 크기는 (" + c1.width+","+c1.height+")");
		System.out.println("c2은"+c2.kind+","+c2.number+"이며, 크기는 (" + c2.width+","+c2.height+")");
		/*
		 * 출력문을 확인하면 width, height가 모두 같은 값을 가지고 있는 것을 알 수 있습니다. 
		 * 그 이유는 width, height 가 Card클래스의 클래스 변수로 사용되기 때문입니다. 모든 인스턴스는 공통된 저장공간을 갖고 있기 때문에 공통된 값이 출력됩니다.
		 */
		
		System.out.println("c1의 width, height 를 각각 50, 80으로 변경합니다.");
		
		c1.width = 50;
		c1.height = 80;
		/*
		 * 클래스 변수의 값을 각각 50, 80으로 초기화 해주었습니다. 다시 말해서 width, height 각각의 공통된 저장공간에 새로운 값을 넣어준 것입니다. 
		 */
		
		System.out.println("c1은"+c1.kind+","+c1.number+"이며, 크기는 (" + c1.width+","+c1.height+")");
		System.out.println("c2은"+c2.kind+","+c2.number+"이며, 크기는 (" + c2.width+","+c2.height+")");
		/*
		 * 클래스 변수 width, height의 값을 변경한 후 출력문의 결과 또한 변경 이후의 값들로 출력이 됨을 알수 있습니다. 
		 * 이렇게 Card.width, c1.width, c2.width는 모두 같은 저장공간을 참조하므로 항상 같은 값을 갖게 됩니다.
		 * 
		 */
	}
}
class Card{
	
	String kind;
	int number;
	/*
	 * kind, number은 인스턴스 변수입니다. 인스턴스(객체)가 생성될때 같이 생성됩니다. 
	 */
	static int width = 100;
	static int height = 250;
	/*
	 * 클래스 변수 width, height입니다. 이 둘은 모든 인스턴스(객체)에서 공통된 저장공간(변수값)을 갖게 됩니다. 
	 * 호출은 클래스이름.클래스변수 로 불러와줍니다. 
	 */
}