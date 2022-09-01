package com.js.oprator;

public class CompareOperatorTest {
	public static void main(String[] args) {
		int number01 = 10;
		int number02 = 20;

		boolean compareResult01 = (number01 == number02); // 같은지?
		boolean compareResult02 = (number01 != number02); // 다른지?
		boolean compareResult03 = (number01 > number02); // 피연산수 1이 더 큰지?(실무에서 잘 사용하지 않음)
		boolean compareResult04 = (number01 < number02); // 피연산수 1이 더 적은지?(실무에서 잘 사용하지 않음)
		boolean compareResult05 = (number01 >= number02); // 피연산수1이 크거나 같은지?
		boolean compareResult06 = (number01 <= number02); // 피연산수1이 작거나 같은지?
		
		System.out.println("compareResult01 == value is [" + compareResult01 + "]" );
		System.out.println("compareResult02 != value is [" + compareResult02 + "]" );
		System.out.println("compareResult01 > value is [" + compareResult03 + "]" );
		System.out.println("compareResult01 < value is [" + compareResult04 + "]" );
		System.out.println("compareResult01 >= value is [" + compareResult05 + "]" );
		System.out.println("compareResult01 <= value is [" + compareResult06 + "]" );
	}
}