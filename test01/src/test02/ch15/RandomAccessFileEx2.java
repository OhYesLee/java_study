package test02.ch15;

import java.io.*;

class RandomAccessFileEx2 {
	public static void main(String args[]) {
//				      ��ȣ, ����, ����, ����					
		int[] score = {	1, 100,  90,  90,
					    2,  70,  90, 100,
						3, 100, 100, 100, 
						4,  70,  60,  80, 
						5,  70,  90, 100
					   }; 

		try {
		      RandomAccessFile raf = new RandomAccessFile("score2.dat", "rw");

		      for(int i=0; i<score.length;i++) {
		             raf.writeInt(score[i]);				
		      }

		      while(true) {
			     System.out.println(raf.readInt());
		      }
		} catch (EOFException eof) {
		       // readInt()�� ȣ������ �� �� �̻� ���� ������ ������ EOFException�� �߻��Ѵ�.
		} catch (IOException e) {
		       e.printStackTrace();		
		}
	} // main
}
