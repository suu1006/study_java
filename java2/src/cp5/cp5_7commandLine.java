package cp5;

public class cp5_7commandLine {

	public static void main(String[] args) {
		System.out.println("매개변수의 개수 : " + args.length);
		for (int i=0; i<args.length; i++) {
			System.out.println("args [" + i + "] = \""+args[i] + "\"");
		} // 실행 버튼 아래 Run Configurations >> Arguments 에 띄어쓰기하며 입력하기
	}
}