package study2;

public class Car11 {

		
		int speed;
		
		void run () {
			System.out.println(speed + "로 달립니다.");
		}
		public static void main(String [] args) {
			Car11 myCar = new Car11();
			myCar.speed = 60;
			myCar.run();
	}

}
