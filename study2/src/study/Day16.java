package study;
		/*
		 * StudentŬ�������� �̸��� ������ִ� ��ȯ���� ���� name �޼ҵ�, 
		 * kor, eng, math�� ������ �Ű������� �Է¹ް�, ȣ���� �޼ҵ�� ���� ��ȯ���ִ� sum �޼ҵ�, 
		 * �׸��� ��հ��� ��ȯ���ִ� avg�޼ҵ尡 �ֽ��ϴ�.
		 * �ּ��� ������ StudentŬ������ ���� �о��ּ���. ���ذ� �ȵǴ� �κ��� �����صΰ� ���� ���͵� �������� �غ��ڽ��ϴ� :) 
		 */
		public class Day16 {
		
			public static void main(String[] args) {
				
				Student2 student = new Student2(); //StudentŬ������ �ּҸ� �����ϱ� ���� �������� student�� �����ϰ�, StudentŬ������ �ּҸ� student���������� �������ݴϴ�.
				
				student.name("ȫ�浿"); // student ���������� ����Ǿ��ִ� StudentŬ������ �ּҿ���, name�޼ҵ带 ȣ��, name �޼ҵ��� �Ű����� name�� "ȫ�浿"���� �Է��� name�޼ҵ尡 �޽��ϴ�.
				
				student.sum(100,90,80); //student������������ int sum(int kor, int eng, int math) �� ȣ���մϴ�. �̶� kor = 100, eng = 90, math = 80 ���� �Է��� �޽��ϴ�.
				
			    student.avg(); //avg�� ��� �̹� sum�� ���� 3���� �����ֱ� ������ ���� �Է¹޴� �Ű������� �������� �ʽ��ϴ�. Ŭ������ �������(�Ӽ�) avg = sum/3���� �ٽ� �ʱ�ȭ�� ���ְ� �Ǹ� ������ ������ sum �� 3���� ������ �˴ϴ�.
			}
		}
		class Student2{
			int sum = 0; // �츮�� ���� ����ϴ� ���� ���� ������� ��������� ����, �ʱ�ȭ �����־����ϴ�. ��������� �ش� Ŭ������ ��� �޼ҵ忡�� ����� �� �ֽ��ϴ�. 
			int avg = 0;  //������� ���� �� �ʱ�ȭ
			
			void name(String name) { /*
			 �Ű����� name�� �̸��� �Է¹޽��ϴ�. 
			 ���� ���, ������ �� student.name("ȫ�浿"); �� ���, 
			 name(String name) �޼ҵ��� �Ű������� String name = "ȫ�浿"; ���� �Ű������� �޾Ƽ� ����� ���Դϴ�.
			 */
				System.out.println("�л��� �̸�:"+name);//����� ���� ��¹��� �����ֱ⸸ �� ��, ȣ���� �޼ҵ�� ��� ������� �ǵ������� �ʽ��ϴ�.
			}
			int sum(int kor, int eng, int math) { // 3���� ������ �Ű����� kor, eng, math�� �Է¹ް�, �Է¹��� ���� ��� ���� ���� ȣ���� �޼ҵ忡 ��ȯ���ִ� return�޼ҵ��Դϴ�.
				
				sum = kor + eng + math; // StudentŬ������ �Ű����� sum�� �ش� �޼ҵ忡�� ����Ͽ����ϴ�. �̷��� Ŭ������ �������(�Ӽ�)�� ��� �޼ҵ忡�� ����� �� �־��.
				System.out.println("�հ��"+sum+"�� �Դϴ�.");//3���� ���� ���� sum�� ������ִ� ��¹��Դϴ�.
				return sum; /*
				 ������ �޼ҵ�� ������ ���� ȣ���� �޼ҵ�� ��ȯ���ݴϴ�. 
				 ���� ���� student.sum(100,90,80);ó�� �޼ҵ带 ȣ��������, sum = 100+90+80���� ���� �޾��ְ� �� ���� �ڵ� => System.out.println("�հ��"+sum);�� ��������ݴϴ�. 
				 */
			}
			int avg() {
				avg = sum / 3; /*sum = kor + eng + math;�̸�, �̷��� sum�� 3���� ���� ���� avg�� �����մϴ�. 
				���� �츮�� StudentŬ������ ��������� ���������� �ʾҴٸ�, avg�� avg = (kor+eng+math) / 3;�̶�� ���ŷο� ���� �� ����� �մϴ�.
				�̷��� ���°Ͱ�, avg = sum/3;�� ���غ���, ������ ��찡 �����ϱ⵵ ����, �ۼ��� ���忡���� �ڵ带 �ۼ��ϱⰡ �����մϴ�.
				*/
				System.out.println("��� ������"+avg+"�� �Դϴ�."); //��հ� avg�� ��¹����� ������ݴϴ�.
				return avg; // student.avg();�� ���� �ٽ� �ǵ����ݴϴ�. 
				}
			}