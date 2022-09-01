package rerere;

public class Ex6_01 {

public static void main(String[] args) {
		Tv t; //객체 참조를 위해 참조변수 t 선언
		t = new Tv(); // tv인스턴스 생성 / 주소를 t에 저장
		t.channel = 7; //멤버변수 channel의 값을 7로 한다
		t.channelDown(); // 메서드 channeldown을 호출한다.
		System.out.println("현재 채널은" + t.channel + "입니다.");
	}
}

class Tv {
	String color;
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp(){++channel;}
	void channelDown() {--channel;}
}