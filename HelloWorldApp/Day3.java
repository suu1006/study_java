import java.util.Scanner;

public class Day3 {

	public static void main(String[] args) {
		//������ ���� menu�� num �� �ʱ�ȭ�Ѵ�.
		int menu = 0, num = 0;
		// �Է� �ޱ�
		Scanner scanner = new Scanner(System.in);
		//outer�̸��� ���� while ���ѹݺ��� ������ֱ�
		outer :
			while (true) {
				System.out.println("(1)square");
				System.out.println("(2)square root");
				System.out.println("(3)log");
				System.out.println("���ϴ� �޴�(1~3)�� �����ϼ���.(���� : 0)");
				
				// ���ڿ� tmp ������ �Է¹��� ���� ���ڿ��� �ޱ� 
				String tmp = scanner.nextLine(); 
				// ���ڿ� tmp�� ���������� ��ȯ ��, �޴� ������ �ֱ�
				menu = Integer.parseInt(tmp);
				
				// �޴��� 0�̶�� ���α׷� �����ϱ�
				if(menu==0) {
					System.out.println("���α׷��� �����մϴ�.");
					break;
					// �޴��� 1~3�� �ƴ϶�� �޴��߸� �����ߴٴ� ������ �Բ� ��� ���� ����
				} else if(!(1 <= menu && 3 <=menu)) {
					System.out.println("�޴��� �߸� �����ϼ̽��ϴ�. ����� 0.");
					continue;
				}
				// for ���ѹݺ��� �����
					for(;;) { 
						
					//����� �� �Է��ϼ���(��� ���� : 0 ��ü ���� : 99) ���� �Է�
					System.out.print("����� ���� �Է��ϼ���.(��� ���� : 0, ��ü ���� : 99)");
					//��ĳ��Ŭ���� �� ���ڿ� �޼ҵ� �� tmp ������ �ֱ�
					tmp = scanner.nextLine();
					//tmp ������ ���������� ��ȯ�Ͽ� num ������ �ֱ�
					num = Integer.parseInt(tmp);
					// if num�� 0�̶�� 
					if (num==0) 
						break;
					//if num�� 99�� outer������ ����������
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
			} //outer�� 
	} //main��
}