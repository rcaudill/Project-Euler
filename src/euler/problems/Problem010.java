package euler.problems;
import euler.util.EulerUtils;


public class Problem010 {

	/**
	 * @euler_problem Problem 10
	 * @euler_problem_description The sum of the primes below 10 is 
	 * 2 + 3 + 5 + 7 = 17.
	 * Find the sum of all the primes below two million. 
	 */
	public Problem010() {
		run(2000000);
	}
	
	public static long run(int limit) {
		long sum = 0;
		for (int i=1; i<limit; i++) {
			if (EulerUtils.isPrime(i)) {
				sum += i;
			}
		}
		return sum;
	}
}
