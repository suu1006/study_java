package com.js.oprator;

public class CompareOperatorTest {
	public static void main(String[] args) {
		int number01 = 10;
		int number02 = 20;

		boolean compareResult01 = (number01 == number02); // ������?
		boolean compareResult02 = (number01 != number02); // �ٸ���?
		boolean compareResult03 = (number01 > number02); // �ǿ���� 1�� �� ū��?(�ǹ����� �� ������� ����)
		boolean compareResult04 = (number01 < number02); // �ǿ���� 1�� �� ������?(�ǹ����� �� ������� ����)
		boolean compareResult05 = (number01 >= number02); // �ǿ����1�� ũ�ų� ������?
		boolean compareResult06 = (number01 <= number02); // �ǿ����1�� �۰ų� ������?
		
		System.out.println("compareResult01 == value is [" + compareResult01 + "]" );
		System.out.println("compareResult02 != value is [" + compareResult02 + "]" );
		System.out.println("compareResult01 > value is [" + compareResult03 + "]" );
		System.out.println("compareResult01 < value is [" + compareResult04 + "]" );
		System.out.println("compareResult01 >= value is [" + compareResult05 + "]" );
		System.out.println("compareResult01 <= value is [" + compareResult06 + "]" );
	}
}