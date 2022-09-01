package ex3;

public class Ex3_9 {

	public static void main(String[] args) {
		int a = 1_000_000;
		int b = 2_000_000;
		
		/*long q = 1_000_000;
		long w = 2_000_000;
		long z = q*w;*/
		
		long c = a*b; 
		long y = (long) a*b; 
		
		System.out.println(c);
		System.out.println(y);
		
		// 그냥 원리만 간단하게 알아도 될 거 같아요.
		// (long) 가 의미하는 건
		// a*b 의 값을 long 타입으로 바꾸고, y에 대입해라. 라는 거에요
		// c 같은 경우는 a*b 의 값을 그냥 넣어버렸죠? 그래서 결과에 문제가 생긴거ㄲ
		// 이해 되셨어요?넹넹!!! 값은 크게 중요하지 않은거같아서,,!!
		// 알고리즘 문제 풀어서 대기업 갈거면 사실 중요할 수도 있는데
		// 그거 아니고, 일단 공부가 먼저면? 다 배우고 나중에 알고리즘 공부하면 되니가 ?
		//넹넹!!ㅎㅎㅎ 그러면
	}

}
