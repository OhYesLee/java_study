package ch13;

class ThreadEx15 {
	public static void main(String args[]) {
		RunImplEx15 r = new RunImplEx15();
		Thread th1 = new Thread(r, "*");
		Thread th2 = new Thread(r, "**");
		Thread th3 = new Thread(r, "***");

		th1.start();
		th2.start();
		th3.start();

		try {
			Thread.sleep(2000);
			th1.suspend();	// ������ th1�� ��� �ߴܽ�Ų��.
			Thread.sleep(2000);
			th2.suspend();
			Thread.sleep(3000);
			th1.resume();	// ������ th1�� �ٽ� �����ϵ��� �Ѵ�.
			Thread.sleep(3000);
			th1.stop();		// ������ th1�� ���������Ų��.
			th2.stop();
			Thread.sleep(2000);
			th3.stop();
		} catch (InterruptedException e) {}
	} // main
}

class RunImplEx15 implements Runnable {
	public void run() {
		while(true) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {}
		}
	} // run()
}
