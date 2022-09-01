package day1;

class Outer3 { 
	int value = 10; // Outer.this.value (외부 클래스의 iv)
	
	class Inner {
		int value = 20; //this.value (내부 클래스의 iv)
		
		void method1() { 
			int value = 30; //lv
			System.out.println("            value : " + value);
			System.out.println("       this.value : " + this.value);
			System.out.println("Outer3.this.value : " + Outer3.this.value);
		}
	}
}

class Day1_5 {
	public static void main(String args[] ) {
		Outer3 outer = new Outer3();
		Outer3.Inner inner = outer.new Inner();
		inner.method1();
	}
}
