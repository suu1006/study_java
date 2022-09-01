package study2;

public class Day1_4 {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		
		Car c2 = new Car("red", "handle", 4); 
		
		System.out.println("c1의 color = " + c1.color + ", gearType = " + c1.gearType + ", door = " + c1.door);
		System.out.println("c2의 color = " + c2.color + ", gearType = " + c2.gearType + ", door = " + c2.door);
	}
}
class Car { 
	String color; //선언
	String gearType;
	int door;
	
	Car() {}
	
	Car(String c, String g, int d) { //매개변수가 있는 생성자 
		//멤버변수의 값을 초기화시킨 인스턴스가 필요하기 때문에, 매개변수가 있는 생성자를 사용한다.
		color = c;
		gearType = g;
		door = d;
	}
}