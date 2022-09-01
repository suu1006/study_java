package ex7;

class MyPoint extends Object {
	int x;
	int y;
	}
//class Circle extends Mypoint { //»ó¼Ó
//	int r;
//}

class Circle extends Object {
	MyPoint p;
	int r;
	
	Circle(){
		p = new MyPoint();
	}
}

public class Ex7_0 {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.p.x =1;
		c.p.y =2;
		c.r =3;
		System.out.println("c.p.x=" +c.p.x);
		System.out.println("c.p.y=" +c.p.y);
		System.out.println("c.r=" +c.r);
	}
}