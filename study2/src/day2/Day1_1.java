package day2;

public class Day1_1 {

	public static void main(String[] args) {
		System.out.println("Hello, World"); //글자를 줄바꿈하고 Hello, World 를 출력
		System.out.print("Hello"); // 글자를 줄바꿈 하지 않고, Hello 출력
		System.out.println("World");// 글자를 줄바꿈 하고, Hello 출력
		
		System.out.println("jeong su");
		System.out.print("jeong"); // 한줄에 그대로 출력한다고 생각하자~
		System.out.print("su");
		System.out.println("jjang");
		
		System.out.println("3+5="); //따옴표 안에 있으니 글자를 출력하고
		System.out.println(3+5); // 계산한 값을 보여준다. / 사칙연산이 포함된 식 출력하려면 > 괄호 안에 식만 넣으면 됨
		
		System.out.println(5+3);
		System.out.println(5-3);
		System.out.println(5*3);
		System.out.println(5/3); // 정수 나누기 정수는 정수!
		
		//변수란 하나의 값을 저장할 수 있는 저장공간 (오직 하나의 값! 이미 저장된 값은 지워지고, 새로운 값 저장됨)
		//변수 선언 방법 : 변수타입 변수이름
		// = 는 같음의 의미가 아니라, 오른쪽의 값을 왼쪽에 저장하라는 의미! >> 대입연산자
		int x; // 정수 x 선언
		x = 5; //5를 x에 대입
		
		System.out.println(x);
		
		x=10;
		System.out.println(x); // 이미 저장된 값은 지워지고, 새로운 값 저장됨
		
	    // int/long     >> 정수 저장 타입 (20억 넘으면 long)
		// float/double >> 실수 저장 타입(오차없이 7자리, double은 15자리)
		// char         >> 문자 저장 타입
		// String       >> 문자열(=여러 문자) 저장 타입
		
		int f = 100;
		double pi = 3.14;
		char ch = 'a';
		String str = "abc";
		
		System.out.println(f);
		System.out.println(pi);
		System.out.println(ch);
		System.out.println(str);
		
		// 상수 >> 값을 저장할 수 있는 공간 but, 다른 값으로 변경할 수 없음(변수선언방법과 동일)
		// final 붙여주기 (상수 저장된 후에는 상수 값 변경하는 것 허용되지 않음)
		// 상수이름 모두 대문자, 여러 단어로 이루어져 있는 경우 > '_'
		// 변수 : 하나의 값을 저장하기 위한 공간 / 상수 : 값을 한번만 저장할 수 있는 공간 / 리터럴 : 그 자체로 값을 의미하는 것
		// 정수형의 long 타입 리터럴은 접미사 'l', 'L' 붙임. 접미사가 없으면 int 타입의 리터럴
		// byte와 short 타입(리터럴 별도 존재X)의 변수에 값을 저장할 때는 int 타입의 리터럴 사용
		
		//16진수 표현 : 'Ox' 'OX' 붙이기 8진수 : 0 붙이기
		int octNum = 010; // 8진수 10, 10진수로 8
		int hexNum = 0x10; // 16진수 10, 10진수로 16
		
		// JDK 1.7부터 정수형 리터럴의 중간에 구분자-를 넣을 수 있음
		long big = 100_000_000_000L;
		long hex = 0xFFF_FFF_FFF_FFFL;
		
		// 실수형 float 타입 :  접미사 f / F  // double 타입 : 접미사 d / D
		float pi0 = 3.14f;
		double rate = 1.618d; //d는 생략가능
		
		// String은 클래스 new 연산자를 써야하지만 
		String name = new String("JAVA");
		String name2 = "JAVA"; // 위에 문장을 간단히! 
		
		
	}

}
