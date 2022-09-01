package study;

import java.util.*;

public class Day {

	public static void main(String[] args) {
	String str = "3";
	
	System.out.println(str.charAt(0) - '0'); //문자열을 문자로 변환 후 숫자로 변환('0' 뺴기)
	System.out.println('3'-'0' +1); //문자 3을 숫자로 변환 후 +1 계산
	System.out.println(Integer.parseInt("3" +1)); //문자열을 숫자로 변환
	System.out.println("3"+1); // 문자 3 이랑 숫자 1이랑 출력!
	System.out.println((char)3+'0'); //문자3 + 0을 더하면 문자 3 출력ㄷ..
	
	/* 
	 * 숫자를 문자로 변환 / 숫자에 '0' 더하기 / (char)(3+'0') >> '3'
	 * 문자를 숫자로 변환 / 문자에서 0빼기 / '3'-'0' >> 3 출력
	 * 숫자를 문자열로 변환 / 숫자에 빈 문자열 더하기 /3+"" >> "3"
	 * 문자열을 숫자로 변환 / Integer.parseInt() 또는 Double.parseInt()
	 * 문자열을 숫자로 변환 /   
	 */
		
		
		
		
	}
	

}
