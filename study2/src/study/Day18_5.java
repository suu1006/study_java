package study;

public class Day18_5 {

	public static void main(String[] args) {
		
		System.out.println(Distance.getDistance(1,1,2,2)); //static �޼��� >> Ŭ������.�޼ҵ�� (�Ű����� �Է�)
	}
}

class Distance {
	
	static double getDistance(int x, int y, int x1, int y1) {
		
	 double result1 = (x1-x)*(x1-x);
	 double result2 = (y1-y)*(y1-y);
	
	double result3 = Math.sqrt(result1 + result2);
	 return result3;
	 
	}
}
