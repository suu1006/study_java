package study2;

public class Car5_6Ex {

	public static void main(String[] args) { // 실행 메소드

		Car5_6 myCar1 = new Car5_6("E100", "white");
		System.out.println("myCar1.model : " + myCar1.model);
		System.out.println("myCar2.color : " + myCar1.color);
		System.out.println("myCar3.speed : " + myCar1.speed);
		System.out.println();

		Car5_6 myCar2 = new Car5_6("E300", "Black", 500);
		System.out.println("myCar2.model : " + myCar2.model);
		System.out.println("myCar2.color : " + myCar2.color);
		System.out.println("myCar2.speed : " + myCar2.speed);
	}
}