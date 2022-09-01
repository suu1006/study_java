package ex7;

public class Test {

	public static void main(String[] args) {
		// 우리의 친구 상민이가 있어요
		// 상민이는 군인이예요
		// 근데 파병을 갔다가 눈을 다쳣어요
		// 그래서 상민이는 장애를 가지게 되었어요
		// 병원을 가서 치료를 잘받고 괜찮아짐
		// 또 다친상민이가 됨
		Disabled 다친상민이 = new Disabled("상민이", "눈이 불편");
		다친상민이.진단서();
		Person 상민이 = null;
		상민이 = 다친상민이; // 치료를 잘받아서 다 괜찮아졌어요
		상민이.자기소개();
		
		Disabled 또다친상민이 = null;
		또다친상민이 = (Disabled) 상민이;
		또다친상민이.진단서();
		
		
	}

}

class Person{
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public void 자기소개() {
		System.out.println("저는 " + name + "입니다.");
	}
}

class Disabled extends Person{
	private String 장애내용;
	
	public Disabled(String name, String 장애내용) {
		super(name);
		this.장애내용 = 장애내용;
	}
	
	public void 진단서() {
		System.out.println("저는 " + 장애내용 + "을 가지고 있습니다.");
	}
}