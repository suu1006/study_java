package cp5;

public class cp5_7commandLine {

	public static void main(String[] args) {
		System.out.println("�Ű������� ���� : " + args.length);
		for (int i=0; i<args.length; i++) {
			System.out.println("args [" + i + "] = \""+args[i] + "\"");
		} // ���� ��ư �Ʒ� Run Configurations >> Arguments �� �����ϸ� �Է��ϱ�
	}
}