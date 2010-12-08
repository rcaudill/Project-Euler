package euler.problems;

public class Problem014 {
	/**
	 * @euler_problem Problem 14
	 */
	public Problem014() {
		run();
	}
	
	public static void run() {
		int highestStartValue = 1;
		int highestChainLength = 1;
		
		float n;
		int counter = 1;
		int chainLength = 1;
		final int LIMIT = 1000000;
		while (counter<LIMIT) {
			n = counter;
			while (n!=1) {
				if (n%2==0) {
					n=n/2;
				} else {
					n=(n*3)+1;
				}
				chainLength++;
			}
			if (highestChainLength<chainLength) {
				highestChainLength=chainLength;
				highestStartValue=counter;
			}
			//System.out.println(counter+" -> "+chainLength);
			counter++;
			chainLength=1;
		}
		System.out.println(highestStartValue+" -> "+highestChainLength);
	}
	
}
