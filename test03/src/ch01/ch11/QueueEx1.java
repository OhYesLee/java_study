package ch01.ch11;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

class QueueEx1 {
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5;	// Queue�� �ִ� 5�������� ����ǵ��� �Ѵ�.

	public static void main(String[] args) {
		System.out.println("help�� �Է��ϸ� ������ �� �� �ֽ��ϴ�.");

		while(true) {
			System.out.print(">>");
			try {
                             // ȭ�����κ��� ���δ����� �Է¹޴´�.
				Scanner s = new Scanner(System.in);  
				String input = s.nextLine().trim();

				if("".equals(input)) continue;

				if(input.equalsIgnoreCase("q")) {
					System.exit(0);
				} else if(input.equalsIgnoreCase("help")) {
					System.out.println(" help - ������ �����ݴϴ�.");
					System.out.println(" q �Ǵ� Q - ���α׷��� �����մϴ�.");
					System.out.println(" history - �ֱٿ� �Է��� ��ɾ " + MAX_SIZE +"�� �����ݴϴ�.");
				} else if(input.equalsIgnoreCase("history")) {
					int i=0;
					// �Է¹��� ��ɾ �����ϰ�,
					save(input);    

					// LinkedList�� ������ �����ش�.
					LinkedList tmp = (LinkedList)q;
					ListIterator it = tmp.listIterator();

					while(it.hasNext()) {
						System.out.println(++i+"."+it.next());
					}
				} else {
					save(input);    
					System.out.println(input);
				} // if(input.equalsIgnoreCase("q")) {
			} catch(Exception e) {
				System.out.println("�Է¿����Դϴ�.");
			}
		} // while(true)
	} //  main()

	public static void save(String input) {
		// queue�� �����Ѵ�.
		if(!"".equals(input))
			q.offer(input);

		// queue�� �ִ�ũ�⸦ ������ ���� ó�� �Էµ� ���� �����Ѵ�.
		if(q.size() > MAX_SIZE)  // size()�� Collection�������̽��� ����
			q.remove();
	}
} // end of class
