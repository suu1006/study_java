package study2;

public class RDay1 {

	public static void main(String[] args) {
		DmbCellPhone dmbCellPhone = new DmbCellPhone("������8", "���", 10);
		
		System.out.println("�� : " + dmbCellPhone.model);
		System.out.println("���� : " + dmbCellPhone.color);
		System.out.println("ä�� : " + dmbCellPhone.channel);
		
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("�ȳ� �ڱ�!");
		dmbCellPhone.receiveVoice("�ȳ��ϼ���. �������ε���");
		dmbCellPhone.sendVoice("�� �� �˼��մϴ�;");
		dmbCellPhone.hangUp();
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.turnOffDmb();
	}
}