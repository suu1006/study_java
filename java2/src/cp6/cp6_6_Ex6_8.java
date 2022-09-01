package cp6;

public class cp6_6_Ex6_8 {

	public static void main(String[] args) {
		Data3 d = new Data3();
		//Data3 의 객체 만들기 (변수 d)
		d.x = 10;
		// d.x값 10 
		
		Data3 d2 = copy(d);
		// copy(d) 메서드 호출해서 d2에 넣기
		System.out.println("d.x = " + d.x);
		// d.x값 출력하기 
		System.out.println("d2.x = " + d2.x);
		// d2.x값 출력하기
	}
		static Data3 copy(Data3 d) {
	// 반환타입 : Data3 /  copy 메서드 매개변수 Data3 d  
		Data3 tmp = new Data3();
		// Data3 객체를 tmp 변수에 대입
		tmp.x = d.x;
		// d.x 값 을 tmp.x 에 복사한다 
		return tmp;
		// tmp  반환하기 (객체의 주소를 반환)
	}
}