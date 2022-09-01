package cp6;

class cp6_10_member {
	static {
		System.out.println("static { }");
	}
	{
		System.out.println(" { }");
	}
	public cp6_10_member() {
		System.out.println("»ý¼ºÀÚ");
	}
public static void main(String[] args) {
	System.out.println("cp6_10_member bt = new cp6_10_member();");
	cp6_10_member bt = new cp6_10_member();
	
	System.out.println("cp6_10_member bt2 = new cp6_10_member();");
	cp6_10_member bt2 = new cp6_10_member();
	}
}