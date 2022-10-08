package ch01.test02.ch8;

class FinallyTest3 {
	public static void main(String args[]) {
		// method1()�� static�޼����̹Ƿ� �ν��Ͻ� �������� ���� ȣ���� �����ϴ�.
		FinallyTest3.method1();		
        System.out.println("method1()�� ������ ��ġ�� main�޼���� ���ƿԽ��ϴ�.");
	}	// main�޼����� ��

	static void method1() {
		try {
			System.out.println("method1()�� ȣ��Ǿ����ϴ�.");
			return;		// ���� ���� ���� �޼��带 �����Ѵ�.
		}	catch (Exception e)	{
			e.printStackTrace();
		} finally {
			System.out.println("method1()�� finally���� ����Ǿ����ϴ�.");
		}
	}	// method1�޼����� ��
}
