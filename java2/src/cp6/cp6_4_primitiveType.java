package cp6;

class Data { int x; }

public class cp6_4_primitiveType {

	public static void main(String[] args) {
		Data d = new Data();
		d.x =10;
		System.out.println("main() : x = " + d.x);
		
		change(d.x); // change 메서드 호출
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);

	}
	
	static void change(int x) {
		x = 1000;
		System.out.println("change() : x = " + x);
	}

}
