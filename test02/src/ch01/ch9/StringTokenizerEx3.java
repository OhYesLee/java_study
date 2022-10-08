package ch9;

import java.util.*;

class StringTokenizerEx3 { 
	public static void main(String args[]) { 
		String source = "1,��õ��,100,100,100|2,�ڼ���,95,80,90|3,���ڹ�,80,90,90";
		StringTokenizer st = new StringTokenizer(source, "|"); 

		while(st.hasMoreTokens()) {
			String token = st.nextToken();

			StringTokenizer st2 = new StringTokenizer(token, ","); 
			while(st2.hasMoreTokens()) {
				System.out.println(st2.nextToken());
			}
			System.out.println("------");
		}
	} // main�� ��
}
