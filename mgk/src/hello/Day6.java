package hello;
import java .util.Scanner;
public class Day6 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in); 
//		//스캐너는 java.util 이라는 패키지에 포함되어 있는 클래스
//		System.out.print("이름을 입력하세요");
//		String name = sc.next();
//		System.out.println("당신의 이름은 " + name + "이군요");
//		sc.close(); //꼭 닫아주어야함.

Scanner sc = new Scanner(System.in); 
System.out.print("단어를 입력하세요: ");
String a = sc.next();

System.out.print("정수를 입력하세요: ");
int b = sc.nextInt();

System.out.print("실수를 입력하세요: ");
float c = sc.nextFloat();

System.out.print("문장을 입력하세요: ");
sc.nextLine(); //float 메서드에서 엔터값을 인식해서 문제발생.>> nextLine한번 더 써주기
String d = sc.nextLine();


System.out.println("입력한 것들을 모아볼까요?"); 
System.out.printf("단어는 %s / 정수는 %d / 실수는 %f / 문장은 '%s'" , a , b , c ,d);

sc.close(); 
	}
}