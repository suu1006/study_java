package ex3;

public class Ex3_14 {

	public static void main(String[] args) {
		String str1= "abc";
		String str2 = new String("abc");
		
		System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc"=="abc"); //%b = boolean 형식으로 출력 / %n = 개행문자
		System.out.printf("str1==\"abc\" ? %b%n", str1=="abc");
		System.out.printf("str2==\"abc\" ? %b%n", str2=="abc"); // 객체가 달라서 false.
		System.out.printf("str1.equals(\"abc\" ? %b%n", str1.equals("abc")); 
		// 문자열을 비교할 때는 항상 equals()써야함 >> 객체가 달라도!!!! 내용이 같으면 true 반환하기 때문!!!!!!!
		
		System.out.printf("str2.equals(\"abc\" ? %b%n", str2.equals("abc")); 
		System.out.printf("str2.equals(\"ABC\" ? %b%n", str2.equals("ABC"));
		System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n",
												str2.equalsIgnoreCase("ABC"));
	}
}