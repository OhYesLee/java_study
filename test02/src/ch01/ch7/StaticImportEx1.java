package ch01.ch7;

import static java.lang.Math.PI;
import static java.lang.Math.random;
import static java.lang.System.out;

class StaticImportEx1 {
	public static void main(String[] args) {	
		// System.out.println(Math.random());
		out.println(random());

		// System.out.println("Math.PI :"+Math.PI);
		out.println("Math.PI :" + PI);
	}
}
