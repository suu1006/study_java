import java.util.Scanner; // ��ĳ�� Ŭ������ ����ϱ� ���� �߰�

public class Day2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //  Scanner Ŭ������ ��ü ����
		System.out.print("�� �ڸ� ������ �ϳ� �Է����ּ���.>"); 
		String input = scanner.nextLine(); // nextLine() �޼��� ȣ�� ��, �Է��� ��ġ�� ����Ű�� ������ �Է��� ������ ���ڿ��� ��ȯ��.
		int num = Integer.parseInt(input); // �Է¹��� ���ڿ��� ���ڷ� ��ȯ : Integer.parseInt()
		
		System.out.println("�Է³��� :" + input);
		System.out.printf("num = %d%n", num);

	}

}
 // Scanner Ŭ�������� nextInt()�� nextFloat()�� ���� ���ڷ� �ٷ� �Է¹��� �� �ִ� �޼������ ����.