package Step3;

public class For7 {

	public static void main(String[] args) {
		int num01 = 7;
		int num02 = 7;
		int result01, result02;  
		 
		result01 = (++num01) - 5;
		result02 = (num02++) - 5;  
		//num02+1;
	System.out.printf("���� ���� �����ڿ� ���� �ᱣ���� %d�̰�, ������ ���� %d�� ���߽��ϴ�.\n", result01, num01);
	System.out.printf("���� ���� �����ڿ� ���� �ᱣ���� %d�̰�, ������ ���� %d�� ���߽��ϴ�.\n", result02, num02);
	}
}