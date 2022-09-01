package com.js.oprator;
//개발은 개발 : 테스트 = 1:1 무슨 프로그램이던지 꼭 확인하기!
public class LogicOperatorTest {

	public static void main(String[] args) {
		boolean isOnTv = true;
		boolean isOnRadio = false;

		if (isOnTv && isOnRadio) { //앞의 피연산자를 검사하여 false면 뒤에 연산자를 
			//검사하지 않습니다. 효율적이므로 실무에서 이것을 많이 씁니다.
			System.out.println("AND(&&) is true.. isOnTv isOnRadio ");
			System.out.println("isOnTv value is " + isOnTv);
			System.out.println("isOnRadio value is " + isOnRadio);
		} else {
			System.out.println("AND(&&) the others case..");
			System.out.println("isOnTv value is " + isOnTv);
			System.out.println("isOnRadio value is " + isOnRadio);
		}

		System.out.println("==============================");
		
		if(isOnTv & isOnRadio) {
			System.out.println("AND(&&) is true.. isOnTv isOnRadio ");
			System.out.println("isOnTv value is " + isOnTv);
			System.out.println("isOnRadio value is " + isOnRadio);
		} else {
			System.out.println("AND(&&) the others case..");
			System.out.println("isOnTv value is " + isOnTv);
			System.out.println("isOnRadio value is " + isOnRadio);
		}
	}

}
