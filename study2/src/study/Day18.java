package study;

public class Day18 {

	public static void main(String[] args) {
		ReferenceDemo2 abc = new ReferenceDemo2();
		abc.runValue();
		abc.runReference();
	}
}
class A {
	public int id;
	A(int id) {
		this.id = id;
	}
}
class ReferenceDemo2{
	public static void runValue() {
		int a = 1;
		int b = a;
		b = 2;
		System.out.println("runValue" + a);
	}
	public static void runReference() {
		A a = new A(1);
		A b = a;
		b.id = 2;
		System.out.println(a.id);
	}
}