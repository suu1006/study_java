package hello;

public class Day13 {

	public static void main(String[] args) {
		Student student1 = new Student("코뮤", 100, 80, 70);
		Student student2 = new Student("김변수", 100,90,80); //객체생성
		
		System.out.printf("코뮤의 평균 점수 : %f\n", student1.getAverage()  );
		System.out.printf("김변수의 평균 점수 : %f\n" , student2.getAverage()); //출력문
	}
}
class Student {
	String name; //사용할 변수!
	float a,b,c;
	
	public Student (String name, float a, float b, float c){ //메서드
		this.name = name;
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public float getAverage () {
		return (float)(a+b+c)/3;
	}
}