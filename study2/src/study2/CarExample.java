package study2;

public class CarExample {

	public static void main(String[] args) {
		Car5_6 myCar = new Car5_6();

		System.out.println("����ȸ�� : " + myCar.company);
		System.out.println("�𵨸� : " + myCar.model);
		System.out.println("���� : " + myCar.color);
		System.out.println("�ְ�ӵ� : " + myCar.maxSpeed);
		System.out.println("����ӵ� : " + myCar.speed);
		
		myCar.speed = 60;
		
		System.out.println("������ �ӵ� : " + myCar.speed);
	}
}
class Car5 { 

String company = "�����ڵ���";
String model = "�׷���";
String color = "����";
int maxSpeed = 350;
int speed;

}