package study2;

public class Car5_5 {

		private int speed;
		private boolean stop;
		
		public int getSpeed() {
			return speed;
		}
		public void setSpeed(int speed) {
			if(speed < 0) {
				this.speed = 0; 
				return; //속도가 음수일때 0으로 저장 후 메소드 실행 종료
			} else {
				this.speed = speed; //나머지 속도 저장
			}
		}
		public boolean isStop() {
			return stop;
		}
		public void setStop(boolean stop) {
			this.stop = stop;
			this.speed = 0;
		}
	}
