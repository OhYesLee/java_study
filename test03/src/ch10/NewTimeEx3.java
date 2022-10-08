package ch10;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

import static java.time.DayOfWeek.TUESDAY;
import static java.time.temporal.TemporalAdjusters.*;

class DayAfterTomorrow implements TemporalAdjuster {
	@Override
	public Temporal adjustInto(Temporal temporal) {
		return temporal.plus(2, ChronoUnit.DAYS);	
	}
}

class NewTimeEx3 {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate date  = today.with(new DayAfterTomorrow());

		p(today); // System.out.println(today);
		p(date);

		p(today.with(firstDayOfNextMonth()));        // ���� ���� ù ��
		p(today.with(firstDayOfMonth()));            // �� ���� ù ��
		p(today.with(lastDayOfMonth()));             // �� ���� ������ ��
		p(today.with(firstInMonth(TUESDAY)));        // �� ���� ù��° ȭ����
		p(today.with(lastInMonth(TUESDAY)));         // �� ���� ������ ȭ����
		p(today.with(previous(TUESDAY)));            // ���� �� ȭ����
		p(today.with(previousOrSame(TUESDAY)));      // ���� �� ȭ����(���� ����)
		p(today.with(next(TUESDAY)));                // ���� �� ȭ����
		p(today.with(nextOrSame(TUESDAY)));          // ���� �� ȭ����(���� ����)
		p(today.with(dayOfWeekInMonth(4, TUESDAY))); // �� ���� 4��° ȭ����
	}

	static void p(Object obj) { // ������ ���̸� ���̱� ���� ���� ������ �޼���
		System.out.println(obj);
	}
}
