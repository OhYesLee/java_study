package ch01.test02.ch8;

class NewExceptionTest {
	public static void main(String args[]) {
		try {
			startInstall();		// ���α׷� ��ġ�� �ʿ��� �غ� �Ѵ�.
			copyFiles();			// ���ϵ��� �����Ѵ�. 
		} catch (SpaceException e)	{
			System.out.println("���� �޽��� : " + e.getMessage());
			e.printStackTrace();
			System.out.println("������ Ȯ���� �Ŀ� �ٽ� ��ġ�Ͻñ� �ٶ��ϴ�.");
		} catch (MemoryException me)	{
			System.out.println("���� �޽��� : " + me.getMessage());
			me.printStackTrace();
			System.gc();		//  Garbage Collection�� �����Ͽ� �޸𸮸� �÷��ش�.
			System.out.println("�ٽ� ��ġ�� �õ��ϼ���.");
		} finally {
			deleteTempFiles();	// ���α׷� ��ġ�� ���� �ӽ����ϵ��� �����Ѵ�.
		} // try�� ��
	} // main�� ��

   static void startInstall() throws SpaceException, MemoryException { 
		if(!enoughSpace()) 		// ����� ��ġ ������ ������...
			throw new SpaceException("��ġ�� ������ �����մϴ�.");
		if (!enoughMemory())		// ����� �޸𸮰� ������...
			throw new MemoryException("�޸𸮰� �����մϴ�.");
   } // startInstall�޼����� ��

   static void copyFiles() { /* ���ϵ��� �����ϴ� �ڵ带 ���´�. */ }
   static void deleteTempFiles() { /* �ӽ����ϵ��� �����ϴ� �ڵ带 ���´�.*/}
   
   static boolean enoughSpace()   {
		// ��ġ�ϴµ� �ʿ��� ������ �ִ��� Ȯ���ϴ� �ڵ带 ���´�.
		return false;
   }
   static boolean enoughMemory() {
		// ��ġ�ϴµ� �ʿ��� �޸𸮰����� �ִ��� Ȯ���ϴ� �ڵ带 ���´�.
		return true;
   }
} // ExceptionTestŬ������ ��

class SpaceException extends Exception {
	SpaceException(String msg) {
	   super(msg);	
   }
} 

class MemoryException extends Exception {
	MemoryException(String msg) {
	   super(msg);	
   }
}
