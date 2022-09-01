package study2;

public class Car5_5Example {

	public static void main(String[] args) {
		Car5_5 myCar = new Car5_5();
		
		//잘못된 속도 변경
		myCar.setSpeed(-50);
		
		System.out.println("현재속도 : " + myCar.getSpeed());
		
		//올바른 속도 변경
		myCar.setSpeed(60);
		
		//멈춤
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		
		System.out.println("현재속도 : " + myCar.getSpeed());

	}

}
