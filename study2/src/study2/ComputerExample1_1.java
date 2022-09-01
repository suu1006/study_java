package study2;

public class ComputerExample1_1 {

	public static void main(String[] args) {
		int r = 10;
		
		Calculator1_6 calculator = new Calculator1_6();
		System.out.println("원면적 : " + calculator.areaCircle(r) );
		System.out.println();
		
		Computer1_1 computer = new Computer1_1();
		System.out.println("원면적 : " + computer.areaCircle(r));
	}
}