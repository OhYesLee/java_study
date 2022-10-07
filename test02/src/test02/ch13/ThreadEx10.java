package test02.ch13;

class ThreadEx10 implements Runnable  {
	static boolean autoSave = false;

	public static void main(String[] args) {
		Thread t = new Thread(new ThreadEx10());
		t.setDaemon(true);		// �� �κ��� ������ ������� �ʴ´�.
		t.start();

		for(int i=1; i <= 10; i++) {
			try{
				Thread.sleep(1000);
			} catch(InterruptedException e) {}
			System.out.println(i);
			
			if(i==5)
				autoSave = true;
		}

		System.out.println("���α׷��� �����մϴ�.");
	}

	public void run() {
		while(true) {
			try { 
				Thread.sleep(3 * 1000);	// 3�ʸ���
			} catch(InterruptedException e) {}	

			// autoSave�� ���� true�̸� autoSave()�� ȣ���Ѵ�.
			if(autoSave) {
				autoSave();
			}
		}
	}

	public void autoSave() {
		System.out.println("�۾������� �ڵ�����Ǿ����ϴ�.");
	}
}
