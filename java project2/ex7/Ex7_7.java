package ex7;

public class Ex7_7 {

	public static void main(String[] args) {
		Car car = null;
//		FireEngine fe = new FireEngine();  // 실제 인스턴스가 무엇인지가 중요.
		
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		//FireEngine fe2 = (FireEngine)car; 조상 -> 자손으로 형변환
		//Car car2 = (Car)fe2; 자손 -> 조상 으로 형변환 
		
		fe.water(); //호출 가능
		car =fe; //형변환 없이 사용가능하다는 것을 알려주기 위해 사용
		//car = water(); 불가능. car로 water() 사용불가. car에 정의된 것 4개.
		fe2 = (FireEngine)car; //조상 4개 -> 자손 5개로 변환 (증가니까 안전X- 생략불가) 
		fe2.water(); 
		
	}
}

class Car {
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, Brrr~");
	}
	void stop() {
		System.out.println("stop!!!");
	}
}
class FireEngine extends Car {
	void water() {
		System.out.println("water!!!");
	}
}
