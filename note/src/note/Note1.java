package note;

class Car {
	private int currentSpeed;
	private int accelerationTime;
	
	public void accelerate(int speed, int second) {
		
		System.out.println(second + "�ʰ� �ӵ��� �ü�" + speed + "���� ������!!");
	}
}


public class Note1 {
	public static void main(String[] args) {
		Car myCar = new Car(); //��ü ����
		myCar.accelerate(60,3); //�޼��� ȣ��
	}
}