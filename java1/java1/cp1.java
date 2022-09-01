package java1;

public class cp1 {

	public static void main(String[] args) {
		Child child = new Child();
		
		child.jenny();

	}

}
class Mother {
	public String blog = "jeongsu";
	public int Period = 3;
	
	public void jenny() {
		System.out.println(blog + "의 블로그는 " + Period + "년이 되었습니다.");
	}
}
class Child extends Mother {
	String blog = "jenny";
	int Period = 10;
	
	public void jenny() {
		super.jenny(); //부모클래스의 메서드 호출
		System.out.println(blog + "의 블로그는 " + Period + "년이 되었습니다.");
		System.out.println(super.blog + "의 블로그입니다." + super.Period + "년이 되었습니다.");
	}
}