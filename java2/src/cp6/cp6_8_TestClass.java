package cp6;

public class cp6_8_TestClass {

	public static void main(String[] args) {
		void instanceMethod() {} // 인스턴스 메소드
		static void staticMethod() {} // static 메소드
		
		void instanceMethod2() { // 인스턴스 메소드
			instanceMethod();  // 인스턴스 메서드 호출
			staticMethod(); //static메소드 호출
			
		static void staticMethod2() {
			instanceMethod();
			staticMethod();
		}
		}
	}

}
