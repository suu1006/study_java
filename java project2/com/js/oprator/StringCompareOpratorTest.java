package com.js.oprator;

public class StringCompareOpratorTest {
//new는 
	public static void main(String[] args) {
		String name01 = "홍길동";
		String name02 = "홍길동";
		String name03 = new String("홍길동"); //다른 주소 번지수 참조, 델리게이션 된 객체
		
		System.out.println(name01 == name02);
		System.out.println(name01 == name03);
		System.out.println(name02 == name03);
		
		System.out.println("===============");
		
		//String의 문자열 비교는 equals 사용!!!(실무에서 많이 사용)
		
		System.out.println(name01.equals(name02)); 
		System.out.println(name01.equals(name03));
		System.out.println(name02.equals(name03));
		

	}

}
