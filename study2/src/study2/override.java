package study2;


class MyPoint {
	int x;
	int y;
	
	String getLocation() {
		return " X : " + x + " , y :" + y;
	}
}

class MyPoint3D extends MyPoint {
	int z;
	String getLocation() {
		return " X : " + x + " , y :" + y + ", z : " + z;
	
}
public class override {

	public void main(String[] args) {
		MyPoint3D a = new MyPoint3D();
		a.x = 3;
		a.y = 5;
		a.z = 4;
		System.out.println(a.getLocation());
		}
	}
}

