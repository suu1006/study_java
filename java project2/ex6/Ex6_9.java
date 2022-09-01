package ex6;

public class Ex6_9 {

	long a, b; // 필드
	
	long add() { // 메서드
		return a + b;
	}

	long substract() {
		return a - b;
	}

	long multiply() {
		return a * b;
	}

	long divide() {
		return a / b;
	}

	static long add(long a, long b) { // 클래스 메서드
		return a + b;
	}

	static long substract(long a, long b) {
		return a - b;
	}

	static long multiply(long a, long b) {
		return a * b;
	}

	static double divide(long a, long b) {
		return a / b;
	}

	public static void main(String args[]) { // main은 한개만!
		System.out.println(Ex6_9.add(200L, 100L)); // 대문자로 시작.메소드 이름() = 클래스 메서드
		System.out.println(Ex6_9.substract(200L, 100L));
		System.out.println(Ex6_9.multiply(200L, 100L));
		System.out.println(Ex6_9.divide(200L, 100L));
				
		Ex6_9 mm = new Ex6_9(); // 자바는 생성자를 안만들면 기본적으로 빈 생성자를 만들어준다.
		mm.a = 200L; 
		mm.b = 100L;

		System.out.println(mm.add()); //메서드를 호출할때, 소문자로 시작.메소드 이름() = 인스턴스 메서드
		System.out.println(mm.substract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());
	}
}


//class 어린이집{ // 어린집 시스템
//	필드; (저장소)// 인스턴스 변수 라고도 불러요
//	String 선생님; = 정수씨
//	String 유아; = 진묵이
//	
//	
//	생성자; //클래스이름 = 생성자 이름
//	어린이집(String 선생님,String 유아){ // 꼭 필요한걸 넣어주는 역할
//		this.선생님 = 선생님; 정수씨
//		this.유아 = 유아; 진묵이 
//	}
//	
//	
//	메서드; //클래스가 할 수 있는 일
//	String 이름부르기() {
//		return 유아;
//	}
//	
//}
//
//어린이집 lg어린이집 = new 어린이집("정수씨", "진묵이");
//lg어린이집.이름부르기();





























