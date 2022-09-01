package study2;

public class Student1_1 extends People1_1 {
	public int studentNo;
	
	public Student1_1 (String name, String ssn, int studentNo) {
		super(name, ssn); //반드시 첫 줄에 위치해야함.
		//부모 클래스에 기본생성자가 없고 매개변수가 있는 생성자만 있다면
		//자식 생성자에서 반드시 부모 생성자 호출을 위해 super을 명시적으로 호출해야함.
		//name과 ssn은 다시 부모 생성자를 호출하기 위해 매개값으로 넘겨줌.
		
		this.studentNo = studentNo;
	 

	}

}
