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
				return; //�ӵ��� �����϶� 0���� ���� �� �޼ҵ� ���� ����
			} else {
				this.speed = speed; //������ �ӵ� ����
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
