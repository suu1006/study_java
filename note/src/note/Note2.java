package note;

public class Note2 {

	public static void main(String[] args) {
		MyMath mm = new MyMath(); // 객체생성 MyMath
		
		long result1 = mm.add(5L, 3L); //메서드 호출해서 result1에 저장!
		long result2 = mm.substract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);
		
		System.out.println("add(5L,3L) =" + result1 ); //저장한거 출력!
		System.out.println("substract(5L,3L) =" + result2 );
		System.out.println("multiply(5L,3L) =" + result3 );
		System.out.println("divide(5L,3L) =" + result4 );
		
	}
}		
class MyMath { //MyMath의 설계도!
	long add (long a, long b) {//사용할 덧셈,뺄셈, 곱셈, 나눗셈 메서드 만들기 (매개변수 이용) 
		long result = a+b;
		return result;
		//return = a+b;
	}
	long substract (long a, long b) {return a-b;} 
	long multiply (long a, long b) {return a*b;}
	double divide (double a, double b) {return a/b;}
	}
	