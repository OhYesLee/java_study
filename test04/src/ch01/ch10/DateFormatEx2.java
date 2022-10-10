package ch01.ch10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

class DateFormatEx2 {
	public static void main(String[] args) {
		// Calendar�� Date���� ��ȯ�� ������ ���� �Ѵ�.
		Calendar cal = Calendar.getInstance();
		cal.set(2005, 9, 3);	// 2005�� 10�� 3�� - Month�� 0~11�� ������ ���´�.

		Date day = cal.getTime();

		SimpleDateFormat sdf1, sdf2, sdf3, sdf4;
		sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		sdf2 = new SimpleDateFormat("yy-MM-dd E����");
		sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		sdf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");

		System.out.println(sdf1.format(day)); // format(Date d)
		System.out.println(sdf2.format(day));
		System.out.println(sdf3.format(day));
		System.out.println(sdf4.format(day));
	}
}
