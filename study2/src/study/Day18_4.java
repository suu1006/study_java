package study;

public class Day18_4 {

	public static void main(String[] args) {
		latte s = new latte
				("ȫ�浿", 1, 1, 100, 60, 76);
		String str = s.info();
		System.out.println(str);
	}
}
class latte {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	latte() {
	}
	
	latte(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	 String info() {
		int result = kor + eng + math;
		float result2 = (float)(kor + eng + math)/3; // result/3;	
		String result3 = name + ", " + ban + ", " + no + ", " + kor + ", " + eng + ", " + math +","+ result +", "+ result2;
		return result3;
		
		
	}
	
}