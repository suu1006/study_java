import java.util.Scanner;

public class Day3 {

	public static void main(String[] args) {
		//정수형 변수 menu와 num 을 초기화한다.
		int menu = 0, num = 0;
		// 입력 받기
		Scanner scanner = new Scanner(System.in);
		//outer이름을 지어 while 무한반복문 만들어주기
		outer :
			while (true) {
				System.out.println("(1)square");
				System.out.println("(2)square root");
				System.out.println("(3)log");
				System.out.println("원하는 메뉴(1~3)를 선택하세요.(종료 : 0)");
				
				// 문자열 tmp 변수에 입력받은 문자 문자열로 받기 
				String tmp = scanner.nextLine(); 
				// 문자열 tmp를 정수형으로 변환 후, 메뉴 변수에 넣기
				menu = Integer.parseInt(tmp);
				
				// 메뉴가 0이라면 프로그램 종료하기
				if(menu==0) {
					System.out.println("프로그램을 종료합니다.");
					break;
					// 메뉴가 1~3이 아니라면 메뉴잘못 선택했다는 문구와 함께 계속 문항 띄우기
				} else if(!(1 <= menu && 3 <=menu)) {
					System.out.println("메뉴를 잘못 선택하셨습니다. 종료는 0.");
					continue;
				}
				// for 무한반복문 만들기
					for(;;) { 
						
					//계산할 값 입력하세요(계산 종료 : 0 전체 종료 : 99) 문구 입력
					System.out.print("계산할 값을 입력하세요.(계산 종료 : 0, 전체 종료 : 99)");
					//스캐너클래스 안 문자열 메소드 를 tmp 변수에 넣기
					tmp = scanner.nextLine();
					//tmp 변수를 정수형으로 변환하여 num 변수에 넣기
					num = Integer.parseInt(tmp);
					// if num이 0이라면 
					if (num==0) 
						break;
					//if num이 99면 outer밖으로 빠져나가기
					if (num==99)
						break outer;
					//switch 
					switch (menu) {
					case 1 : 
						System.out.println("result = " +  num * num);
					case 2 : 
						System.out.println("result = " + Math.sqrt(num));
					case 3 : 
						System.out.println("result = " + Math.log(num));
						
					}
				} //for(;;) 
			} //outer끝 
	} //main끝
}