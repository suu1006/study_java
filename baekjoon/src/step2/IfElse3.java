package step2;

public class IfElse3 {

	public static void main(String[] args) {
		int year = 2021;
		
		if (year %4==0 && year%100==0 || year) {
			System.out.println("1");
		} else { System.out.println("0");

		}
	}
}