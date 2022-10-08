package ch11;

import java.util.EmptyStackException;
import java.util.Vector;

class MyStack extends Vector {
    public Object push(Object item) {
		addElement(item);
		return item;
    }

    public Object pop() {
		Object obj = peek();	 // Stack�� ����� ������ ��Ҹ� �о�´�.
		//   ���� Stack�� ��������� peek()�޼��尡 EmptyStackException�� �߻���Ų��.
        //   ������ ��Ҹ� �����Ѵ�. �迭�� index�� 0 ���� �����ϹǷ� 1�� ���ش�.
		removeElementAt(size() - 1); 

		return obj;
    }

    public Object peek() {
		int	len = size();

		if (len == 0)
			throw new EmptyStackException();
        // ������ ��Ҹ� ��ȯ�Ѵ�. �迭�� index�� 0 ���� �����ϹǷ� 1�� ���ش�.
		return elementAt(len - 1);	
    }

    public boolean empty() {
		return size() == 0;
    }
    
    public int search(Object o) {
		int i = lastIndexOf(o);	// ���������� ��ü�� ã�´�. 
		// ��ȯ���� ����� ��ġ(�迭�� index)�̴�.
		if (i >= 0) { // ��ü�� ã�� ���
			return size() - i; // Stack�� �� ���� ����� ��ü�� index�� 1�� �����ϱ� ������
                               // ����� ���ؼ� ���Ѵ�.
		}

		return - 1;		// �ش� ��ü�� ã�� ���ϸ� -1�� ��ȯ�Ѵ�.
	}
}
