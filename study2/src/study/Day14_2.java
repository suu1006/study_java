package study;

public class Day14_2 {

	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		
		int result = (x>y) ? x: y; // x가 y보다 크다면, result = x; 가 되고, 조건식이 거짓이라면 result = y;가 이루어집니다.
		System.out.println(result); // 3은 5보다 작으니 result = y 가 시행되어 result 값에는 5가 저장됩니다.
		
		char a = 'a';
		char b = 'b';
		
		char result1 = (a==b) ? a : b; //a와 b가 같은 문자라면 result에는 문자 a가 저장\되고, 아니라면 b가 저장 됩니다.
		System.out.println(result1); // a와 b는 다른 문자이기 때문에 조건식이 거짓이고, char result1에는 b가 저장됩니다.
	}
}