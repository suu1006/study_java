package interfaceTest;

class A {
//	public void method(B b) { //�������̽� I�� ������ ��鸸 ���Ͷ�!
	public void method(I i) { //�������̽� I�� ������ ��鸸 ���Ͷ�!
		i.method();
	}
}

	interface I {
		public void method();
	}
	
class B implements I {
	public void method() {
		System.out.println("BŬ������ �޼���");
	}
}

class C implements I {
	public void method() {
		System.out.println("CŬ������ �޼���");
	}
}
public class InterfaceTest{
	public static void main(String[] args) {
		A a = new A();
		a.method(new C()); //A�� B�� ���(����)
	}
}
}
