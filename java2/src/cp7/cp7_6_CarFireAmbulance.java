package cp7;

public class cp7_6_CarFireAmbulance {

	public static void main(String[] args) {
		Car car = null;
		
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = (Car)fe; 
		//�������� fe���� car�� �����ؼ� car�ε� FireEngine �ν��Ͻ��� �ٷ� �� �ְ� �Ǿ���. 
		//(car�δ� FireEinge�ν��Ͻ��� ��� �� 4���� ��� ����)  
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