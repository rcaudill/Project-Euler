package euler.problems;
import java.util.ArrayList;


public class Problem004 {

	/**
	 * @euler_problem Problem 4
	 *
	 */
	public Problem004() {
		run(100, 999);
	}
	
	public static int run(int min, int max) {
		ArrayList<Integer> palindroms = new ArrayList<Integer>();
		for (int i=min; i<=max; i++) {
			for (int j=min; j<=max; j++) {
				int temp = i*j;
				if (temp == Integer.parseInt((new StringBuffer(String.valueOf(temp)).reverse().toString()))) {
					palindroms.add(temp);
				}
			}
		}
		int largest=0;
		for (Integer i: palindroms) {
			if (i>largest) {
				largest = i;
			}
		}
		return largest;
	}
}
