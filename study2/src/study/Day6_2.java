package study;



public class Day6_2 {

	public static void main(String[] args) {
		int a = 0;
		while(a<=100) {
			if(a%3==0 && a%5==0) {
				System.out.println(a);
				
			}
			a++;
		}
	}
}