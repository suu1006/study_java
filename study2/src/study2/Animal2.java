package study2;

public class Animal2 {
	public static void main (String [] args) {
		Cat c = new Cat();
		Dog10 d = new Dog10();
		
		c.cry();
		d.cry();
	}
}

interface Animal10 { // 汲拌档
	public abstract void cry();
}

class Cat implements Animal10 {
	public void cry() {
		System.out.println("衬克衬克");
	}
}

class Dog10 implements Animal10 {
	public void cry() {
		System.out.println("港港!");
	}
}

