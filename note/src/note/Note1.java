package note;

class Car {
	private int currentSpeed;
	private int accelerationTime;
	
	public void accelerate(int speed, int second) {
		
		System.out.println(second + "초간 속도를 시속" + speed + "으로 가속함!!");
	}
}


public class Note1 {
	public static void main(String[] args) {
		Car myCar = new Car(); //객체 생성
		myCar.accelerate(60,3); //메서드 호출
	}
}