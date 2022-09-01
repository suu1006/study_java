package ex6;

public class Ex6_6 {
	
	public static void main(String[] args) { 
		class Data {int x};
		Data d = new Data(); //°´Ã¼ »ý¼º
		d.x = 10;
		System.out.println("main() : x" + d.x);
		
		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main() : x" + d.x);
		
	static void main(int x) {
		x = 1000;
		System.out.println("change() : x" + x);
	}
	}
	