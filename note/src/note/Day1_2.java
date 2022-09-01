package note;

public class Day1_2 {

	public static void main(String[] args) {
		int a = 1;
		Test myTest = new Test(); //객체 생성
		myTest.vartest(a); //호출 참조변수.메소드
		System.out.println(a); //출력

	}

}
class Test {
	public void vartest (int a) {
		a++;
	}
}