package day1;

class Day1_2{          // �ν��Ͻ� ��� -> static ���  ���� >> ����
				       // static ��� -> �ν��Ͻ� ���  ���� >> �Ұ���
class InstanceInner {}
static class StaticInner {} 

InstanceInner iv = new InstanceInner(); //�ν��Ͻ� ��������� ���� ���� ����
static StaticInner cv = new StaticInner(); //static ��������� ���� ���� ����
//					  = new InstanceInner //���� 
static void staticMethod() { 
//	InstanceInner obj1 = new InstanceInner(); //���� : static ����� �ν��Ͻ������ ���� �Ұ�
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

