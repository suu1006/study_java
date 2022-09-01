package ex3;

public class Ex3_3 {

	public static void main(String[] args) {
		int i = 5, j=5;
		System.out.println(i++); //대입하고 증가 (증가는 결과에 안들어감)
		//여기서 i6
		System.out.println(++j); //(증가하고 대입)
		System.out.println("i= "+ i +", j = " + j); // 핵심은 연산은 여기에 없다!
		
		
		String a = "나는";
		String b = "자바가 싫어..";
		System.out.println("나는" + a + "정말" + b + "싫어");

	}
}