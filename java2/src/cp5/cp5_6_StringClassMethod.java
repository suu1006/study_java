package cp5;

public class cp5_6_StringClassMethod {

	public static void main(String[] args) {
//		String str = "ABCDE";
//		char ch = str.charAt(3);
//		System.out.println(ch);
//		
//		String str2 = str.substring(1,4);
//		System.out.println(str2);
//		
//		String str4 = str.substring(1); // to를 적지 않으면 뒷부분 모두 출력 1~4
////		String str4 = str.substring(1,str.length()); // 1~4
//		System.out.println(str4);

		
		String str = "ABCDE";
		char ch = str.charAt(3);
		System.out.println(ch);
		
		String str2 = str.substring(1,4);
		System.out.println(str2);
		
//		String str4 = str.substring(1);
		String str4 = str.substring(1,str.length());
		System.out.println(str4);
		
	}

}
