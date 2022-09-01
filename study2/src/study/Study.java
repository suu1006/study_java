package study;

public class Study {

	public static void main(String[] args) {
		int sum = 0;
		float avg = 0;
		
		int[] Arr = new int[10];
		for(int i=0; i<Arr.length; i++) {
			Arr[i] = i;
			sum +=Arr[i];
			avg = (float)sum/10;
			System.out.println(Arr[i]);
		
		}
System.out.println(sum);
System.out.println(avg);
	}

}
