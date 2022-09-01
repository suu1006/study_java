package study;

public class Day14_5 {

	public static void main(String[] args) {
		int [] arr = new int[5];
		arr [0] = 10;
		arr [1] = 20;
		arr [2] = 30;
		arr [3] = 40;
		arr [4] = 50;
		
		int sum = 0; 
		
		for(int i=0; i<arr.length; i++) {
		 sum += arr[i]; // for문 안에 변수를 선언해주고 사용하게되면, 그 변수는 for문이 종료됨과 동시에 사라진다. 변수의 메모리 값이 사라지기때문에 for문 중괄호{} 밖에서 사용할 수 없다.
		}
		
		System.out.println("sum = " +sum);
	}
}