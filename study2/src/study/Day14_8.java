package study;

public class Day14_8 {

	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		System.out.println("t1의 channel 값은"+t1.channel + "입니다.");
		System.out.println("t2의 channel 값은"+t2.channel + "입니다.");
		
		t2 = t1;
		/*
		 * 이 전 코드에서는 참조변수 t1과 t2는 같은 Tv클래스를 참조하지만, 
		 * 실제 t1과 t2가 저장된 공간은 다르다고 얘기했습니다. 여기선 t1이 저장되어있는 주소 값을 t2에 대입해줍니다.
		 * 그렇게 되면  t1과 t2에 저장되어있는 속성(변수)의 상태가 같은 상태가 됩니다.
		 * ( t1의 집주소를 t2에 넣어주기 때문에 t1과 t2에는 같은 집주소, 즉 같은 상태가 저장됩니다.)
		 */
	    t1.channel = 7;
	    
		System.out.println("t1의 channel 값은"+t1.channel + "입니다.");
		System.out.println("t2의 channel 값은"+t2.channel + "입니다.");
		/*
		 * t1.channel 과 t2.channel 의 값이 똑같이 7이 나오는것을 확인 할 수 있습니다. 
		 * 왜냐하면 t2 = t1으로 인해 t1의 집주소가 t2에 대입되어 같은 집주소(상태)를 나타내기 때문입니다.
		 */
	}
}
class Tv {
	String color;
	boolean power;
	int channel;
	
	void power() { power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
	
}