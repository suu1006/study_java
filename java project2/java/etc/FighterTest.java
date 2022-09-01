package java.etc;

abstract class Unit2 {
	int x,y;
	abstract void move(int x, int y);
	void stop() {System.out.println("멈춥니다.");}
		
interface Fighterable {
	void move(int x, int y);
	void attack(Fighterable f);
	
class Fighter extends Unit2 implements Fighterable {
	//오버라이딩 규칙 : 조상(public보다 접근제어자가 범위가 좁으면 안된다.)
	public void move(int x, int y) {
		System.out.println("[" +x+ "," +y+ "]로 이동");
	}
	public void attack(Fighterable f) {
		System.out.println(f+"를 공격");
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
//		u.attack(new Fighter()); // Unit2에는 attack()이 없어서 호출 불가
//		u.stop();
//		
//		f.move(100, 200);
//		f.attack(new Fighter());
//		f.stop(); // Fighterable에는 stop()이 없어서 호출불가 
		
	}
}
	}

}
