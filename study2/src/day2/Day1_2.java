package day2;

public class Day1_2 {

	public static void main(String[] args) {
	String name = "JA" + "VA";
	String str = name + 8.0;
	
	System.out.println(name);
	System.out.println(str);
	System.out.println(7+ " "); // 숫자 7을 문자열 "7"로 변환할 떄 빈 문자열 더해주자
	System.out.println(" " + 7);
	
	System.out.println(7+"");
	System.out.println(""+ 7);
	
	System.out.println("" + ""); 
	
	System.out.println(7 + 7 + ""); //14
	System.out.println("" + 7 + 7); //77
	}
}
