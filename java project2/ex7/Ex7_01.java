package ex7;
 class Ex7_01 {

	class MyParent{
		private int prv;// private ���� Ŭ���� 
				int dft;// default ���� ��Ű��
	  protected int prt;// protected ���� ��Ű�� + �ڼ�(�ٸ� ��Ű��)
		public  int pub;// public  ���� ���� ����.
	
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
			System.out.println(p.prv); //����. (���� Ŭ���� ���� �ƴ϶� ������.)
			System.out.println(p.dft); //OK
			System.out.println(p.prt); //OK
			System.out.println(p.pub); //OK
		}
	}
}