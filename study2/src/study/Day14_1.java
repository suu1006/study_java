package study;

public class Day14_1 {

	public static void main(String[] args) {
		
		//next() >> �����̽� �� ���� ������ �Է¹��� ���ڿ��� ����
		//nextLine() >> Enter ġ�� ������ �� ���ڿ��� ��� ����
		
		char ch = ' ';
		
		switch(ch) {
		case 'a' :
		case 'e' :
		case 'i' :
		case 'o' :
		case 'u' :
			System.out.println("�ش� ���ڴ� �ҹ��� �����Դϴ�.");
			break;
		case 'A' :
		case 'E' :
		case 'I' :
		case 'O' :
		case 'U' :
			System.out.println("�ش� ���ڴ� �빮�� �����Դϴ�.");
			break;
		default : 
			System.out.println("�ش� ���ڴ� ������ �ƴմϴ�.");
			break;
		}
	}
}