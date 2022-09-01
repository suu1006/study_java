
public class Debuger {

	public static void main(String[] args) {
		String id = "JAVA APT 507";
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1);
		
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		Lighting hallLamp = new Lighting(id+"/ Hall Lamp");
		
		

	}

}
