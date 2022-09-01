package hello;

public class Day10_1 {

	public static void main(String[] args) {
		//while은 어떤 조건이 참일때만 반복됨.
		int a = 0;
		System.out.println("반복문 시작");
		while (a<5) {
			System.out.println(a);
			a++;
		} //5부터는 거짓이어서 빠져나감.
System.out.println("반복문 끝!");
System.out.println(a);
	}

}
