package study2;

public class Student1 extends People1 {
	public int studentNo;
	
	public Student1(String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNo = studentNo;
	}   
}