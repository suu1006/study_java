package ex7;
 class Ex7_01 {

	class MyParent{
		private int prv;// private 같은 클래스 
				int dft;// default 같은 패키지
	  protected int prt;// protected 같은 패키지 + 자손(다른 패키지)
		public  int pub;// public  접근 제한 없음.
	
		public void printMembers() {
			System.out.println(prv); //OK
			System.out.println(dft); //OK
			System.out.println(prt); //OK
			System.out.println(pub); //OK
		}
	}
	public class MyParentTest {
		public static void main(String[] args) {
			MyParent p = new MyParent();
			System.out.println(p.prv); //에러. (같은 클래스 안이 아니라서 오류남.)
			System.out.println(p.dft); //OK
			System.out.println(p.prt); //OK
			System.out.println(p.pub); //OK
		}
	}
}