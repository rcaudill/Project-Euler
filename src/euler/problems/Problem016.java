package euler.problems;
import java.util.ArrayList;


public class Problem016 {
	/**
	 * @euler_problem Problem 16
	 */
	public Problem016() {
		run();
	}
	
	public static void run() {
		ArrayList<Integer> product = new ArrayList<Integer>();
		int carry=0;
		product.add(0,2);
		for (int i=1; i<1000; i++) {
			ArrayList<Integer> temp = new ArrayList<Integer>();
			for (int p=product.size()-1; p>=0; p--) {
				int digit = product.get(p) * 2 + carry;
				if (digit>9) {
					carry = Integer.valueOf(String.valueOf(digit).substring(0, (String.valueOf(digit).length()-1)));
					digit=Integer.valueOf(String.valueOf(String.valueOf(digit).charAt(String.valueOf(digit).length()-1)));
				} else { 
					carry=0;
				}
				temp.add(0,digit);
				if (p==0 && carry!=0) {
					temp.add(0,carry);
				}
			}
			carry=0;
			product = temp;
		}
		int sumOfDigits = 0;
		for (Integer i : product) {
			sumOfDigits+=i;
		}
		System.out.println(sumOfDigits);
	}
	
}
