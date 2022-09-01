package day1;

import java.awt.Button;  //awt (자바의 윈도우 프로그래밍 도구)

class Day1_6 {
	public static void main (String [] args ) {
		Button b = new Button("Start");
		b.addActionListener(new ActionListener() { //클래스의 정의와 객체 생성을 동시에 
			//new 뒤 조상이름 or 인터페이스이름
			public void actionformed(ActionEvent e) {
				System.out.println("ActionEvent ouccurred!!");
			}
		});
	}
}
		
