package cp7;

public class cp7_7_0 {

	public static void main(String[] args) {
		
		Person per = new Student("홍길동");
		
		Student stu = (Student)per; //자손->조상 다운캐스팅(명시적 타입변환)
		
		stu.name = "김가나";
		stu.check = "확인용";
}
}
class Person {
	String name;
	Person (String name) {
		this.name = name;
	}
}

class Student extends Person {
	String check;
	Student(String name) {
		super(name);
	}
}
