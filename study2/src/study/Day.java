package study;

import java.util.*;

public class Day {

	public static void main(String[] args) {
	String str = "3";
	
	System.out.println(str.charAt(0) - '0'); //���ڿ��� ���ڷ� ��ȯ �� ���ڷ� ��ȯ('0' ����)
	System.out.println('3'-'0' +1); //���� 3�� ���ڷ� ��ȯ �� +1 ���
	System.out.println(Integer.parseInt("3" +1)); //���ڿ��� ���ڷ� ��ȯ
	System.out.println("3"+1); // ���� 3 �̶� ���� 1�̶� ���!
	System.out.println((char)3+'0'); //����3 + 0�� ���ϸ� ���� 3 ��¤�..
	
	/* 
	 * ���ڸ� ���ڷ� ��ȯ / ���ڿ� '0' ���ϱ� / (char)(3+'0') >> '3'
	 * ���ڸ� ���ڷ� ��ȯ / ���ڿ��� 0���� / '3'-'0' >> 3 ���
	 * ���ڸ� ���ڿ��� ��ȯ / ���ڿ� �� ���ڿ� ���ϱ� /3+"" >> "3"
	 * ���ڿ��� ���ڷ� ��ȯ / Integer.parseInt() �Ǵ� Double.parseInt()
	 * ���ڿ��� ���ڷ� ��ȯ /   
	 */
		
		
		
		
	}
	

}
