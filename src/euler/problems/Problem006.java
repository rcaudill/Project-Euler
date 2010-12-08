package euler.problems;

public class Problem006 {

	/**
	 * @euler_problem Problem 6
	 * @euler_problem_description Find the difference between the sum of the 
	 * squares of the first one hundred natural numbers and the square of the sum.
	 */
	public Problem006() {
		run(100);
	}
	
	public static int run(int limit) {
		int sumOfSquares = 0;
		int squareofSums = 0;
		
		for(int i=1; i<=limit; i++) {
			sumOfSquares += Math.pow(i, 2);
			squareofSums += i;
		}
		squareofSums = (int) Math.pow(squareofSums,2);
		
		return squareofSums-sumOfSquares;
	}
}
