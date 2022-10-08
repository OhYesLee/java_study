package test02.ch7;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class  InnerEx8 {
	public static void main(String[] args) {
		Button b = new Button("Start");
		b.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println("ActionEvent occurred!!!");
				}
			} // �͸� Ŭ������ ��
		);
	} // main�޼����� ��
} // InnerEx8Ŭ������ ��
