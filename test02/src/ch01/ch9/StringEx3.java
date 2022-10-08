package ch01.ch9;

class StringEx3 {
	public static void main(String[] args) {
		// ���̰� 0�� char�迭�� �����Ѵ�.
		char[] cArr = new char[0];   // char[] cArr = {};�� ����.
		String s = new String(cArr); // String s = new String("");�� ����.

		System.out.println("cArr.length="+cArr.length);
		System.out.println("@@@"+s+"@@@");
	}
}
