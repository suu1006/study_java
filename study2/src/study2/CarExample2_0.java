package study2;

public class CarExample2_0 {
	public static void main(String[] args) {
		Car1_8 car = new Car1_8();

		for (int i = 1; i <= 5; i++) {
			int problemLocation = car.run();

			switch (problemLocation) {
			case 1:
				System.out.println("�տ��� HankookTire�� ��ü ");
				car.frontLeftTire = new HankookTire("�տ���", 15);
				break;

			case 2:
				System.out.println("�տ����� HankookTire�� ��ü ");
				car.frontRightTire = new HankookTire("�տ�����", 15);
				break;
			case 3:
				System.out.println("�ڿ��� HankookTire�� ��ü ");
				car.backLeftTire = new HankookTire("�ڿ���", 15);
				break;
			case 4:
				System.out.println("�ڿ����� HankookTire�� ��ü ");
				car.backRightTire = new HankookTire("�ڿ�����", 15);
				break;
			}
			System.out.println("=============================");
		}
	}
}
