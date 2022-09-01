package note;

public class Day1_1 {

	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		
		Test myTest = new Test(); //객체 생성
		
		int c = myTest.sum(a, b); // 호출방법 : 참조변수.메소드 
		
		System.out.println(c);
	}
}
class Test {
	public int sum (int a, int b) { //입력값 = 메소드 인수, 입력인수
		return a+b; // 리턴값 = 출력값, 결과 값, 돌려주는 값
	}
}