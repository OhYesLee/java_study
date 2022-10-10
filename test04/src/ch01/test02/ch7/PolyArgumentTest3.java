package ch01.test02.ch7;

import java.util.Vector;

class Product {
	int price;			// ��ǰ�� ����
	int bonusPoint;		// ��ǰ���� �� �����ϴ� ���ʽ�����

	Product(int price) {
		this.price = price;
		bonusPoint =(int)(price/10.0);
	}

	Product() {
		price = 0;
		bonusPoint = 0;
	}
}

class Tv extends Product {
	Tv() { super(100); }
	public String toString() { return "Tv"; }
}

class Computer extends Product {
	Computer() { super(200); }
	public String toString() { return "Computer"; }
}

class Audio extends Product {
	Audio() { super(50); }
	public String toString() { return "Audio"; }
}

class Buyer {			// ��, ������ ��� ���
	int money = 1000;  	// �����ݾ�
	int bonusPoint = 0;	// ���ʽ�����
	Vector item = new Vector();	// ������ ��ǰ�� �����ϴµ� ���� Vector��ü

	void buy(Product p) {
		if(money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ ��� �����ϴ�.");
			return;
		}
		money -= p.price;			// ���� ������ ������ ��ǰ�� ������ ����.
		bonusPoint += p.bonusPoint;	// ��ǰ�� ���ʽ� ������ �߰��Ѵ�.
		item.add(p);				// ������ ��ǰ�� Vector�� �����Ѵ�.
		System.out.println(p + "��/�� �����ϼ̽��ϴ�.");
	}

	void refund(Product p) {	// ������ ��ǰ�� ȯ���Ѵ�.
		if(item.remove(p)) {	// ��ǰ�� Vector���� �����Ѵ�.
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + "��/�� ��ǰ�ϼ̽��ϴ�.");
		} else {			//  ���ſ� ������ ���
			System.out.println("�����Ͻ� ��ǰ �� �ش� ��ǰ�� �����ϴ�.");		
		}
	}

	void summary() {		      // ������ ��ǰ�� ���� ������ ����ؼ� �����ش�.
		int sum = 0;		      // ������ ��ǰ�� �����հ�
		String itemList =""; 	  // ������ ��ǰ���
		
		if(item.isEmpty()) {	// Vector�� ����ִ��� Ȯ���Ѵ�.
			System.out.println("�����Ͻ� ��ǰ�� �����ϴ�.");
			return;
		}

		// �ݺ����� �̿��ؼ� ������ ��ǰ�� �� ���ݰ� ����� �����.
		for(int i=0; i<item.size();i++) {
			Product p = (Product)item.get(i);	
			sum += p.price;
			itemList += (i==0) ? "" + p : ", " + p;
		}
		System.out.println("�����Ͻ� ��ǰ�� �ѱݾ��� " + sum + "�����Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� " + itemList + "�Դϴ�.");
	}
}

class PolyArgumentTest3 {
	public static void main(String args[]) {
		Buyer b = new Buyer();
		Tv tv = new Tv();
		Computer com = new Computer();
		Audio audio = new Audio();

		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		b.summary();
		System.out.println();
		b.refund(com);
		b.summary();
	}
}
