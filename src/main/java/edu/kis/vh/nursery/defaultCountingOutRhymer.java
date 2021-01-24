package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {


	public static final int SIZE = 12;
	public static final int INITIAL_VALUE = -1;
	private int[] NUMBERS = new int[SIZE];

	public int total = INITIAL_VALUE;

	public void countIn(int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}

		public boolean callCheck() {
			return total == -1;
		}
		
			public boolean isFull() {
				return total == 11;
			}
		
				protected int peekaboo() {
					if (callCheck())
						return -1;
					return NUMBERS[total];
				}
			
					public int countOut() {
						if (callCheck())
							return -1;
						return NUMBERS[total--];
					}

}
