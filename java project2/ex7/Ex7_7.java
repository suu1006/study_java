package ex7;

public class Ex7_7 {

	public static void main(String[] args) {
		Car car = null;
//		FireEngine fe = new FireEngine();  // ���� �ν��Ͻ��� ���������� �߿�.
		
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		//FireEngine fe2 = (FireEngine)car; ���� -> �ڼ����� ����ȯ
		//Car car2 = (Car)fe2; �ڼ� -> ���� ���� ����ȯ 
		
		fe.water(); //ȣ�� ����
		car =fe; //����ȯ ���� ��밡���ϴٴ� ���� �˷��ֱ� ���� ���
		//car = water(); �Ұ���. car�� water() ���Ұ�. car�� ���ǵ� �� 4��.
		fe2 = (FireEngine)car; //���� 4�� -> �ڼ� 5���� ��ȯ (�����ϱ� ����X- �����Ұ�) 
		fe2.water(); 
		
	}
}

class Car {
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, Brrr~");
	}
	void stop() {
		System.out.println("stop!!!");
	}
}
class FireEngine extends Car {
	void water() {
		System.out.println("water!!!");
	}
}
