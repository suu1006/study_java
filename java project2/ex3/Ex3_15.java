package ex3;

import java.util.Scanner; //Scanner 클래스를 사용하기 위해 추가하였음~!

public class Ex3_15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char ch = ' ';
		
		System.out.printf("문자를 하나 입력하세요.>");
		
		String input = scanner.nextLine(); // nextLine 메소드 : Enter치기 전까지 쓴 문자열 모두 리턴!! 
		ch = input.charAt(0);
		
		//charAt() = String으로 저장된 문자열 중에서 한 글자만 선택해서 char타입으로 변환해주는 녀석!!!!
		//char(0)= 첫번째 글자, charAt(3)= 네번째 글자 >>> 프로그래밍에서 숫자 0부터 시작!
		
		if ('0' <= ch && ch <= '9') {
			System.out.printf("입력하신 문자는 숫자입니다.%n");
		}
		
		if(('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
			System.out.printf("입력하신 문자는 영문자입니다.%n");
		}
	}
}