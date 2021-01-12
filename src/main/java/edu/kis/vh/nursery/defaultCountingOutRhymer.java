package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int ERROR = -1;
	public static final int ARRAY_SIZE = 12;
	final int S = 12;
	private final int[] numbers = new int[ARRAY_SIZE];

	public int total = -1;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

		public boolean callCheck() {
			return total == ERROR;
		}
		
			public boolean isFull() {
				return total == ARRAY_SIZE - 1;
			}
		
				protected int peekaboo() {
					if (callCheck())
						return ERROR;
					return numbers[total];
				}
			
					public int countOut() {
						if (callCheck())
							return ERROR;
						return numbers[total--];
					}
}
