package ch01.ch10;

import java.util.*;
import java.text.*;

class DateFormatEx1 {
	public static void main(String[] args) {
		Date today = new Date();

		SimpleDateFormat sdf1, sdf2, sdf3, sdf4;
		SimpleDateFormat sdf5, sdf6, sdf7, sdf8, sdf9;

		sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		sdf2 = new SimpleDateFormat("''yy�� MMM dd�� E����");
		sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		sdf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");

		sdf5 = new SimpleDateFormat("������ �� ���� D��° ���Դϴ�.");
		sdf6 = new SimpleDateFormat("������ �� ���� d��° ���Դϴ�.");
		sdf7 = new SimpleDateFormat("������ �� ���� w��° ���Դϴ�.");
		sdf8 = new SimpleDateFormat("������ �� ���� W��° ���Դϴ�.");
		sdf9 = new SimpleDateFormat("������ �� ���� F��° E�����Դϴ�.");

		System.out.println(sdf1.format(today));	// format(Date d)
		System.out.println(sdf2.format(today));
		System.out.println(sdf3.format(today));
		System.out.println(sdf4.format(today));
		System.out.println();
		System.out.println(sdf5.format(today));
		System.out.println(sdf6.format(today));
		System.out.println(sdf7.format(today));
		System.out.println(sdf8.format(today));
		System.out.println(sdf9.format(today));
	}
}
