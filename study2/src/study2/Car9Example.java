package study2;

public class Car9Example {

	public static void main(String[] args) {
	Car9 myCar = new Car9();
	
	myCar.keyTurnOn();
	
	myCar.run();
	
	int speed = myCar.getSpeed();
	
	System.out.println("현재 속도 : " + speed + "km/h");
	
	}
}