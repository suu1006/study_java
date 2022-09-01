package study;

public class Day6_3_Calc { //주된 핵심 클래스
	
	public static void main(String[] args) {
		Calc calc = new Calc(); //헷갈리지 않기 위해 이름을 같게 사용 / 참조변수 사용
		//대문자는 클래스 , 소문자는 참조변수
		//메서드 호출 >> 참조변수.메서드이름(매개변수)
		calc.plus(1,1); //메서드 호출
		calc.minus(1,1);
		calc.mul(1,1);
		calc.div(1,1);
		int a = calc.plus(1, 1); //호출한 값을 a에 저장
		int b = calc.plus(1, 1);
		int c = calc.plus(1, 1);
		int d = calc.plus(1, 1);
		System.out.println("plus메소드의 결과는"+a+"입니다"); //저장한 후 출력
		System.out.println("minus메소드의 결과는"+b+"입니다");
		System.out.println("mul메소드의 결과는"+c+"입니다");
		System.out.println("div메소드의 결과는"+d+"입니다");
	}
}
class Calc { //클래스는 설계도 (설계도 안에 설계도 안됨!)
	int plus(int a, int b) { //타입 메서드이름(매개변수(타입 이름)){실행할 내용}
		return a+b;
	}
	int minus(int a, int b) {
		return a-b;
	}
	int mul(int a, int b) {
		return a*b;
	}
	int div(int a, int b){
		return a/b;
	}
}