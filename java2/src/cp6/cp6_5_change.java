package cp6;

class Data3 {int x;}

public class cp6_5_change {
	public static void main(String[] args) {
	 	
		Data3 d = new Data3();
		d.x = 10;
		System.out.println("main () : x = " + d.x);
		
		change2(d);
		System.out.println("After change(d)");
		System.out.println("main() : x = " + d.x);
	}
	
	static void change2 (Data3 d) {
		d.x = 1000;
		System.out.println("change() : x = " + d.x);
	}

}
