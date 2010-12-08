package euler.problems;
import java.util.LinkedList;

import euler.util.Constants;

public class Problem013 {
	/**
	 * @euler_problem Problem 13
	 */
	public Problem013() {
		run(Constants.PROBLEM_13);
	}
	
	public static String run(String[] numbers) {
		LinkedList<String> sum = new LinkedList<String>();
		String first_ten_digits = "";
		
		int remainder = 0;
		for (int col=String.valueOf(numbers[0]).length()-1; col>=0; col--) {
			int temp = 0;
			for (int row=0; row<numbers.length; row++) {
				String digit = String.valueOf(numbers[row].charAt(col));
				temp += Integer.valueOf(digit);
			}
			temp += remainder;
			if (col!=0) {
				sum.addFirst(String.valueOf(temp).substring(String.valueOf(temp).length()-1, String.valueOf(temp).length()));
				remainder = Integer.valueOf(String.valueOf(temp).substring(0, String.valueOf(temp).length()-1));
			} else {
				sum.addFirst(String.valueOf(temp));
			}
		}
		System.out.println(sum);
		int counter = 0;
		while (first_ten_digits.length()<10) {
			first_ten_digits += sum.get(counter++); 
		}
		return first_ten_digits;
	}
}
