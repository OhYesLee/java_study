package ch01.test02.ch7;

class DeckTest {
	public static void main(String args[]) {
		Deck d = new Deck();	   // ī�� �� ��(Deck)�� �����.
		Card c = d.pick(0);	   // ���� ���� ���� ���� ī�带 �̴´�.
		System.out.println(c); // System.out.println(c.toString());�� ����.

		d.shuffle();			   // ī�带 ���´�.
		c = d.pick(0);		   // ���� �Ŀ� ���� ���� ī�带 �̴´�.
		System.out.println(c);
	}
}

// DeckŬ����
class Deck {
	final int CARD_NUM = 52;	// ī���� ����
	Card cardArr[] = new Card[CARD_NUM];  // Card��ü �迭�� ����

	Deck () {	// Deck�� ī�带 �ʱ�ȭ�Ѵ�.
		int i=0;

		for(int k=Card.KIND_MAX; k > 0; k--)
			for(int n=0; n < Card.NUM_MAX ; n++)
				cardArr[i++] = new Card(k, n+1);
	}

	Card pick(int index) {	// ������ ��ġ(index)�� �ִ� ī�� �ϳ��� ������ ��ȯ
		return cardArr[index];
	}

	Card pick() {			// Deck���� ī�� �ϳ��� �����Ѵ�.
		int index = (int)(Math.random() * CARD_NUM);
		return pick(index);
	}

	void shuffle() { // ī���� ������ ���´�.
		for(int i=0; i < cardArr.length; i++) {
			int r = (int)(Math.random() * CARD_NUM);

			Card temp = cardArr[i];	
			cardArr[i] = cardArr[r];
			cardArr[r] = temp;
		}
	}
} // DeckŬ������ ��

// CardŬ����
class Card {
	static final int KIND_MAX = 4;	// ī�� ������ ��
	static final int NUM_MAX  = 13;	// ���̺� ī�� ��

	static final int SPADE   = 4;
	static final int DIAMOND = 3;
	static final int HEART   = 2;
	static final int CLOVER  = 1;

	int kind;
	int number;

	Card() {
		this(SPADE, 1);
	}

	Card(int kind, int number) {
		this.kind = kind;
		this.number = number;
	}

	public String toString() {
		String[] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};
		String numbers = "0123456789XJQK"; // ���� 10�� X�� ǥ��

		return "kind : " + kinds[this.kind] 
			+ ", number : " + numbers.charAt(this.number);
	} // toString()�� ��
} // CardŬ������ ��
