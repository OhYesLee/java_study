package ch01.test02.ch8;

class TryWithResourceEx {
	public static void main(String args[]) {

		try (CloseableResource cr = new CloseableResource()) {
			cr.exceptionWork(false); // ���ܰ� �߻����� �ʴ´�.
 		} catch(WorkException e) {
			e.printStackTrace();
		} catch(CloseException e) {
			e.printStackTrace();
		}
		System.out.println();
	
		try (CloseableResource cr = new CloseableResource()) {
			cr.exceptionWork(true); // ���ܰ� �߻��Ѵ�.
 		} catch(WorkException e) {
			e.printStackTrace();
		} catch(CloseException e) {
			e.printStackTrace();
		}	
	} // main�� ��
}

class CloseableResource implements AutoCloseable {
	public void exceptionWork(boolean exception) throws WorkException {
		System.out.println("exceptionWork("+exception+")�� ȣ���");

		if(exception)
			throw new WorkException("WorkException�߻�!!!");
	}

	public void close() throws CloseException {
		System.out.println("close()�� ȣ���");
		throw new CloseException("CloseException�߻�!!!");
	}
}

class WorkException extends Exception {
	WorkException(String msg) { super(msg); }
}

class CloseException extends Exception {
	CloseException(String msg) { super(msg); }
}
