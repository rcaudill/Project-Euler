package euler.problems;
import java.util.ArrayList;

import euler.util.EulerUtils;


public class Problem003 {

	/**
	 * @euler_problem Problem 3
	 * 
	 */
	public Problem003() {
		run(new Long("600851475143"));
	}
	
	public static ArrayList<Integer> run(Long n) {
		return EulerUtils.getPrimeFactors(n);
	}
	
}
