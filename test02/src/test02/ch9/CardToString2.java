package test02.ch9;

class Card {
	String kind;
	int number;

	Card() {
		this("SPADE", 1);  // Card(String kind, int number)�� ȣ��
	}

	Card(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}

	public String toString() {
		// Card�ν��Ͻ��� kind�� number�� ���ڿ��� ��ȯ�Ѵ�.
		return "kind : " + kind + ", number : " + number;
	}
}

class CardToString2 {
	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card("HEART", 10);
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}
}
