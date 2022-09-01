package study2;

public class RDay1 {

	public static void main(String[] args) {
		DmbCellPhone dmbCellPhone = new DmbCellPhone("아이폰8", "흰색", 10);
		
		System.out.println("모델 : " + dmbCellPhone.model);
		System.out.println("색상 : " + dmbCellPhone.color);
		System.out.println("채널 : " + dmbCellPhone.channel);
		
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("안녕 자기!");
		dmbCellPhone.receiveVoice("안녕하세요. 현성안인데요");
		dmbCellPhone.sendVoice("아 예 죄송합니다;");
		dmbCellPhone.hangUp();
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.turnOffDmb();
	}
}