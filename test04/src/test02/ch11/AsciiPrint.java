package test02.ch11;

class AsciiPrint{
	public static void main(String[] args) {
		char ch = ' ';
		for(int i=0; i < 95; i++)  // ����(' ')������ ���ڵ��� ����Ѵ�.
			System.out.print(ch++);
	}
}
