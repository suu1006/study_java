package ex6;

public class Ex6_12 { // public ���� class ������ �θ� ���� ���ؿ�

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;

		Car c2 = new Car("white", "auto", 4);

		System.out.println("c1�� color =" + c1.color + ", gearType =" + c1.gearType + ", door =" + c1.door);
		System.out.println("c2�� color =" + c2.color + ", gearType =" + c2.gearType + ", door =" + c2.door);
	}

}

class Car { 
	//�ʵ� ����
	String color;
	String gearType;
	int door;
	//������
	/*
	 * 1. �����ڰ� �������� �ʴ´ٸ� �⺻������ �ڹٴ� �⺻������ ���()�� ������ش�. / Car (){} �̰� �������� ������ �⺻���� �������
	 * 2. ���࿡ �����ڰ� �����Ѵٸ� ��Ŵ� �ƴϴ� �⺻�����ڸ� ��������� �ʴ´�. 
	 * = Car() {} �̰ų� Car(String c, String g, int d) { ���߿� �ϳ��� ������ �⺻������ �ȸ������!
	 * 3. ���࿡ ���� �����ڸ� �����, �� �����ڸ� ����ٸ� new�� ������ �����.  
	 * 
	 */
	Car() {} // �ڵ����� �ƹ��͵� �ʿ�����ϴ�.��� ���� ������ֱ�

	Car(String c, String g, int d) { // �ڵ����� String c�� String g�� int d �� �� �ʿ�� �մϴ�.
		color = c;
		gearType = g;
		door = d;
	}
	//�޼���
}