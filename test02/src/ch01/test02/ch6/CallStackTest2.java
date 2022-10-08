package ch01.test02.ch6;

class CallStackTest2 {
	public static void main(String[] args) {
		System.out.println("main(String[] args)�� ���۵Ǿ���.");
		firstMethod();
		System.out.println("main(String[] args)�� ������.");
	}

	static void firstMethod() {
		System.out.println("firstMethod()�� ���۵Ǿ���.");
		secondMethod();
		System.out.println("firstMethod()�� ������.");		
	}

	static void secondMethod() {
		System.out.println("secondMethod()�� ���۵Ǿ���.");
		System.out.println("secondMethod()�� ������.");		
	}
}
