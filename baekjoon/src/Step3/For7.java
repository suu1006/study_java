package Step3;

public class For7 {

	public static void main(String[] args) {
		int num01 = 7;
		int num02 = 7;
		int result01, result02;  
		 
		result01 = (++num01) - 5;
		result02 = (num02++) - 5;  
		//num02+1;
	System.out.printf("전위 증가 연산자에 의한 결괏값은 %d이고, 변수의 값은 %d로 변했습니다.\n", result01, num01);
	System.out.printf("후위 증가 연산자에 의한 결괏값은 %d이고, 변수의 값은 %d로 변했습니다.\n", result02, num02);
	}
}