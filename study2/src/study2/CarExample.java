package study2;

public class CarExample {

	public static void main(String[] args) {
		Car5_6 myCar = new Car5_6();

		System.out.println("제작회사 : " + myCar.company);
		System.out.println("모델명 : " + myCar.model);
		System.out.println("색깔 : " + myCar.color);
		System.out.println("최고속도 : " + myCar.maxSpeed);
		System.out.println("현재속도 : " + myCar.speed);
		
		myCar.speed = 60;
		
		System.out.println("수정된 속도 : " + myCar.speed);
	}
}
class Car5 { 

String company = "현대자동차";
String model = "그랜저";
String color = "검정";
int maxSpeed = 350;
int speed;

}