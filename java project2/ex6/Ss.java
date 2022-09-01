package ex6;

public class Ss {

	public static void main(String[] args) {
		Data3 d = new Data3();
		d.x = 10;

		Data3 d2 = copy(d);//여기로 주소값가지고 옴.
		System.out.println("d.x = " + d.x);
		System.out.println("d2.x = " + d2.x);
		System.out.println(d);
		System.out.println(d2);
	}
	static Data3 copy(Data3 d) {
		Data3 tmp = new Data3();
		tmp.x = d.x;
		return tmp; //객체의 주소를 반환한다. 주소값 가지고 호출된 곳으로 가는거!
	}
}