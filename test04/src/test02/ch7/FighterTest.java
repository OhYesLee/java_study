package test02.ch7;

class FighterTest {
	public static void main(String[] args) {
		Fighter f = new Fighter();

		if (f instanceof Unit)	{		
			System.out.println("f�� UnitŬ������ �ڼ��Դϴ�.");
		}
		if (f instanceof Fightable) {	
			System.out.println("f�� Fightable�������̽��� �����߽��ϴ�.");
		}
		if (f instanceof Movable) {		
			System.out.println("f�� Movable�������̽��� �����߽��ϴ�.");
		}
		if (f instanceof Attackable) {	
			System.out.println("f�� Attackable�������̽��� �����߽��ϴ�.");
		}
		if (f instanceof Object) {		
			System.out.println("f�� ObjectŬ������ �ڼ��Դϴ�.");
		}
	}
}

class Fighter extends Unit implements Fightable {
	public void move(int x, int y) { /* ���� ���� */ }
	public void attack(Unit u) { /* ���� ���� */ }
}

class Unit {
	int currentHP;	// ������ ü��
	int x;			// ������ ��ġ(x��ǥ)
	int y;			// ������ ��ġ(y��ǥ)
}

interface Fightable extends Movable, Attackable { }
interface Movable {	void move(int x, int y);	}
interface Attackable {	void attack(Unit u); }
