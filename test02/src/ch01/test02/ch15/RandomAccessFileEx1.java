package ch01.test02.ch15;

import java.io.IOException;
import java.io.RandomAccessFile;

class RandomAccessFileEx1 {
	public static void main(String[] args) {
		try {
			RandomAccessFile raf = new RandomAccessFile("test.dat", "rw");
			System.out.println("���� �������� ��ġ: " + raf.getFilePointer());
			raf.writeInt(100);
			System.out.println("���� �������� ��ġ: " + raf.getFilePointer());
			raf.writeLong(100L);
			System.out.println("���� �������� ��ġ: " + raf.getFilePointer());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
