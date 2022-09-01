package study2;

public class FinalClass {

	public static void main(String[] args) {
		FinalExample p1 = new FinalExample("123456-1234567", "È«±æµ¿");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
//		pi.nation = "usa";
//		pi.ssn = "123567-125678";
		p1.name = "È«»ï¿ø";
	}
}
