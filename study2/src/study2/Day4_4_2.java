package study2;

public class Day4_4_2 {

	public static void main(String[] args) {
		Car8 myCar = new Car8();

		myCar.setGas(6);

		boolean gasState = myCar.isLeftGas();

		if (gasState) {
			System.out.println("����մϴ�.");
			myCar.run();
		}

		if (myCar.isLeftGas()) {
			System.out.println("gas�� ������ �ʿ䰡 �����ϴ�.");
		} else {
			System.out.println("gas�� �����ϼ���.");
		}
	}
}