package study2;

public class Korean2 {

	public static void main(String[] args) {
		Korean1 k1 = new Korean1("박정수", "971006-2000111");
		System.out.println("k1.name : " + k1.name);
		System.out.println("k2.ssn : " + k1.ssn);
		
		Korean1 k2 = new Korean1("현성안", "931006-1000222");
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.ssn : " + k2.ssn);
	}
}