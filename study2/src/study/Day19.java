package study;

public class Day19 {

	public static void main(String[] args) {
		/*
		 * this는 생성자와 메소드의 이름이 필드와 비슷할 경우, 인스턴트 멤버인 필드임을 명시하고자 나타냄.
		 * static메소드 >> 객체를 생성하지 않고 클래스명. 메소드명으로 호출 가능.
		 * 인스턴스메소드 >> 객체 생성 후 호출 가능.(인스턴스(객체)가 존재해야만 사용가능)
		 * 오버로딩 >> 매개변수의 개수 or 타입이 다를 경우 메소드 정의할 수 있음.
		 * 매개변수 이름만 다르고 타입이 같으면 인정 X, 리턴 타입만 다르다면 인정X.
		 * 클래스이름 () {}
		 *
		 */
		Car12 car = new Car12();
		car.opendoor();
		Car12.toggleDoor(true);
	}

}
class Car {
	boolean door;
	
	void openDoor() {
		door = true;
		System.out.println(door);
	}
	static void toggleDoor(boolean d) {
		d = !d;
		System.out.println(d);
	}
}