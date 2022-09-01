package study;

public class Day14_7 {

	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		//참조변수 t1과 t2는 모두 Tv클래스의 집 주소를 참조합니다. 하지만 t1과 t2는 저장된 집주소의 값이 같을 뿐, 이 둘의 실제 저장된 메모리 주소는 다릅니다.
		
		System.out.println("t1의 channel 값은"+ t1.channel+"입니다.");
		System.out.println("t2의 channel 값은"+ t2.channel+"입니다.");
	    // t1과 t2 의 채널값을 호출해서 출력해줍니다. 이때 class Tv의 속성(변수)들은 선언만 해줬기 때문에 기본값들이 저장되어 있는 상태입니다. 따라서 t1.channel = 0; t2.channel = 0이 출력됩니다.
		
	    t1.channel = 7;
	    System.out.println("t1의 channel값은 7로 변경하였습니다.");
	    System.out.println("t1의 channel 값은"+ t1.channel+"입니다.");
		System.out.println("t2의 channel 값은"+ t2.channel+"입니다.");
		// 위 두개의 출력문을 실행시키면 t1.channel = 7; t2.channel = 0이 나오게 됩니다. 두 값이 다른 이유는 t1과 t2는 같은 Tv클래스를 참조하지만 t1과 t2는 서로 다른 메모리 주소에 저장되어 있기 때문에 서로에게 영향을 주지 않습니다.
	}
}
	class Tv {
		String color;
		boolean power;
		int channel;
		
		void power() {power = !power;}
		void channelUp() { ++channel;}
		void channelDown() { --channel;}
	}
