package study2;

public class HouseDog extends Dog {
	public void sleep() { 
		System.out.println(this.name + "zzz in HOuse");
	}
	public void sleep(int hour) {
		System.out.println(this.name + "zzz in house for" + hour + "hours");
	}
	public static void main (String[] args) {
		HouseDog houseDog = new HouseDog();
		houseDog.setName("Happy");
		houseDog.sleep();
		houseDog.sleep(3);
	}
}