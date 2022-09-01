package cp6;

public class cp6_10_Data_1 {

	public static void main(String[] args) {
		Data_1 d1 = new Data_1();
		Data_2 d2 = new Data_2();
	}
class Data_1 {
	int value; // 생성자 0개
}
class Data_2 {
	int value; 
	Data_2(int x) { // 매개변수가 있는 생성자
		value = x;	}
	}
}