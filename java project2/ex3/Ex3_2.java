package ex3;
public class Ex3_2 {
	public static void main(String[] args) {
		int i = 5, j=0;
		
		// 처음 상태
		// i = 5 ; j = 0;
		j=i++; // 그러면 i++ 이면 j한테 먼저주고 i를 증가시킨다죠? <-- 여기서 값 대입 끝
		// 여기든 
		System.out.println(i); // 여기든
		System.out.println(j); // 여기든
		// 여기든
		// 여기든
		
		
		// 위에서는 j한테 먼저주고 i를 증가해!
		i=5;
		j=0;
		
		// j한테 주기전에 i를 증가시키고 j한테 줘! 
		j=++i; 
		System.out.println(i);
		System.out.println(j);
	}
}