package ex2_1;

public class Cal2 {
	
	public static void world() {
		System.out.println("world!");
	}
	
	// 애 이름은 my 에요!
	public static void my() {
		System.out.println("hello!");
	}

	// 애 이름은 main 이에요!
	public static void main(String[] args) {
		// 정리 : main 이라는 기준 메소드 안에서 실행한다.
		// main 밖에서 만들면 실행안됨
		// int x,y,z 의 값을 서로 바꾸는 문제
		// temp 를 이용해서? 두 변수의 값을 바꾸려면 임시로 값을 저장해서 바꾸라구 배웠는데,,
		int x = 1;
		int y = 2;
		int z = 3;
		int temp = 0;
		
		temp = x;
		x = y; // 여기서 x = 2 <----- 여기서 X 가 가지고 있던 1이 사라지게 된다. 
 		y = z; // 여기서 y = 3
 		z= temp;
 		
 		System.out.println("temp=" + temp);
 		System.out.println("x=" + x); //이렇게 쓰여있어요! 똑같아요
 		System.out.println("y=" + y);
 		System.out.println("z=" + z);
 		
 		// 1은 x = y 라고 했을 때, y가 들고 있던 값으로 x의 값을 바꿔줬어요!
 		// 그럼 1은 없어졌어요.
 		//제가 그래서,, 바꾸다가 자꾸 값이 사라ㅏ져서,, 
 		// 그럼 1은 x = y 할 떄 사라지죠?
 		// 그럼 x 의 원래 값인 1을 들고 있는 하나의 임시저장소를 만들어야 하지 않을까요?
 		//그게 바로 temp ㅇㅇ
 		//그거 했는데 코드를 쓰는게 원래 길어지나여,,?
 		// 길어진다는 게 무슨 의미에요?
 		//tmp를 빈통이라고 하면 빈통에다가 수를 넣고 x자리에다가,, y값 넣고,, 이런식,,? ㅇㅇ
 		// 빈통에다가 1을 넣고 z 를 빈통 값으로 바꿔보세요! 위에있는 식을 바꿔야하는거에요!?
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		// 한번 정리하고 가죠!
 		// x = y      : x 에 다가 y 가 들고 있는 값을 넣는다.
 		// y = z      : y 에다가 z가 들고 있는 값을 넣는다.
 		// 곧?
 		// z 의 값은 그러면 3이잖아요?넹!!
 		// z 에다가 1을 넣고 싶어요. 근데 지금 1이 있나요? 출력된 곳에 출력된 곳이 어디에여,,?
 		// 오른쪽 console 로그 있어여!없어여!!
 		// 1은 x에 저장되어 있었다.
 		// x 를 y가 저장된 값으로 바꿨다.
 		// x 가 들고있던 1은 사라졌다.
 		// z = x 라고 하면 어떻게 될까요? 예상 z = x 가 무슨 의미에요?
 		//근데 이미 x값이 바뀌었는데,, x의 값을 z에 넣기ㅣ! ㅇㅇ 바뀐상태에서
 		// 넣으면 어떻게 될까요 뭐가 나올까요?z=2!
 		// 똑똑딩동댕동~ 근데 1어디갔어여,,?
	}

}
