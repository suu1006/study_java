package study2;

public class RDay1_1 {
	int channel ;
	
	DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	void turnOnDmb() {
		System.out.println("ä��" + channel + "�� ������� �����մϴ�.");
	}
	void changeChannelDmb (int channel)  {
		this.channel = channel;
		System.out.println("ä����" + channel + "������ �ٲߴϴ�.");
	}
	void turnOffDmb() {
		System.out.println("DMb�� �����մϴ�.");
	}
}
