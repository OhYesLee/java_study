package ch16;

import java.net.*;
import java.io.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public class UdpServer {
	public void start() throws IOException {
		// ��Ʈ 7777���� ����ϴ� ������ �����Ѵ�.
		DatagramSocket socket = new DatagramSocket(7777);
		DatagramPacket inPacket, outPacket;

		byte[] inMsg = new byte[10];
		byte[] outMsg;

		while(true) {
			// �����͸� �����ϱ� ���� ��Ŷ�� �����Ѵ�.
			inPacket = new DatagramPacket(inMsg, inMsg.length);

			// ��Ŷ�� ���� �����͸� ����(receive)�Ѵ�.
			socket.receive(inPacket);

			// ������ ��Ŷ���� ���� client�� IP�ּҿ� Port�� ��´�.
			InetAddress address = inPacket.getAddress();
			int port = inPacket.getPort();

			// ������ ���� �ð��� �ú��� ����([hh:mm:ss])�� ��ȯ�Ѵ�.			
			SimpleDateFormat sdf = new SimpleDateFormat("[hh:mm:ss]");
			String time = sdf.format(new Date());
			outMsg = time.getBytes(); // time�� byte�迭�� ��ȯ�Ѵ�.

			// ��Ŷ�� �����ؼ� client���� ����(send)�Ѵ�.
			outPacket = new DatagramPacket(outMsg, outMsg.length, address, port);
			socket.send(outPacket);
		}
	} // start()

	public static void main(String args[]) {
		try {
			new UdpServer().start(); // UDP������ �����Ų��.
		} catch (IOException e) {
			e.printStackTrace();
		}
	} // main
}
