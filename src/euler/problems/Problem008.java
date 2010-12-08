package euler.problems;
import euler.util.Constants;


public class Problem008 {

	/**
	 * @euler_problem Problem 8
	 * @euler_problem_description Find the greatest product of five 
	 * consecutive digits in the 1000-digit number.
	 */
	public Problem008() {
		run(Constants.PROBLEM_8_ONE_THOUSAND_DIGITS);
	}
	
	public static int run(String number) {
		int product = 0;
		int[] digits = new int[5];
		for (int i=0; i<number.length()-4; i++) {
			digits[0] = Integer.valueOf(number.substring(i, i+1));
			digits[1] = Integer.valueOf(number.substring(i+1, i+2));
			digits[2] = Integer.valueOf(number.substring(i+2, i+3));
			digits[3] = Integer.valueOf(number.substring(i+3, i+4));
			digits[4] = Integer.valueOf(number.substring(i+4, i+5));
			int temp = digits[0]*digits[1]*digits[2]*digits[3]*digits[4];
			//System.out.println(digits[0]+"*"+digits[1]+"*"+digits[2]+"*"+digits[3]+"*"+digits[4] + "=" + temp);
			if (temp > product) {
				product = temp;
			}
		}
		return product;
	}
}
