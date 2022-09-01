package ex7;

class CustomTime {
	protected int hour; //0~23 사이의 값을 가져야함.  << 그게 이 주석의 의미에요
	private int minute; // 올바른 값을 검증받고, 시간을 넣으려면 어떻게 값을 넣어야하죵? 
	
	private int second;
	protected int acc;
	
	
	public void setHour(int hour) { //메서드 제공.
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
		t.setHour(21); // hour의 값을 21로 변경
		System.out.println(t.getHour());
		
		t.setHour(100); // 100은 유효한 값이 아님.
		System.out.println(t.getHour());
		
		t.acc = 5555;
		
		t.hour = 20;
		
		CustomTime tt = new CustomTime();
		tt.acc = 5555;
		tt.setAcc(55555);
	}
	
}
