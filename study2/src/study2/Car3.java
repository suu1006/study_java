package study2;

public class Car3 {

		String company = "현대자동차";
		String model;
		String color;
		int maxSpeed;
		
		Car3() { //기본생성자
		}
		Car3(String model) { //생성자 오버로딩
			this.model = model;
		}
		Car3(String model, String color) { 
		this.model = model;
		this.color = color;
		}
		Car3(String model, String color, int maxSpeed){
			this.model = model;
			this.color = color;
			this.maxSpeed = maxSpeed;
		}
	}