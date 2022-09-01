package step2;

public class IfElse4 {

	public static void main(String[] args) {
		int x = 0;
		int y = 0;

		if  (((-1000 <= x && x <= 1000) && (x!=0)) && ((-1000 <= y && y <= 1000) && (y!=0))) {
			System.out.println("입력한 자료값이 범위 안에 있습니다.");
		}

		else if (x > 0 && y > 0) {
			System.out.println("제 1사분면입니다.");
			
		} else if (x < 0 && y > 0) {
			System.out.println("제 2사분면입니다.");

		} else if (x < 0 && x < 0) {
			System.out.println("제 3사분면입니다.");
			
		} else if (x > 0 && x < 0) {
			System.out.println("제 4사분면입니다.");
		}
	}
}