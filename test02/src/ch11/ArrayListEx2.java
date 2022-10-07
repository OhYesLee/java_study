package ch11;

import java.util.ArrayList;
import java.util.List;

class ArrayListEx2 { 
	public static void main(String[] args) { 
		final int LIMIT = 10;	// �ڸ����� �ϴ� ������ ������ �����Ѵ�.
		String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ"; 
		int length = source.length(); 

		List list = new ArrayList(length/LIMIT + 10); // ũ�⸦ �ణ ���� �ְ� ��´�.

		for(int i=0; i < length; i+=LIMIT) { 
			if(i+LIMIT < length ) 
				list.add(source.substring(i, i+LIMIT)); 
			else 
				list.add(source.substring(i)); 
		} 

		for(int i=0; i < list.size(); i++) { 
			System.out.println(list.get(i)); 
		} 
	} // main()
} 
