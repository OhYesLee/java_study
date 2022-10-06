package ch13;

class ThreadEx5 {
	static long startTime = 0;

	public static void main(String args[]) {
		ThreadEx5_1 th1 = new ThreadEx5_1();
		th1.start();
		startTime = System.currentTimeMillis();

		for(int i=0; i < 300; i++) {
			System.out.print("-");
		}

		System.out.print("�ҿ�ð�1:" + (System.currentTimeMillis() - ThreadEx5.startTime));
	}
}

class ThreadEx5_1 extends Thread {
	public void run() {
		for(int i=0; i < 300; i++) {
			System.out.print("|");
		}

		System.out.print("�ҿ�ð�2:" + (System.currentTimeMillis() - ThreadEx5.startTime));
	}
}
