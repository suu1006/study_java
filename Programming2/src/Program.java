import opentutorials.iot.Elevator;
import opentutorials.iot.Lighting;
import opentutorials.iot.Security;
public class Program {

	public static void main(String[] args) {
		
		String id = "JAVA ART 507";
		
		//Elevator call
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1);
		
		//Security off
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		//Light on
		Lighting hallLamp = new Lighting(id+" / Hall Lamp");
		hallLamp.on();
		
		Lighting floorLamp = new Lighting(id+" / floorLamp");
		floorLamp.on();

	}

}
