package study2;

public class Car5_5Example {

	public static void main(String[] args) {
		Car5_5 myCar = new Car5_5();
		
		//�߸��� �ӵ� ����
		myCar.setSpeed(-50);
		
		System.out.println("����ӵ� : " + myCar.getSpeed());
		
		//�ùٸ� �ӵ� ����
		myCar.setSpeed(60);
		
		//����
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		
		System.out.println("����ӵ� : " + myCar.getSpeed());

	}

}
