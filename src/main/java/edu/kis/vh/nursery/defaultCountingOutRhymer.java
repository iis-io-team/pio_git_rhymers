package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

	public static final int MINUS_JEDEN = -1;
	private int[] NUMBERS = new int[12];

	public int total = MINUS_JEDEN;

	public void countIn(int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}

		public boolean callCheck() {
			return total == MINUS_JEDEN;
		}
		
			public boolean isFull() {
				return total == 11;
			}
		
				protected int peekaboo() {
					if (callCheck())
						return MINUS_JEDEN;
					return NUMBERS[total];
				}
			
					public int countOut() {
						if (callCheck())
							return MINUS_JEDEN;
						return NUMBERS[total--];
					}

}
