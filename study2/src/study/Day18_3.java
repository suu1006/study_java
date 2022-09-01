package study;

public class Day18_3 {

	public static void main(String[] args) {
	
		Car car1 = new Car("yellow");
		Car car2 = new Car("black", "auto", 8);
	}
}
class Car {
	String color;
	String gearType; 
	int door;
	
	Car() {
		this("white", "auto", 4); //√ ±‚»≠
	}
	Car(String color) {
		this(color, "auto", 4);
	}
	Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}