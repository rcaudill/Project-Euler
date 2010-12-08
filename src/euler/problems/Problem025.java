package euler.problems;
import euler.util.LargeNumber;


public class Problem025 {
	/**
	 * @euler_problem Problem 20
	 */
	public Problem025() {
		run(new LargeNumber(12));
	}
	
	public static LargeNumber run(LargeNumber n) {
		if (n.toString().equals("1")) {
			return n;
		} else {
			return run(n-1)+run(n-2);
		}
	}
}
