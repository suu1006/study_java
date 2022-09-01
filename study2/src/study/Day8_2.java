package study;

import java.util.Scanner;

public class Day8_2 {

	public static void main(String[] args) {
		Student student = new Student(); //객체생성

		int result1 = student.SUM(30, 40, 50);
		int result2 = student.AVG(SUM/3);

		System.out.println("");
	}
}
class Student {
	Scanner sc = new Scanner(System.in);
	String Name = sc.toString(); 

	void NAME (String name) {
		System.out.println("학생이름 :" + Name); //학생이름 입력받기
	}

	int SUM (int kor, int math, int eng) {
		return kor + math + eng;  //sum 합계 메서드
		}
	int AVG (int sum) { //avg 평균 메서드
		return sum/3;
	}
}