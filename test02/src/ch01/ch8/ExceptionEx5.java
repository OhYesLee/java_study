package ch01.ch8;

class ExceptionEx5 {
	public static void main(String args[]) {
			System.out.println(1);			
			System.out.println(2);
			try {
				System.out.println(3);
				System.out.println(0/0);	
				System.out.println(4); 	// ������� �ʴ´�.
			} catch (ArithmeticException ae)	{
				System.out.println(5);
			}	// try-catch�� ��
			System.out.println(6);
	}	// main�޼����� ��
}
