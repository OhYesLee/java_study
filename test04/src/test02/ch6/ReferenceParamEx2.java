package test02.ch6;

class ReferenceParamEx2 {
	public static void main(String[] args) 
  {
		int[] x = {10};  // ũ�Ⱑ 1�� �迭. x[0] = 10;
		System.out.println("main() : x = " + x[0]);

		change(x);
		System.out.println("After change(x)");
		System.out.println("main() : x = " + x[0]);
	}

	static void change(int[] x) { // ������ �Ű�����
		x[0] = 1000;
		System.out.println("change() : x = " + x[0]);
	}
}
