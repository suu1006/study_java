package study2;

public class Car5_6 {

	String company = "Benz";
	String model;
	String color;
	int speed;

	Car5_6(String model, String color) {
		this(model, color, 300);
	}

	Car5_6(String model, String color, int speed) {
		this.model = model;
		this.color = color;
		this.speed = speed;
	}
}