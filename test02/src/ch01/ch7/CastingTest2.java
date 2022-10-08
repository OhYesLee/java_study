package ch01.ch7;

class CastingTest2 {
	public static void main(String args[]) {
		ch7.Car car = new ch7.Car();
		ch7.Car car2 = null;
		ch7.FireEngine fe = null;
  
		car.drive();
		fe = (ch7.FireEngine)car;		// 8��° ��. �������� OK. ���� �� ������ �߻�
		fe.drive();
		car2 = fe;
		car2.drive();
	}
}
