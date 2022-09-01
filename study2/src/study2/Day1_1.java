package study2;

public class Day1_1 {

	public static void main(String[] args) {
		Calculator calculator = new Calculator(3,5); //객체생성
		System.out.println(calculator.x);
		System.out.println(calculator.y);
//		int result = calculator.sum(3, 5); //호출
//		System.out.println(result); //출력
	}
}
class Calculator {
	int x;
	int y;
	
	Calculator(int x, int y){ // 클래스이름() {} : 생성자
		this.x = x;
		this.y = y;
	}
}
