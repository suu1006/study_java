package java.etc;

abstract class Unit2 {
	int x,y;
	abstract void move(int x, int y);
	void stop() {System.out.println("����ϴ�.");}
		
interface Fighterable {
	void move(int x, int y);
	void attack(Fighterable f);
	
class Fighter extends Unit2 implements Fighterable {
	//�������̵� ��Ģ : ����(public���� ���������ڰ� ������ ������ �ȵȴ�.)
	public void move(int x, int y) {
		System.out.println("[" +x+ "," +y+ "]�� �̵�");
	}
	public void attack(Fighterable f) {
		System.out.println(f+"�� ����");
	}
	Fighterable getFightable() {
		Fighter f = new Fighter();
		return f;
	}
}
public class FighterTest {
	public static void main(String[] args) {
		Fighter f = new Fighter();
		Fighterable f2 = f.getFightable();
		
		
//		Fighter f = new Fighter();
//		Unit2 u = new Fighter();
//		Fighterable f = new Fighter();
//		u.move(100,200);
//		u.attack(new Fighter()); // Unit2���� attack()�� ��� ȣ�� �Ұ�
//		u.stop();
//		
//		f.move(100, 200);
//		f.attack(new Fighter());
//		f.stop(); // Fighterable���� stop()�� ��� ȣ��Ұ� 
		
	}
}
	}

}
