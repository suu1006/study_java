package study2;

public class People1_1 {

	//people 클래스는 기본 생성자가 없고, 
	//name과 ssn을 매개값으로 받아 객체를 생성시키는 생성자만 있음.
	// people을 상속하는 student 클래스는 생성자에서 super(name, ssn)으로 people클래스의 생성자를 호출해야함.
	
		public String name;
		public String ssn;
		
		public People1_1(String name, String ssn) {
			this.name = name;
			this.ssn = ssn;

	}

}
