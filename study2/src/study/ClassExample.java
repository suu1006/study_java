package study;

public class ClassExample {

	public static void main(String[] args) {
		Student student = new Student(); //Student클래스의 주소를 저장하기 위한 참조변수 student를 선언하고, Student클래스의 주소를 student참조변수에 저장해줍니다.
		
		student.name("홍길동"); // student 참조변수에 저장되어있는 Student클래스의 주소에서, name메소드를 호출, name 메소드의 매개변수 name을 "홍길동"으로 입력을 name메소드가 받습니다.
		
		student.sum(100,90,80); //student참조변수에서 int sum(int kor, int eng, int math) 를 호출합니다. 이때 kor = 100, eng = 90, math = 80 으로 입력을 받습니다.
		
	    student.avg(); //avg의 경우 이미 sum의 값을 3으로 나눠주기 때문에 따로 입력받는 매개변수는 존재하지 않습니다. 클래스의 멤버변수(속성) avg = sum/3으로 다시 초기화를 해주게 되면 점수의 총합인 sum 을 3으로 나누게 됩니다.
	}
}
class Student{
	int sum = 0; // 우리가 흔히 사용하는 변수 선언 방법으로 멤버변수를 선언, 초기화 시켜주었습니다. 멤버변수는 해당 클래스의 모든 메소드에서 사용할 수 있습니다. 
	int avg = 0;
	
	void name(String name) { /*
	 매개변수 name은 이름을 입력받습니다. 
	 예를 들어, 위에서 쓴 student.name("홍길동"); 의 경우, 
	 name(String name) 메소드의 매개변수인 String name = "홍길동"; 으로 매개변수를 받아서 사용한 것입니다.
	 */
		
		System.out.println("학생의 이름:"+name);//결과를 보면 출력문을 보여주기만 할 뿐, 호출한 메소드로 어떠한 결과값을 되돌려지는 않습니다.
		
	}
	
	int sum(int kor, int eng, int math) { // 3개의 정수형 매개변수 kor, eng, math를 입력받고, 입력받은 값을 모두 더한 값을 호출한 메소드에 반환해주는 return메소드입니다.
		
		sum = kor + eng + math; // Student클래스의 매개변수 sum을 해당 메소드에서 사용하였습니다. 이렇게 클래스의 멤버변수(속성)는 모든 메소드에서 사용할 수 있어요.
		System.out.println("합계는"+sum+"점 입니다.");//3개의 값을 더한 sum을 출력해주는 출력문입니다.
		return sum; /*
		 정수형 메소드는 정수형 값을 호출한 메소드로 반환해줍니다. 
		 따라서 위의 student.sum(100,90,80);처럼 메소드를 호출했으니, sum = 100+90+80으로 값을 받아주고 그 다음 코드 => System.out.println("합계는"+sum);을 실행시켜줍니다. 
		 
		 
		 */
		
		
	}
	int avg() {
		avg = sum / 3; /*sum = kor + eng + math;이며, 이러한 sum을 3으로 나눈 몫을 avg에 저장합니다. 
		만약 우리가 Student클래스의 멤버변수를 선언해주지 않았다면, avg는 avg = (kor+eng+math) / 3;이라는 번거로운 식을 다 써줘야 합니다.
		이렇게 쓰는것과, avg = sum/3;을 비교해보면, 후자의 경우가 이해하기도 쉽고, 작성자 입장에서도 코드를 작성하기가 수월합니다.
		*/
		
		
		System.out.println("평균 점수는"+avg+"점 입니다."); //평균값 avg를 출력문으로 출력해줍니다.
		return avg; // student.avg();로 값을 다시 되돌려줍니다. 
	}
	
}