package ex7;


public class Ex7_3 {

	public static void main(String[] args) {
		Child2 c = new Child2();
		c.method();
	}
}
class Parent2 { int x = 10;} // super.x�� this.x �� �� ����

class Child2 extends Parent2 {
	void method() {
	System.out.println("x=" + x);
	System.out.println("this.x="+ this.x);
	System.out.println("super.x="+ super.x);
	}
}


class Circle {
	int x ;
	int y ;
	int r  ;
}

class Circle {
	Point c = new Point();
	int r;
}