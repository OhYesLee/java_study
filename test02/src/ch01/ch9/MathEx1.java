package ch01.ch9;

import static java.lang.Math.*;
import static java.lang.System.out;

class MathEx1 {
	public static void main(String args[]) {
		double val = 90.7552;
		out.println("round("+ val +")=" + round(val));  // �ݿø�

		val *= 100;
		out.println("round("+ val +")=" + round(val));  // �ݿø�

		out.println("round("+ val +")/100  =" + round(val)/100);  // �ݿø�
		out.println("round("+ val +")/100.0=" + round(val)/100.0);  // �ݿø�
		out.println();
		out.printf("ceil(%3.1f)=%3.1f%n",  1.1, ceil(1.1));   // �ø�
		out.printf("floor(%3.1f)=%3.1f%n", 1.5, floor(1.5));  // ����	
		out.printf("round(%3.1f)=%d%n",    1.1, round(1.1));  // �ݿø�
		out.printf("round(%3.1f)=%d%n",    1.5, round(1.5));  // �ݿø�
		out.printf("rint(%3.1f)=%f%n",     1.5, rint(1.5));   // �ݿø�
		out.printf("round(%3.1f)=%d%n",   -1.5, round(-1.5)); // �ݿø�
		out.printf("rint(%3.1f)=%f%n",    -1.5, rint(-1.5));  // �ݿø�
		out.printf("ceil(%3.1f)=%f%n",    -1.5, ceil(-1.5));  // �ø�
		out.printf("floor(%3.1f)=%f%n",   -1.5, floor(-1.5)); // ����
	}
}
