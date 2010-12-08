package euler.problems;

public class Problem001 {

	/**
	 * @euler_problem Problem 1
	 * @euler_problem_description If we list all the natural numbers below 10
	 * that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these 
	 * multiples is 23.
	 * Find the sum of all the multiples of 3 or 5 below 1000.
	 */
	public Problem001() {
		run(1000);
	}
	
	public static long run(int limit) {
		long sum = 0;
		for (long i=1; i<limit; i++) {
			if (i%3==0 || i%5==0) {
				sum += i;
			}
		}
		return sum;
	}
}
