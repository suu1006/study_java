package ss;

public class Ss01 {

	public static void main(String[] args) {
		String[] members = {"최진혁", "최유빈", "한이람"}; // String (데이터 타입), members(변수) 
		for (int i=0; i<members.length; i++) { //for 반복문(초기화, 반복조건, 반복실행) , .Length>> 값의 개수
			String member = members[i];
			System.out.println(member + "이 상담받았습니다.");
	}
	}
}