package cp7;

public class cp7_3_super2 {

	public static void main(String[] args) {
		Child2 c = new Child2();
		
		c. method();
	}
}

class Parent2 { int x = 10;  // 모든 인스턴스에는 this와 super가 지역변수로 존재
}
class Child2 extends Parent2 {
	void method () {
		System.out.println("x=" + x);
		System.out.println("this.x=" + this.x);
		System.out.println("super.x=" +super.x);
	}
}