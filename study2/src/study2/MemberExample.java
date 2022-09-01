package study2;

public class MemberExample {

	public static void main(String[] args) {
		Member member1 = new Member("Åõ½æ");
		System.out.println("name : " + member1.name);
		System.out.println();
		
		Member member2 = new Member("½ºÅ¸¹÷½º", "star");
		System.out.println("name : " + member2.name);
		System.out.println("id : " + member2.id);
	}
}