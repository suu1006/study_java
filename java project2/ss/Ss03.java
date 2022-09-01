package ss;

public class Ss03 {

	public static void numbering(int limit)(String[] args) { //int limit >> 매개변수(입력값을 수용하기 위한 변수)
		int i = 0;
		while (i<10) {
			System.out.println(i);
			i++;
		}
	}
//메서드의 정의
public static void main (String[] args) {
	numbering(5);// 5>> 인자
	}
}
//메서드의 호출