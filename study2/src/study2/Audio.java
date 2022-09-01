package study2;

public class Audio implements RemoteControl {
	
	private int volume;
	
	public void turnOn() {
		System.out.println("Audio¸¦ ÄÕ´Ï´Ù.");
	}
	
	public void turnOff() {
		System.out.println("Audio¸¦ ²ü´Ï´Ù.");
	}
	
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else 
		}
	}

}
