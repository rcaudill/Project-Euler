package euler.problems;
import java.util.ArrayList;
import java.util.HashMap;

import euler.util.EulerUtils;


public class Problem012 {
	
	/**
	 * @euler_problem Problem 12
	 */

	public Problem012() {
		run(500);
	}
	
	public static int run(int n) {
		int counter = 0;
		int triangle = 0;
		int divisors = 0;
			
		do {
			counter ++;
			triangle = getTriangle(counter);
			divisors = getDivisors(triangle);
			System.out.println(counter + " -> " + triangle + " -> " + divisors);
		} while (divisors<=n);
		
		return divisors;
	}
	private static int getTriangle(int number) {
		//int sum = 0;
		//for (int i=1; i<=number; i++) {
		//	sum += i;
		//}
		//return sum;
		
		//(n^2+n)/2
		return ((number<<1)+number)/2;
	}
	private static int getDivisors(int number) {
		ArrayList<Integer> primeFactors = EulerUtils.getPrimeFactors(new Long(number));
		HashMap<Integer, Integer> counted = new HashMap<Integer, Integer>();
		
		for (Integer l : primeFactors) {
			if (counted.containsKey(l)) {
				counted.put(l, counted.get(l)+1);
			} else {
				counted.put(l, 1);
			}
		}		
		int product = 1;
		for (Integer i : counted.values() ) {
			product = product * (i+1);
		}
		return product;
	}
}
