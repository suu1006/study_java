package study;

public class Day14_1 {

	public static void main(String[] args) {
		
		//next() >> 스페이스 즉 공백 전까지 입력받은 문자열을 리턴
		//nextLine() >> Enter 치기 전까지 쓴 문자열을 모두 리턴
		
		char ch = ' ';
		
		switch(ch) {
		case 'a' :
		case 'e' :
		case 'i' :
		case 'o' :
		case 'u' :
			System.out.println("해당 문자는 소문자 모음입니다.");
			break;
		case 'A' :
		case 'E' :
		case 'I' :
		case 'O' :
		case 'U' :
			System.out.println("해당 문자는 대문자 모음입니다.");
			break;
		default : 
			System.out.println("해당 문자는 모음이 아닙니다.");
			break;
		}
	}
}