package test02.ch8;

import java.io.*;

class ExceptionEx16 {
	public static void main(String[] args) 
	{
		try {
			File f = createFile(args[0]);
			System.out.println( f.getName()+"������ ���������� �����Ǿ����ϴ�.");
		} catch (Exception e) {
			System.out.println(e.getMessage()+" �ٽ� �Է��� �ֽñ� �ٶ��ϴ�.");
		}
	}	// main�޼����� ��

	static File createFile(String fileName) throws Exception {
		if (fileName==null || fileName.equals(""))
			throw new Exception("�����̸��� ��ȿ���� �ʽ��ϴ�.");
		File f = new File(fileName);		//  FileŬ������ ��ü�� �����.
        // File��ü�� createNewFile�޼��带 �̿��ؼ� ���� ������ �����Ѵ�.
		f.createNewFile();
		return f;		// ������ ��ü�� ������ ��ȯ�Ѵ�.
	}	// createFile�޼����� ��
}	// Ŭ������ ��
