package ex3;

public class Ex3_8 {

	public static void main(String[] args) {
		byte a = 10;
		byte b = 30;
		byte c = (byte)(a*b);
		int z = (int) a*b;
		System.out.println(z);
		
		System.out.println(c); 
		// 1byte = 8bits
		// 일단 개념은 2의 8승이거든요 ? 2의 8승하면 256 이 나오는거
		// 표현할 수 있는 범위가 -127 ~ 128 ? 더하면 256인가 나올거에요 아마도?
		// 올바른 값이 아닌 거 같아서 여쭤봤어용 <<
		// 그냥 요약해서 말씀드리면?
		// byte 가 표현할 수 있는 수의 범위를 넘어섰을 경우에
		// 정상적인 값이 나오지 않는다.
		// 그래서 우리가 원하는 값을 얻으려면 byte 보다 큰 자료형을 선택해야 원하는 값을 얻을 수 있다.
		// 사실 <<<< 중요한 게 아니라서
		// 저는 크게 의미없는 거 같은데 정말 궁금하시면 나중에 같이 풀어봐요 좋아여!!ㅎㅎ 그러면 저거만 외울게여!
		// 네! 저희가 프로그래밍 하면서 8비트니까 몇승이고 표현범위가 어떻게 되서
		// 음... 유실되면 이렇게 나오니까 <<< 이런거 생각안하려고 만든게 언어니까 ? 넹넨ㅇ!! 그러면
	}

}
