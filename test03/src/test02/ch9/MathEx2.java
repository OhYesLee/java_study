package test02.ch9;

import static java.lang.Math.negateExact;
import static java.lang.System.out;

class MathEx2 {
	public static void main(String args[]) {
		int i = Integer.MIN_VALUE;

		out.println("i ="+i);
		out.println("-i="+(-i));

		try {
			out.printf("negateExact(%d)= %d%n",  10, negateExact(10));
			out.printf("negateExact(%d)= %d%n", -10, negateExact(-10));

			out.printf("negateExact(%d)= %d%n", i, negateExact(i)); // ���ܹ߻�
		} catch(ArithmeticException e) {
			// i�� longŸ������ ����ȯ ������ negateExact(long a)�� ȣ��
		     out.printf("negateExact(%d)= %d%n",(long)i,negateExact((long)i));
		}
	} // main�� ��
}
