package hello;
import java .util.Scanner;
public class Day6 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in); 
//		//��ĳ�ʴ� java.util �̶�� ��Ű���� ���ԵǾ� �ִ� Ŭ����
//		System.out.print("�̸��� �Է��ϼ���");
//		String name = sc.next();
//		System.out.println("����� �̸��� " + name + "�̱���");
//		sc.close(); //�� �ݾ��־����.

Scanner sc = new Scanner(System.in); 
System.out.print("�ܾ �Է��ϼ���: ");
String a = sc.next();

System.out.print("������ �Է��ϼ���: ");
int b = sc.nextInt();

System.out.print("�Ǽ��� �Է��ϼ���: ");
float c = sc.nextFloat();

System.out.print("������ �Է��ϼ���: ");
sc.nextLine(); //float �޼��忡�� ���Ͱ��� �ν��ؼ� �����߻�.>> nextLine�ѹ� �� ���ֱ�
String d = sc.nextLine();


System.out.println("�Է��� �͵��� ��ƺ����?"); 
System.out.printf("�ܾ�� %s / ������ %d / �Ǽ��� %f / ������ '%s'" , a , b , c ,d);

sc.close(); 
	}
}