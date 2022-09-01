package ex6;

public class Ex6_12 { // public 붙은 class 젤위에 두면 보기 편해요

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;

		Car c2 = new Car("white", "auto", 4);

		System.out.println("c1의 color =" + c1.color + ", gearType =" + c1.gearType + ", door =" + c1.door);
		System.out.println("c2의 color =" + c2.color + ", gearType =" + c2.gearType + ", door =" + c2.door);
	}

}

class Car { 
	//필드 증명
	String color;
	String gearType;
	int door;
	//생성자
	/*
	 * 1. 생성자가 존재하지 않는다면 기본적으로 자바는 기본생성자 빈거()를 만들어준다. / Car (){} 이게 존재하지 않으면 기본으로 만들어줌
	 * 2. 만약에 생성자가 존재한다면 빈거던 아니던 기본생성자를 만들어주지 않는다. 
	 * = Car() {} 이거나 Car(String c, String g, int d) { 둘중에 하나라도 있으면 기본생성자 안만들어줌!
	 * 3. 만약에 꽉찬 생성자를 만들고, 빈 생성자를 지운다면 new에 오류가 생긴다.  
	 * 
	 */
	Car() {} // 자동차는 아무것도 필요없습니다.라는 공간 만들어주기

	Car(String c, String g, int d) { // 자동차는 String c와 String g와 int d 를 꼭 필요로 합니다.
		color = c;
		gearType = g;
		door = d;
	}
	//메서드
}