package study2;

public class B_1 {

		public void method() {
			A_1 a = new A_1();
			a.field = "value";
			a.method();
 //같은 패키지 안은 가능. 다른 패키지는 불가. 자식 클래스는 가능.
	}

}
