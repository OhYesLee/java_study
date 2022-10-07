package ch7;

class InnerEx6 {
	Object iv = new Object(){ void method(){} };		// �͸�Ŭ����
	static Object cv = new Object(){ void method(){} };	// �͸�Ŭ����

	void myMethod() {
		Object lv = new Object(){ void method(){} };	// �͸�Ŭ����
	}
}
