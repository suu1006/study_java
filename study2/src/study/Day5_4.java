package study;

public class Day5_4 {

	public static void main(String[] args) {
		int a = 15;
		if (0<a && a<10 && a%3==0) { //먼저 연산할거 괄호 꼭 써주기!
			System.out.println("a는 범위 안에 있으면서 3의 배수입니다.");
		} else {
			System.out.println("a는 범위 안에 없거나 3의 배수가 아닙니다.");
		}
	}
}
