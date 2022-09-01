package hello;

class NumberThread extends Thread{
	public void run() {
		for (int i = 0; i<10; i++) {
			System.out.print(i);
		}
	}
}

class CharThread extends Thread{
	public void run() {
		for (char i = 'a'; i<='z'; i++) {
			System.out.print(i);
		}
	}
}

public class Day15 {

	public static void main(String[] args) {
		Thread thread1 = new NumberThread();
		Thread thread2 = new CharThread();
		
		thread1.start();
		thread2.start();

	}
}