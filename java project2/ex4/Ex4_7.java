package ex4;

public class Ex4_7 {

	public static void main(String[] args) {
		int num = 0;
		
		for (int i = 1; i<=5; i++) { //5번 반복한당!
			num = (int) (Math.random()*6) +1; //*6 = 개별값의 개수!!!!
			System.out.println(num);
		}
	}
}