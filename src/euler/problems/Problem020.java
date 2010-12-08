package euler.problems;
import euler.util.LargeNumber;


public class Problem020 {
	/**
	 * @euler_problem Problem 20
	 */
	public Problem020() {
		run();
	}
	
	public static void run() {
		LargeNumber factorial = new LargeNumber(1);
		for (int i=1; i<=100; i++) {
			factorial = LargeNumber.multiply(factorial, new LargeNumber(i));
		}
		System.out.println(factorial);
		System.out.println(factorial.sumOfDigits());
	}
}
