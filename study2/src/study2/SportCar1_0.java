package study2;

public class SportCar1_0 extends Car1_0 {

		@Override
		public void speedUp() {speed += 10;}
		
		@Override
		public void stop() { // ÀçÁ¤ÀÇ ºÒ°¡ÇÔ.
			System.out.println("½ºÆ÷Ã÷Ä«¸¦ ¸ØÃã");
			speed = 0;
		}
	}
}