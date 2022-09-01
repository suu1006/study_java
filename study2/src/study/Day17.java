package study;

public class Day17 {

	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		
		Test myTest = new Test();
		int c = myTest.sum(a,b);
		
		System.out.println(c);

	}
 
}

class Test { //메서드 구조 : public 리턴자료형 메소드명(입력자료형1 입력변수1) {
	// return 리턴값; (void인 경우 return문 필요없음.)
	public int sum (int a, int b) {
		return a + b;
	}
}