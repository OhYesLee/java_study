package ch13;

import javax.swing.JOptionPane;

class ThreadEx14_1 {
	public static void main(String[] args) throws Exception 	{
		ThreadEx14_2 th1 = new ThreadEx14_2();
		th1.start();

		String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���."); 
		System.out.println("�Է��Ͻ� ���� " + input + "�Դϴ�.");
		th1.interrupt();   // interrupt()�� ȣ���ϸ�, interrupted���°� true�� �ȴ�.
		System.out.println("isInterrupted():"+ th1.isInterrupted());
	}
}

class ThreadEx14_2 extends Thread {
	public void run() {
		int i = 10;

		while(i!=0 && !isInterrupted()) {
			System.out.println(i--);

			try {
				Thread.sleep(1000);  // 1�� ����
			} catch(InterruptedException e) {}
		}

		System.out.println("ī��Ʈ�� ����Ǿ����ϴ�.");
	} // main
}
