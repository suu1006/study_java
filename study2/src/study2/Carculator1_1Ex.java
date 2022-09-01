package study2;

public class Carculator1_1Ex {

	public static void main(String[] args) {
		Calculator1_1 myCalc = new Calculator1_1();
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5,6);
		System.out.println("result1 : " + result1);
		
		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide(x, y);
		System.out.println("result 2 : " + result2);
	}
}