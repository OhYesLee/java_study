package ch9;

class StringEx7 {
	public static void main(String[] args) {
		String fullName = "Hello.java";

		// fullName���� '.'�� ��ġ�� ã�´�.
		int index = fullName.indexOf('.');

		// fullName�� ù��° ���ں��� '.'�� �ִ� ������ ���ڿ��� �����Ѵ�.
		String fileName = fullName.substring(0, index);

 	    // '.'�� ���� ���� ���� �����ؼ� ���ڿ��� ������ �����Ѵ�.
		// fullName.substring(index+1, fullName.length());�� ����� ����.
		String ext = fullName.substring(index+1);

		System.out.println(fullName + "�� Ȯ���ڸ� ������ �̸��� " + fileName);
		System.out.println(fullName + "�� Ȯ���ڴ� " + ext);
	}
}
