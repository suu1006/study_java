package study2;

public class Student1_1 extends People1_1 {
	public int studentNo;
	
	public Student1_1 (String name, String ssn, int studentNo) {
		super(name, ssn); //�ݵ�� ù �ٿ� ��ġ�ؾ���.
		//�θ� Ŭ������ �⺻�����ڰ� ���� �Ű������� �ִ� �����ڸ� �ִٸ�
		//�ڽ� �����ڿ��� �ݵ�� �θ� ������ ȣ���� ���� super�� ��������� ȣ���ؾ���.
		//name�� ssn�� �ٽ� �θ� �����ڸ� ȣ���ϱ� ���� �Ű������� �Ѱ���.
		
		this.studentNo = studentNo;
	 

	}

}
