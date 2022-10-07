package ch13;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

class ForkJoinEx1 {
	static final ForkJoinPool pool = new ForkJoinPool();  // ������Ǯ�� ����

	public static void main(String[] args) {
		long from = 1L;
		long to   = 100_000_000L;

		SumTask task = new SumTask(from, to);

		long start = System.currentTimeMillis(); // ���۽ð� �ʱ�ȭ
		Long result = pool.invoke(task);

		System.out.println("Elapsed time(4 Core):"+(System.currentTimeMillis()-start));
		System.out.printf("sum of %d~%d=%d%n", from, to, result);
		System.out.println();

		result = 0L;
		start = System.currentTimeMillis(); // ���۽ð� �ʱ�ȭ
		for(long i=from;i<=to;i++)
			result += i;

		System.out.println("Elapsed time(1 Core):"+(System.currentTimeMillis()-start));
		System.out.printf("sum of %d~%d=%d%n", from, to, result);
	} // main�� ��
}

class SumTask extends RecursiveTask<Long> {
	long from;
	long to;

	SumTask(long from, long to) {
		this.from = from;
		this.to    = to;
	}

	public Long compute() {
		long size = to - from;

		if(size <= 5)     // ���� ���ڰ� 5�� ���ϸ�
			return sum(); // ������ ���� ��ȯ

		long half = (from+to)/2;

		// ������ ������ ������ �� ���� �۾��� ����
		SumTask leftSum  = new SumTask(from, half);
		SumTask rightSum = new SumTask(half+1, to);

		leftSum.fork();

		return rightSum.compute() + leftSum.join();
	}

	long sum() { // from~to�� ��� ���ڸ� ���� ����� ��ȯ
		long tmp = 0L; 

		for(long i=from;i<=to;i++)
			tmp += i;

		return tmp;
	}
}
