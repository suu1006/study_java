package cp6;

public class cp6_8_TestClass {

	public static void main(String[] args) {
		void instanceMethod() {} // �ν��Ͻ� �޼ҵ�
		static void staticMethod() {} // static �޼ҵ�
		
		void instanceMethod2() { // �ν��Ͻ� �޼ҵ�
			instanceMethod();  // �ν��Ͻ� �޼��� ȣ��
			staticMethod(); //static�޼ҵ� ȣ��
			
		static void staticMethod2() {
			instanceMethod();
			staticMethod();
		}
		}
	}

}
