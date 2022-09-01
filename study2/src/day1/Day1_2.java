package day1;

class Day1_2{          // 인스턴스 멤버 -> static 멤버  접근 >> 가능
				       // static 멤버 -> 인스턴스 멤버  접근 >> 불가능
class InstanceInner {}
static class StaticInner {} 

InstanceInner iv = new InstanceInner(); //인스턴스 멤버끼리는 직접 접근 가능
static StaticInner cv = new StaticInner(); //static 멤버끼리는 직접 접근 가능
//					  = new InstanceInner //에러 
static void staticMethod() { 
//	InstanceInner obj1 = new InstanceInner(); //에러 : static 멤버가 인스턴스멤버에 접근 불가
	StaticInner obj2 = new StaticInner();
	
	Day1_2 outer = new Day1_2();
	InstanceInner obj1 = outer.new InstanceInner();
}

void instanceMethod() { 
	InstanceInner obj1 = new InstanceInner();
	StaticInner obj2 = new StaticInner();
//	LocalInner lv = new LocalInner();
}

void myMethod() {
	class LocalInner{}
	LocalInner lv = new LocalInner();
}
	
}

