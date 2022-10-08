package ch01.test02.ch12;

import java.util.ArrayList;

class NewClass{
	int newField;

	int getNewField() { 
		return newField;
	}	

	@Deprecated
	int oldField;

	@Deprecated
	int getOldField() { 
		return oldField;
	}
}


class AnnotationEx3 {
	@SuppressWarnings("deprecation")     // deprecation���� ��� ����
	public static void main(String args[]) {
		NewClass nc = new NewClass();

		nc.oldField = 10;                     //@Depreacted�� ���� ����� ���
		System.out.println(nc.getOldField()); //@Depreacted�� ���� ����� ���

		@SuppressWarnings("unchecked")               // ���׸��� ���� ��� ����
		ArrayList<NewClass> list = new ArrayList();  // Ÿ���� �������� ����.
		list.add(nc);
	}
}

