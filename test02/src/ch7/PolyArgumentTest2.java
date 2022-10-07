package ch7;

class Product {
	int price;			// ��ǰ�� ����
	int bonusPoint;		// ��ǰ���� �� �����ϴ� ���ʽ�����

	Product(int price) {
		this.price = price;
		bonusPoint =(int)(price/10.0);
	}

	Product() {} // �⺻ ������
}
 
class Tv extends Product {
	Tv() {
		super(100);	
	}

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
	int money = 1000;	// �����ݾ�
	int bonusPoint = 0;	// ���ʽ�����
	Product[] item = new Product[10];	// ������ ��ǰ�� �����ϱ� ���� �迭
	int i =0;			// Product�迭�� ���� ī����

	void buy(Product p) {
		if(money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ ��� �����ϴ�.");
			return;
		}

		money -= p.price;	        // ���� ������ ������ ��ǰ�� ������ ����.
		bonusPoint += p.bonusPoint;	// ��ǰ�� ���ʽ� ������ �߰��Ѵ�.
		item[i++] = p;		        // ��ǰ�� Product[] item�� �����Ѵ�.
		System.out.println(p + "��/�� �����ϼ̽��ϴ�.");
	}

	void summary() {		    // ������ ��ǰ�� ���� ������ ����ؼ� ���� �ش�.
		int sum = 0;		 	// ������ ��ǰ�� �����հ�
		String itemList =""; 	// ������ ��ǰ���

		// �ݺ����� �̿��ؼ� ������ ��ǰ�� �� ���ݰ� ����� �����.
		for(int i=0; i<item.length;i++) {
			if(item[i]==null) break;
			sum += item[i].price;
			itemList += item[i] + ", ";
		}
		System.out.println("�����Ͻ� ��ǰ�� �ѱݾ��� " + sum + "�����Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� " + itemList + "�Դϴ�.");
	}
}

class PolyArgumentTest2 {
	public static void main(String args[]) {
		Buyer b = new Buyer();

		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Audio());
		b.summary();
	}
}
