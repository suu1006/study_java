package study2;
//�޼ҵ带 ���ؼ� �����͸� �����ϴ� ����� ��ȣ�Ѵ�.�����ʹ� �ܺο��� ������ �� ������ ����
//�޼ҵ带 �����ؼ� �ܺο��� �����͸� �����ϰ� �ϴ� ����̴�. 
//setter ���� ����(����)�ϰ� �����ϴ� �޼ҵ�
// getter ���� return �ް� ���ִ� �޼ҵ�
class Car50 {
	private int speed;
	private boolean stop;
	
	public int getSpeed() { // get �������� �� / return ��� / ������ ��ȯ 
		return speed;
	}
	public void setSpeed(int speed) { // �����ϴ� �� / ���ڸ� �޾ƾ���
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