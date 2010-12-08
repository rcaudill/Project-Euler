package euler.problems;

public class Problem005 {

	/**
	 * @euler_problem Problem 5
	 *
	 */
	public Problem005() {
		run(1, 20);
	}
	
	public static long run(int rangeMin, int rangeMax) {
		for (long i=20; i<Long.MAX_VALUE; i++) {
			if (evenlyDivides(rangeMin, rangeMax, i)) {
				return i;
			}
		}
		return -1;
	}
	private static boolean evenlyDivides(int rangeMin, int rangeMax, long value) {
		for (long i=rangeMin; i<rangeMax; i++) {
			if (value%i!=0) {
				return false;
			}
		}
		return true;
	}
}
