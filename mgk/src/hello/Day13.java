package hello;

public class Day13 {

	public static void main(String[] args) {
		Student student1 = new Student("�ڹ�", 100, 80, 70);
		Student student2 = new Student("�躯��", 100,90,80); //��ü����
		
		System.out.printf("�ڹ��� ��� ���� : %f\n", student1.getAverage()  );
		System.out.printf("�躯���� ��� ���� : %f\n" , student2.getAverage()); //��¹�
	}
}
class Student {
	String name; //����� ����!
	float a,b,c;
	
	public Student (String name, float a, float b, float c){ //�޼���
		this.name = name;
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public float getAverage () {
		return (float)(a+b+c)/3;
	}
}