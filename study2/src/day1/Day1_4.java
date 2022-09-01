package day1;

class Outer2 { 
	class InstanceInner { //�ν��Ͻ� ���
		int iv = 100;
	}
	static class StaticInner { 
		int iv = 200;
		static int cv = 300;
	}
	void myMethod() {
		class LocalInner {
			int iv = 400;
		}
	}
}

class Day1_4 {
	public static void main(String args[]) {
	Outer2 oc = new Outer2(); //�ܺ� Ŭ������ ��ü�� ���� �����ؾ�  
	Outer2.InstanceInner ii = oc. new InstanceInner(); //���� Ŭ���� ��ü ���� ����
	
	System.out.println("ii.iv : " + ii.iv); //100
	System.out.println("Outer2.StaticInner.cv : " + Outer2.StaticInner.cv); //300
	
	//static ���� Ŭ������ �ν��Ͻ��� �ܺ� Ŭ������ ���� �������� �ʾƵ� �ȴ�.
	Outer2.StaticInner si = new Outer2.StaticInner();//�ܺ�Ŭ������ �̸��� �ٿ������.(����!)
	System.out.println("si.iv : " + si.iv);
	}
}













