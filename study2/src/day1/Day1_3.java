package day1;

class Outer {
	private int outerIv = 0;
	static int outerCv = 0;
	
	class InstanceInner {
		int iiv = outerIv; //핵심 >> 외부 클래스의 private 멤버도 접근가능하다.
		int iiv2 = outerCv;
	}
	static class StaticInner {
		//int siv = outerIv; // static 클래스는 외부 클래스의 인스턴스 멤버에 접근할 수 없다 
		static int scv = outerCv;
	}
	void myMethod() {
		int lv = 0;        // >>지역 변수(x) 메서드 종료와 함께 소멸
		final int LV = 0;  // >>상수(o)
		
		class LocalInner {  // 내부 클래스의 객체가 지역변수보다 더 오래 존재가능
			//외부 클래스의 지역변수는 final이 붙은 변수(=상수)만 접근 가능
			int iiv = outerIv;
			int iiv2 = outerCv;
//			int iiv3 = lv; 에러 (JDK1.8부터 에러 아님)
			int iiv4 = Lv;
		}
	}
}