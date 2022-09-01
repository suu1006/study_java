package study2;

public class RDay1_1 {
	int channel ;
	
	DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	void turnOnDmb() {
		System.out.println("채널" + channel + "번 방송으로 수신합니다.");
	}
	void changeChannelDmb (int channel)  {
		this.channel = channel;
		System.out.println("채널을" + channel + "번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("DMb를 종료합니다.");
	}
}
