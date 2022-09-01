package rerere;

class Car {
	String color;
	String geartype;
	int door;

	Car() {
	} // 기본생성자

	Car(String c, String g, int d) {
		color = c;
		geartype = g;
		door = d;
	}
}

class Ex6_12 {
public static void main(String[] args) {
	Car c1 = new Car();
	c1.color = "white";
	c1.geartype = "auto";
	c1.door = 4;
	
	Car c2 = new Car("white", "auto", 4);
	
	System.out.println("c1의 color = " +c1.color + ", geartype =" +c1.geartype + ", door =" + c1.door );
	System.out.println("c2의 color = " +c2.color + ", geartype =" +c2.geartype + ", door =" + c2.door );
	}
}