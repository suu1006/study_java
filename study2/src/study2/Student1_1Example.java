package study2;

public class Student1_1Example {

	public static void main(String[] args) {
		Student1_1 student1_1 = new Student1_1("박정수", "971006-2155010", 1);
		System.out.println("name : " + student1_1.name);// 부모에게 상속받은 필드 출력
		System.out.println("ssn : " + student1_1.ssn);
		System.out.println("studentNo : " + student1_1.studentNo);
	}

}
