package ex4;

import java.util.Scanner;

public class Ex4_20 {

	public static void main(String[] args) {
		int menu = 0, num = 0;
		Scanner scanner = new Scanner(System.in);
		
		outer:
			while(true) { //while�� true�� �����ϸ� ������ �ݺ��ϴ� ���� ������ �������. ���ǽ��� �׻� ���̹Ƿ� ��ȭ�ĵ� �ʿ�X.
				System.out.println("(1)square");
				System.out.println("(2)square root");
				System.out.println("(3)log");
				System.out.println("���ϴ� �޴�(1~3)�� �����ϼ���.(����:0)");
				
				String tmp = scanner.nextLine();
				menu = Integer.parseInt(tmp);
				
				if(menu==0) {
					System.out.println("���α׷��� �����մϴ�.");
					break;
				} else if (!(1<=menu && menu<=3)) {
					System.out.println("�޴��� �߸� �����ϼ̽��ϴ�.(����� 0)");
					continue;
				}
				
				for(;;) {
					System.out.print("����� ���� �Է��ϼ���.(��� ���� :0, ��ü ���� :99)");
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