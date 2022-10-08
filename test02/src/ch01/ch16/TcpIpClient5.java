package ch01.ch16;

import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;

public class TcpIpClient5 {
	public static void main(String args[]) {
		try {
			String serverIp = "127.0.0.1";
            
			// ������ �����Ͽ� ������ ��û�Ѵ�.
			Socket socket = new Socket(serverIp, 7777); 

			System.out.println("������ ����Ǿ����ϴ�.");
			ch16.Sender sender = new ch16.Sender(socket);
			ch16.Receiver receiver = new ch16.Receiver(socket);

			sender.start();
			receiver.start();
		} catch(ConnectException ce) {
			ce.printStackTrace();
		} catch(IOException ie) {  
			ie.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();  
		}  
	} // main
} // class
