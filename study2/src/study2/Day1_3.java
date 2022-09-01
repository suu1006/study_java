package study2;

public class Day1_3 {

	public static void main(String[] args) {
		MyMath3 mm = new MyMath3();
		System.out.println("mm.add");
	}
}
class MyMath3 {
	int add (int a, int b) {
		System.out.println("int add(int a, int b) - ");
		return a+b;
	}
	long add (int a, long b) {
		System.out.println("long add(int a, long b) - ");
		return a+b;
	}
	long add (long a, int b) {
		System.out.println("long add(long a, int b) - ");
		return a+b;
	}
	long add (long a, long b) {
		System.out.println("long add(long a, long b) - ");
		return a+b;
	}
	int add (int [] a) {
		System.out.print("int add (int [] a) - ");
		int result = 0;
		for(int i=0; i<a.length; i++) 
			result += a[i];
		return result;
		}
	}