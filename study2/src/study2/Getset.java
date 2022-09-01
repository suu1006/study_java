package study2;
//메소드를 통해서 데이터를 변경하는 방법을 선호한다.데이터는 외부에서 접근할 수 없도록 막고
//메소드를 공개해서 외부에서 데이터를 접근하게 하는 방법이다. 
//setter 값을 저장(셋팅)하게 유도하는 메소드
// getter 값을 return 받게 해주는 메소드
class Car50 {
	private int speed;
	private boolean stop;
	
	public int getSpeed() { // get 가져오는 것 / return 사용 / 변수값 반환 
		return speed;
	}
	public void setSpeed(int speed) { // 지정하는 것 / 인자를 받아야함
		if(speed<0) {
			this.speed = 0;
			return;
		}
		else {
			this.speed = speed;
		}
	}
	public boolean getIsStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
	
class CarExample{
	public void aa () {
		Car50 c = new Car50();
		c.setSpeed(100);
	}
}
}