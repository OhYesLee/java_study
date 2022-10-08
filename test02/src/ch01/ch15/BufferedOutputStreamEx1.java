package ch01.ch15;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class BufferedOutputStreamEx1 {
	public static void main(String args[]) {
		try {
		     FileOutputStream fos = new FileOutputStream("123.txt");
		     // BufferedOutputStream�� ���� ũ�⸦ 5�� �Ѵ�.
		     BufferedOutputStream bos = new BufferedOutputStream(fos, 5);
		     // ���� 123.txt��  1 ���� 9���� ����Ѵ�.
		     for(int i='1'; i <= '9'; i++) {
			     bos.write(i);
		     }

		     fos.close();
		} catch (IOException e) {
		     e.printStackTrace();		
		}
	}
}
