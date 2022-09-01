package ex7;

class CustomTime {
	protected int hour; //0~23 ������ ���� ��������.  << �װ� �� �ּ��� �ǹ̿���
	private int minute; // �ùٸ� ���� �����ް�, �ð��� �������� ��� ���� �־������? 
	
	private int second;
	protected int acc;
	
	
	public void setHour(int hour) { //�޼��� ����.
		 if(isNotValidHour(hour)) {
			 return; 
		 }
		  
		this.hour = hour; 
	}
	public void changeHour(int hour) {
		
		this.hour = hour;
		
	}
	
	 private boolean isNotValidHour(int hour) { 
		 return hour <0 || hour >23;
		 }				
	public int getHour() {return hour;}
	
	public void setAcc(int acc) {
		this.acc = acc;
	}
	public int getAcc() {
		return this.acc;
	}
}

public class Ex7_02{
	public static void main(String[] args) {
		CustomTime t = new CustomTime();
		t.setHour(21); // hour�� ���� 21�� ����
		System.out.println(t.getHour());
		
		t.setHour(100); // 100�� ��ȿ�� ���� �ƴ�.
		System.out.println(t.getHour());
		
		t.acc = 5555;
		
		t.hour = 20;
		
		CustomTime tt = new CustomTime();
		tt.acc = 5555;
		tt.setAcc(55555);
	}
	
}
