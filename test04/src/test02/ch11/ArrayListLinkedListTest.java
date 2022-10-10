package test02.ch11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListLinkedListTest { 
      public static void main(String args[]) { 
            // �߰��� �������� ������ ����Ͽ� ����� ��ƾ��Ѵ�.
            ArrayList al = new ArrayList(2000000);
            LinkedList ll = new LinkedList(); 

            System.out.println("= ���������� �߰��ϱ� ="); 
            System.out.println("ArrayList :"+add1(al)); 
            System.out.println("LinkedList :"+add1(ll)); 
            System.out.println(); 
            System.out.println("= �߰��� �߰��ϱ� ="); 
            System.out.println("ArrayList :"+add2(al)); 
            System.out.println("LinkedList :"+add2(ll)); 
            System.out.println(); 
            System.out.println("= �߰����� �����ϱ� ="); 
            System.out.println("ArrayList :"+remove2(al)); 
            System.out.println("LinkedList :"+remove2(ll)); 
            System.out.println(); 
            System.out.println("= ���������� �����ϱ� ="); 
            System.out.println("ArrayList :"+remove1(al)); 
            System.out.println("LinkedList :"+remove1(ll)); 
      } 

      public static long add1(List list) { 
            long start = System.currentTimeMillis(); 
            for(int i=0; i<1000000;i++) list.add(i+""); 
            long end = System.currentTimeMillis(); 
            return end - start; 
      } 

      public static long add2(List list) { 
            long start = System.currentTimeMillis(); 
            for(int i=0; i<10000;i++) list.add(500, "X"); 
            long end = System.currentTimeMillis(); 
            return end - start; 
      } 

      public static long remove1(List list) { 
            long start = System.currentTimeMillis(); 
            for(int i=list.size()-1; i >= 0;i--) list.remove(i); 
            long end = System.currentTimeMillis(); 
            return end - start; 
      } 

      public static long remove2(List list) { 
            long start = System.currentTimeMillis(); 
            for(int i=0; i<10000;i++) list.remove(i); 
            long end = System.currentTimeMillis(); 
            return end - start; 
      } 
} 
