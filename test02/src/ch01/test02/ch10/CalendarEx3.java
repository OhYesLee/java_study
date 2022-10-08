package ch01.test02.ch10;

import java.util.Calendar;

class  CalendarEx3 {
	public static void main(String[] args) {
		final int[] TIME_UNIT = {3600, 60, 1}; // ū ������ �տ� ���´�.
		final String[] TIME_UNIT_NAME = {"�ð� ", "�� ", "�� "};

		Calendar time1 = Calendar.getInstance();
		Calendar time2 = Calendar.getInstance();

		// time1�� �ð��� 10�� 20�� 30�ʷ� �����Ѵ�.
		time1.set(Calendar.HOUR_OF_DAY, 10);
		time1.set(Calendar.MINUTE, 20);
		time1.set(Calendar.SECOND, 30);

		// time2�� �ð��� 20�� 30�� 10�ʷ� �����Ѵ�.
		time2.set(Calendar.HOUR_OF_DAY, 20);
		time2.set(Calendar.MINUTE, 30);
		time2.set(Calendar.SECOND, 10);

		System.out.println("time1 :"+time1.get(Calendar.HOUR_OF_DAY)+"�� " + time1.get(Calendar.MINUTE) +"�� " + time1.get(Calendar.SECOND) + "��");
		System.out.println("time2 :"+time2.get(Calendar.HOUR_OF_DAY)+"�� " + time2.get(Calendar.MINUTE) +"�� " + time2.get(Calendar.SECOND) + "��");

		long difference =  Math.abs(time2.getTimeInMillis() - time1.getTimeInMillis())/1000;
		System.out.println("time1�� time2�� ���̴� "+ difference +"�� �Դϴ�.");

		String tmp = "";

		for(int i=0; i < TIME_UNIT.length;i++) { 
			  tmp += difference/TIME_UNIT[i]+ TIME_UNIT_NAME[i]; 
			  difference %= TIME_UNIT[i];
		} 

		System.out.println("�ú��ʷ� ��ȯ�ϸ� " + tmp + "�Դϴ�.");
	}
}
