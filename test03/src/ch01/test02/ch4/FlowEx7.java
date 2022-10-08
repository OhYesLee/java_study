package ch01.test02.ch4;

import java.util.Scanner;

class FlowEx7 {
	public static void main(String[] args) { 
		int user, com;

		System.out.print("����(1),����(2), ��(3) �� �ϳ��� �Է��ϼ���.>");

		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine(); // ȭ���� ���� �Է¹��� ������ tmp�� ����
		user = Integer.parseInt(tmp);    // �Է¹��� ���ڿ�(tmp)�� ���ڷ� ��ȯ

		com = (int)(Math.random() * 3) + 1;  // 1,2,3�� �ϳ��� com�� �����

		System.out.println("����� "+ user +"�Դϴ�.");
		System.out.println("����  "+ com +"�Դϴ�.");

		switch(user-com) {
			case 2: case -1:
				System.out.println("����� �����ϴ�.");
				break;
			case 1: case -2:
				System.out.println("����� �̰���ϴ�.");
				break;
			case 0:
				System.out.println("�����ϴ�.");
	//			break;		// ������ �����̹Ƿ� break�� ����� �ʿ䰡 ����. 
		}
	} // main�� ��
}
