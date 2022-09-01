package ex4;

import java.util.Scanner;

public class Ex4_20 {

	public static void main(String[] args) {
		int menu = 0, num = 0;
		Scanner scanner = new Scanner(System.in);
		
		outer:
			while(true) { //while에 true를 지정하면 무한히 반복하는 무한 루프가 만들어짐. 조건식이 항상 참이므로 변화식도 필요X.
				System.out.println("(1)square");
				System.out.println("(2)square root");
				System.out.println("(3)log");
				System.out.println("원하는 메뉴(1~3)를 선택하세요.(종료:0)");
				
				String tmp = scanner.nextLine();
				menu = Integer.parseInt(tmp);
				
				if(menu==0) {
					System.out.println("프로그램을 종료합니다.");
					break;
				} else if (!(1<=menu && menu<=3)) {
					System.out.println("메뉴를 잘못 선택하셨습니다.(종료는 0)");
					continue;
				}
				
				for(;;) {
					System.out.print("계산할 값을 입력하세요.(계산 종료 :0, 전체 종료 :99)");
					tmp : scanner.nextLine();
					num : Integer.parseInt(tmp);
					
					if(num==0)
						break;
					if(num==99)
						break outer;
					switch(menu) {
					case 1 : System.out.println("result ="+ num*num);
					break;
					case 2 : System.out.println("result ="+ Math.sqrt(num));
					break;
					case 3 : System.out.println("result ="+ Math.log(num));
					}
				}
			}
	}

}
