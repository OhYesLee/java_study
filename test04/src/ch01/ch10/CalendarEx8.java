package ch01.ch10;

class CalendarEx8 {
      public static void main(String[] args){ 
		  String date1 = "201508";
		  String date2 = "201405";
		
		  // ��� ���� substring���� �߶� ������ ��ȯ�Ѵ�.
		  // �⿡ 12�� ���ؼ� ���� ��ȯ�� ������ ������ �ϸ� �������� ���� �� �ִ�.
		  int month1 = Integer.parseInt(date1.substring(0,4))* 12 + Integer.parseInt(date1.substring(4));
		  int month2 = Integer.parseInt(date2.substring(0,4))* 12 + Integer.parseInt(date2.substring(4));

		  System.out.println(date1 +"�� " + date2 + "�� ���̴� " + Math.abs(month1-month2) + "���� �Դϴ�.");
      } 
} 
