package study2;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;
		parent.method1();
		parent.method2(); //재정의된 메소드가 호출됨
		

	}

}
