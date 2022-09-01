import java.util.*;

public class ScanfEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner numScanner = new Scanner(System.in);
		
//		int num = numScanner.nextInt();
//		int num2 = numScanner.nextInt();
//
//		System.out.println(num);
//		System.out.println(num2);
		String input = numScanner.nextLine();
		int num = Integer.parseInt(input);
		System.out.println(num);
		numScanner.close();
		
		System.out.println();

	}

}
