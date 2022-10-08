package ch01.test02.ch8;

class FinallyTest {
	public static void main(String args[]) {
		try {
			startInstall();		// ���α׷� ��ġ�� �ʿ��� �غ� �Ѵ�.
			copyFiles();		// ���ϵ��� �����Ѵ�. 
			deleteTempFiles();	// ���α׷� ��ġ�� ���� �ӽ����ϵ��� �����Ѵ�.
		} catch (Exception e) {
			e.printStackTrace();
		    	deleteTempFiles();   // ���α׷� ��ġ�� ���� �ӽ����ϵ��� �����Ѵ�.
		} // try-catch�� ��
	} // main�� ��

   static void startInstall() { 
        /* ���α׷� ��ġ�� �ʿ��� �غ� �ϴ� �ڵ带 ���´�.*/ 
   }
   static void copyFiles() { /* ���ϵ��� �����ϴ� �ڵ带 ���´�. */ }
   static void deleteTempFiles() { /* �ӽ����ϵ��� �����ϴ� �ڵ带 ���´�.*/ }
}
