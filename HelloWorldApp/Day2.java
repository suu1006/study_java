import java.util.Scanner; // 스캐너 클래스를 사용하기 위해 추가

public class Day2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //  Scanner 클래스의 객체 생성
		System.out.print("두 자리 정수를 하나 입력해주세요.>"); 
		String input = scanner.nextLine(); // nextLine() 메서드 호출 시, 입력을 마치고 엔터키를 누르면 입력한 내용이 문자열로 반환됨.
		int num = Integer.parseInt(input); // 입력받은 문자열을 숫자로 변환 : Integer.parseInt()
		
		System.out.println("입력내용 :" + input);
		System.out.printf("num = %d%n", num);

	}

}
 // Scanner 클래스에는 nextInt()나 nextFloat()와 같이 숫자로 바로 입력받을 수 있는 메서드들이 있음.