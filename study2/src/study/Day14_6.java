package study;

public class Day14_6 {

	public static void main(String[] args) {
		Tv t; // Tv인스턴스(객체) 를 참조하기 위한 참조변수 t를 선언해주었습니다.
		t = new Tv(); // Tv의 집주소를 t참조변수에 넣어줍니다.
		t.channel = 7; //참조변수.속성를 이용하여 Tv클래스의 속성을 7로 입력해줍니다. 그럼 참조변수 t의 channel = 7이 저장됩니다.
		t.channelDown(); //참조변수.메소드 를 이용하여 Tv클래스의 channelDown메소드를 호출합니다. 일반적인 메소드는 return문을 이용하여 호출된 메소드로 값을 반환하지만 channelDown메소드는 반환값이 없는 void 메소드 입니다. 따라서 클래스의 속성을 변경만 시켜줄뿐 따로 값을 호출한 메소드로 출력하지 않는것을 알수 있습니다.
		System.out.println("현재 채널은"+t.channel + "입니다.");
		}
	}
	class Tv {
		String color;
		boolean power;
		int channel;
		//객체의 속성은 클래스에서 사용하는 변수를 의미합니다. 우리가 흔히 메인클래스에서 식을 작성할때 선언, 초기화 해주는 변수들도 메인클래스에서 사용되는 속성입니다.
		
		void power() { power = !power;}
		void channelUp() { ++channel;}
		void channelDown() { --channel;}
		//메소드(함수)입니다. 메소드는 기능을 의미하고, 전원을 켜고 끄는 행위, 또는 볼륨, 채널을 바꾸는 행위 등을 메소드로 구현합니다. 
		//해당 메소드는 반환값이 없은 void메소드 입니다. 반환해주는 값은 없지만, channelUp같은 경우는 채널의 값을 증가시켜주는 행위를 합니다. void메소드는 다음 수업때 보도록 하겠습니다. 
	}