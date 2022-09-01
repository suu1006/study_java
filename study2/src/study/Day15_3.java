package study;

public class Day15_3 {

	public static void main(String[] args) {
		int a = 1; // a : 원본 
		int b = a; // b : 복사본
		b=2; //복사본의 값을 수정해도 원본파일인 a에는 영향을 주지 않음. 따라서 a = 1이 출력됨
		System.out.println("runValue : " + a);

	}

}
