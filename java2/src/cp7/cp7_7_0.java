package cp7;

public class cp7_7_0 {

	public static void main(String[] args) {
		
		Person per = new Student("ȫ�浿");
		
		Student stu = (Student)per; //�ڼ�->���� �ٿ�ĳ����(����� Ÿ�Ժ�ȯ)
		
		stu.name = "�谡��";
		stu.check = "Ȯ�ο�";
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
