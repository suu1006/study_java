package study;

public class Day7 {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.x=10;
		calculator.y=20;
		
		calculator.printResult();
	}
}
class Calculator{
	int x;
	int y;
	 
	public void printResult() {
		System.out.printf("%d + %d = %d\n",x,y,x+y);
		System.out.printf("%d - %d = %d\n",x,y,x-y);
		System.out.printf("%d * %d = %d\n",x,y,x*y);
		System.out.printf("%d / %d = %d\n",x,y,x/y);
	}
	 int sum() {
		 return x+y;
	 }
	 int sub() {
		 return x-y;
	 }
	 int mul() {
		 return x*y;
	 }
	 int div() {
		 return x/y;
	 }
}