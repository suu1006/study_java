package ex6;
class Car2{
	String color;
	String gearType;
	int door;
	
	Car2(){
		this("white", "Auto", 4);
	}
	Car2(String color){
		this (color, "Auto", 4);
	}
	Car2(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}
class Ex6_13{
	public static void main(String[] args) {
		Car2 c1 = new Car2();
		Car2 c2 = new Car2("blue");
		
		System.out.println("c1�� color =" + c1.color +", gearType=" +c1.gearType+ ", door =" +c1.door);
		System.out.println("c2�� color =" + c2.color +", gearType=" +c2.gearType+ ", door =" +c2.door);
		}
}