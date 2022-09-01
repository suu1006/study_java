package study;

public class DAy17_1 {

	public static void main(String[] args) {
		Apple example = new Apple();
		//클래스 Example 집주소를 참고하는 객체 example 생성. 
		//객체 example이 클래스 Example의 집주소를 찾아가서 메서드를 호출, 활용할 수 있음.
		
		example.method1(); //값을 입력받지 않는 void메소드. 
		System.out.println();
		
		example.method2(5); //method2의 매개변수 int x 에 5의 값을 넣어줌.
		int x = 5;
		System.out.println(); //void메소드이기때문에 실행시킨 값을 반환하지는 않음.
		
		example.method3(); //method3은 10을 반환해주는 메소드
		System.out.println(); //10을 반환하기 때문에 더하거나 활용가능
		
		example.method4(3,5); //매개변수 a,b에 각자 3, 5의 값을 넣어줌. int a = 3; int b=5;
		System.out.println();
		
		example.method5(1,2);
		System.out.println(); //void메소드 반환해주는 값이 없기때문에 실행결과만 보여줄 뿐, 반환값 없음.
	}
}
class EXample13 {
	void method1() {
		//method1()에서 괄호 안에 들어가는 값을 매개변수라고 함. 매개변수를 이용해서 메소드의 기능 사용가능.
		//method1(int a, int b){return a+b;}이런식으로 매개변수 활용해줌.
		System.out.println("method1이 실행됩니다.");
	} 	//return값이 없을 경우 void로 작성.
	void method2(int x) { //int x 는 매개변수. 
		System.out.println(x+"를 이용하는 method2입니다.");
		}
		// 정수 int x를 받아들인 후, 리턴하지 않는 메소드.
		// 받아들이는 값(매개변수)가 어떤 타입이라도 상관없고, 받아들이는 매개변수는 여러 개 일수도 있음.
		//여러개일경우 콤마(,)로 구분.
	int method3() { //괄호 안이 비어있습니다. 매개변수를 받아들이지 않고, return값을 이용해 정수값을 반환하는 메소드.
	System.out.println("method3이 실행됩니다.");
	return 10;
	}
	//메소드 이름앞에 리턴 타입 적어주기
	//리턴 타입은 하나만 사용가능.
	int method4 (int a, int b) {
		System.out.println("a와 b의 값을 더해주는 메소드(함수)입니다.");
		return a+b; //a와 b의 값을 더해주고 그 값을 반환해줍니다.
		}
	void method5 (int a, int b) {
		System.out.println(a+","+b+"를 보여주는 메소드입니다.");
	}
	}