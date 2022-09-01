package study;

public class Day17_2 { //입력값이 없는데 출력값이 있는 것

	public static void main(String[] args) {
	int a = 1;
	Test3 myTest = new Test3(); //new 클래스이름 작성하기
	a = myTest.vartest(a); //a 멤버변수 , a 지역변수 
	System.out.println(a);
	}
}

//클래스 주소를 담을 수 있는 참조변수 선언해주고 >> 결과값을 담을 수 있는 변수 선언 >> 호출한 메서드 대입 (참조변수.메서드명)
class Test3 {
	public int vartest(int a) {
		a++;
		return a;
	}
}