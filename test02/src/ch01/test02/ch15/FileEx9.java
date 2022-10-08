package ch01.test02.ch15;

import java.io.File;

class FileEx9 { 
	public static void main(String[] args) { 
		if (args.length != 1) { 
			System.out.println("Usage: java FileEx9 DIRECTORY"); 
			System.exit(0); 
		} 

		File dir = new File(args[0]); 

		if(!dir.exists() || !dir.isDirectory()) {
			System.out.println("��ȿ���� ���� ���丮�Դϴ�.");
			System.exit(0);
		} 

		File[] list = dir.listFiles(); 

		for (int i = 0; i < list.length; i++) { 
			String fileName = list[i].getName(); 
			// ���ϸ� 
			String newFileName = "0000" + fileName; 
			newFileName = newFileName.substring(newFileName.length() - 7); 
			list[i].renameTo(new File(dir, newFileName)); 
		} 
	} // end of main 
} // end of FileEx9 class  
