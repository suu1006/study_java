package day1;

class Outer2 { 
	class InstanceInner { //인스턴스 멤버
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
	Outer2 oc = new Outer2(); //외부 클래스의 객체를 먼저 생성해야  
	Outer2.InstanceInner ii = oc. new InstanceInner(); //내부 클래스 객체 생성 가능
	
	System.out.println("ii.iv : " + ii.iv); //100
	System.out.println("Outer2.StaticInner.cv : " + Outer2.StaticInner.cv); //300
	
	//static 내부 클래스의 인스턴스는 외부 클래스를 먼저 생성하지 않아도 된다.
	Outer2.StaticInner si = new Outer2.StaticInner();//외부클래스의 이름을 붙여줘야함.(문법!)
	System.out.println("si.iv : " + si.iv);
	}
}













