package day1;
class Day1_1 {
	//인스턴스 내부 클래스
	class InstanceInner{ //인스턴스 내부 클래스
	int iv=100;
//	static int cv=100; // 에러! static 변수를 선언할 수 없다. 
	final static int CONST=100; //final static => 상수이므로 허용
}
	// static 내부 클래스 //객체 생성 없이 사용 가능해야함. 
	// static 내부 클래스에서는 외부 클래스 인스턴스 멤버에 접근할 수 없다. 
	static class StaticInner { 
	int iv = 200;
	static int cv = 200; //static 클래스만 static 멤버를 정의할 수 있다. 
}
	// 지역 내부 클래스
	void myMethod() {
		class LocalInner { //  지역내부 클래스
			int iv = 300;
//			static int cv = 300; //에러! static변수를 선언할 수 없다.
			final static int CONST = 300; //final static 이므로 상수
		}
	}
// class 의 접근제어자 : default / public 
// 내부클래스의 접근제어자 : default / public / protected / private
public static void main(String args[]) { 
	System.out.println(InstanceInner.CONST); //100
	System.out.println(StaticInner.cv); //200
	System.out.println(LocalInner.CONST); //에러.>> 내부 클래스안에서만 가능
	//에러 이유 : 지역내부 클래스의 static 상수는 메서드 내에서만 사용가능
}
}