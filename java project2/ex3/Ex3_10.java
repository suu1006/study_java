package ex3;

public class Ex3_10 {

	public static void main(String[] args) {
		long a = (long) 1_000_000 * 1_000_000; // 
		long b = 1_000_000 * 1_000_000L; // 		
		System.out.println("a=" +a);
		System.out.println("b=" +b);
		// �׳�?? ���� �ڷ������� ������ ����� ū Ÿ������ ĳ�����ؼ� �־��ָ� �ȴ�! <<�ٽ�!! �˰ھ��!!������
		// ĳ���� : �� ��ȯ (long) (int) �� ���� = �����ʿ� ����� ���ؼ� ĳ���� ���ְ�,
		// �����ϼ̾��. �� �ٻ� �� �ƴϴϱ� �׻� �׳� ������� �ƽð���? ���m�߳�!!! �ٵ�������,, �ϳ���,���� ������������
		//math.round�̰� �����ε� ��ø���,,
	
	}
}