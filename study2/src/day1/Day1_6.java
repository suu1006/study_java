package day1;

import java.awt.Button;  //awt (�ڹ��� ������ ���α׷��� ����)

class Day1_6 {
	public static void main (String [] args ) {
		Button b = new Button("Start");
		b.addActionListener(new ActionListener() { //Ŭ������ ���ǿ� ��ü ������ ���ÿ� 
			//new �� �����̸� or �������̽��̸�
			public void actionformed(ActionEvent e) {
				System.out.println("ActionEvent ouccurred!!");
			}
		});
	}
}
		
