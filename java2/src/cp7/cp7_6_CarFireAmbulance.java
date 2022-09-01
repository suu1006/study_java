package cp7;

public class cp7_6_CarFireAmbulance {

	public static void main(String[] args) {
		Car car = null;
		
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = (Car)fe; 
		//참조변수 fe값을 car에 저장해서 car로도 FireEngine 인스턴스를 다룰 수 있게 되었음. 
		//(car로는 FireEinge인스턴스의 멤버 중 4개만 사용 가능)  
		fe2 = (FireEngine)car;
		fe2.water();
	}
}
class Car {
	String color;
	int door;
	
	void drive() {
		System.out.println("dive,Brrrr~~~");
	}
	void stop() {
		System.out.println("stop!!!");
	}
}
class FireEngine extends Car {
	void water() {
		System.out.println("water!!!!");
	}
}