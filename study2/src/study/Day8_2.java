package study;

import java.util.Scanner;

public class Day8_2 {

	public static void main(String[] args) {
		Student student = new Student(); //��ü����

		int result1 = student.SUM(30, 40, 50);
		int result2 = student.AVG(SUM/3);

		System.out.println("");
	}
}
class Student {
	Scanner sc = new Scanner(System.in);
	String Name = sc.toString(); 

	void NAME (String name) {
		System.out.println("�л��̸� :" + Name); //�л��̸� �Է¹ޱ�
	}

	int SUM (int kor, int math, int eng) {
		return kor + math + eng;  //sum �հ� �޼���
		}
	int AVG (int sum) { //avg ��� �޼���
		return sum/3;
	}
}