package study;

public class Day10 {

	public static void main(String[] args) {

		public class dropTop {

		public static void main(String[] args) {
		package day07_22;
		/*두 변수의 값 교환하기 코드입니다. 
		* 변수의 선언과 초기화 한 부분을 주석으로 달고, int tmp를 선언, 초기화 한 이유가 무엇인지 달아주세요.
		* tmp변수를 이용해 x, y의 값이 어떻게 바뀐것인지 주석으로 설명해주세요. (힌트: = 는 대입 연산자로, 우항의 값을 좌항에 넣어줍니다!
		*/
		public class dropTop {

		public static void main(String[] args) {
						
		int x = 10, y = 20; // 정수형 변수 x에 10을 대입, y에 20을 대입! (변수 선언 후 초기화까지 이루어짐)
		int tmp = 0; //정수형 tmp 변수를 0으로 초기화 (값을 넣으려고 정수형으로 선언 후 초기화함.)
						
		System.out.println("x:"+x+"y:"+y); // x의 값 10 출력, y의 값 20 출력  
						
		tmp = x; // x의 값을 tmp 변수에 대입하여, tmp의 값은 0에서 10으로 바뀜. 
		x = y; //y의 값 (20)을 x에 대입하여, x의 값 20으로 저장됨.
	    y = tmp;// tmp의 값(10)을 y에 대입하여, y의 값은 10으로 저장됨.
					    
		System.out.println("x:"+x+"y:"+y); //x의 값은 20, y의 값은 10으로 출력 (x와 y의 값이 바뀜.)
		}
}

		주석달기 2번 입니다.
		package day07_22;

		/*화면에서 입력받기 - Scanner 코드입니다.
		* 스캐너 사용법에 대해서 다시 복습해봅시다. 자바의 정석 교제를 참고하여 Scanner클래스를 사용하기 위한 순서를 주석으로 달아주세요.
		*Ex) 1. import 문으로 스캐너 클래스를 불러온다. -> 2. 다음 단계 서술
		*정수 값을 입력받기 전에, 출력문을 이용하는 이유에 대해서 주석을 달아주세요.
		*주석을 다 달았다면, 정수형 변수 a, b, c도 값을 입력받도록 만들어봅시다.
		* 
		*/
		/* 스캐너 사용 순서 
		 * 1. scanner 클래스를 사용하기 위해 import문 추가! (java.util.*;은 스캐너를 포함한 모든 클래스! / java.util.Scanner;은 스캐너클래스!)
		 * 2. scanner 참조변수로 new를 사용하여 객체를 생성하기
		 * 3. 출력문을 보고 원하는 값을 작성해야하니까 출력문 먼저 작성하기!
		 * 4. scanner 참조변수의 next 메서드를 호출한다.(정수형으로 값을 받을거니까 nextInt를 사용한다.)
		 * 5. 입력받은 문자열을 숫자로 변환하려면, Integer.parseInt() 메서드를 사용해야한다. 
		 * 6. 입력받은 값을 변수 a에 저장한다.
		 */
				import java.util.*; //java안에 있는 util 패키지 안에 * 모든 클래스를 사용할 수 있는 import문 작성.

				public class dropTop {

					public static void main(String[] args) {
						Scanner scanner = new Scanner(System.in); 
			//Scanner 참조변수를 사용하고, 변수이름은 헷갈리지 않게 같은 이름으로 scanner라고 붙여주고, new 사용하여 객체 생성하기
						
						System.out.println("두 자리 정수를 하나 입력해주세요."); 
						//츌력문 작성(사용자가 질문을 보고 값을 입력받아야하니까 출력문 먼저 작성하기.)
						
						String input = scanner.nextLine(); //문자열 string input 변수에 문자열로 입력받은 값 input에 대입.
						int num = Integer.parseInt(input);
						//input에 받았던 값을 정수타입 변수 num에 String 타입의 문자를 int(정수값)로 변환하여 저장.
						
						int a = scanner.nextInt(); //정수형 변수 a 값 입력받기
						int b = scanner.nextInt(); //정수형 변수 b 값 입력받기
						int c = scanner.nextInt(); //정수형 변수 c 값 입력받기
						
						System.out.println("입력내용:"+input); //입력 내용: 과 input의 값 출력
						System.out.printf("num=%d%n", num); //줄바꿈 된 후 %d 정수값을 넣어 num 값 출력하기
					}
				}
				주석달기 3번 입니다.
				package day07_22
				/* 실수형- float, double 주석 달기 입니다.
				 * %f의 역할, %f를 입력했을때 소수점 몇번째 자리까지 출력하는지 주석을 달아주세요.
				 * %24.20f의 경우, 전체 몇 자리중 소수점 이하로 몇자리를 출력하는지 주석을 달아주세요.
				 * 자바의 정석 책 변수- 기본형을 참고해서 다른 출력 서식들(%d, %s 등등)도 복습해봅시다. 예제 코드를 보며 출력 서식에 따라 결과값이 어떻게 나오는지 알아봐요:)
				 * 
				 * 관련 링크: https://the-duchi.tistory.com/12
				 */
				/*
				 * %d : 10진 정수 / %f : 부동 소수점 / %c : 문자 / %s : 문자열 / %x : 16진 정수형식
				 * [%s]는 문자열의 길이만큼 출력하기
				 * [%20s]는 20글자 출력공간 확보(우측정렬)
				 * [%-20%s]는 20글자 출력공간 확보(좌측정렬)
				 * [%.8%s] 는 왼쪽에서 8글자만 출력
				 */
				public class dropTop {

				public static void main(String[] args) {
				float f = 0.1234567890f; //실수형(float은 7자리까지) f 변수에 0.1~ 대입
				float f2 = 1.2345678901234567890f; //실수형 f2변수에 1.2~ 값 대입하기 
				double d = 9.12345678901234567890d; //실수형(double은 15자리까지 정밀!)d 의 값에 9.1~ 값 대입하기
				
				System.out.printf("       123456789012345678901234%n"); //줄바꿈하고 123~ 값 출력됨.
				System.out.printf("f   : %f%n", f); // (소수로 출력할 때 %f 사용!)  f의 값 넣어 출력 / 줄바꿈 실행
				System.out.printf("f   : %24.20f%n", f); //f는 소수점 24자리 중에 20자리만 출력 
				System.out.printf("f2  : %24.20f%n", f2);//f2는 소수점 24자리 중에 20자리만 출력
				System.out.printf("d   : %24.20f%n", d);//d는 소수점 24자리 중에 20자리만 출력 
					}
				}
				주석달기 4번입니다.
				package day07_22;
				/*
				 * 단항 연산자 - 증감 연산자 주석 넣기입니다.
				 * 단항 연산자를 문자의 앞, 뒤에 써주었을때의 결과값이 어떤 로직을 거쳐 나오는지 서술해주세요. 
				 * 단항 연산자 뿐 아니라, 등가 비교 연산자(==, !=)와 논리 연산자(&&, ||)에 대해서도 책의 예제 코드를 보면서 정독해봅시다.
				 * 등가 비교 연산자 링크: https://keep-cool.tistory.com/19
				 * 논리 연산자 링크: http://tcpschool.com/java/java_operator_logic
				 */
				public class dropTop {

					public static void main(String[] args) {
					int i = 5, j = 0; //i의 값 5, j의 값 0을 대입한다.
					j = i++; // 후위연산자, i의 값이 실행 후 증가하며, j의 값은 증가하기 전의 값이 저장된다.
					System.out.println("j=i++; 실행 후, i="+i+", j="+j); //i의 값은 여기 줄에서 증가하기때문에 i는 증가하여 6, j의 값은 5로 출력된다.
					
					i = 5; //5를 i에 대입한다.
					j = 0; //0을 j에 대입한다.
					
					j = ++i; // 전위 연산자, 실행 전 증가한다. 증가한 값이 j에 저장되기 때문에 j=6으로 저장됨
					
					System.out.println("j= ++i;  실행 후, i=" + i + ", j="+j); //i의 값은 6, j의 값은 6로 출력됨.
						
					}
				}
			}
		}

	}

}
