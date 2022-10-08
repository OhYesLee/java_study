package ch01.ch15;

import java.io.*;
import java.util.Arrays;

class IOEx2 {
	public static void main(String[] args) {
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;

		byte[] temp = new byte[10];

		ByteArrayInputStream  input  = null;
		ByteArrayOutputStream output = null;

		input  = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();

		input.read(temp,0,temp.length); // �о� �� �����͸� �迭 temp�� ��´�.
		output.write(temp,5, 5);	    // temp[5]���� 5���� �����͸� write�Ѵ�.

		outSrc = output.toByteArray();

		System.out.println("Input Source  :" + Arrays.toString(inSrc));
		System.out.println("temp          :" + Arrays.toString(temp));
		System.out.println("Output Source :" + Arrays.toString(outSrc));

	}
}
