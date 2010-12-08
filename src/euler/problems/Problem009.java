package euler.problems;

public class Problem009 {

	/**
	 * @euler_problem Problem 9
	 * @euler_problem_description A Pythagorean triplet is a set of three 
	 * natural numbers, a  b  c, for which, a2 + b2 = c2
	 * For example, 32 + 42 = 9 + 16 = 25 = 52.
	 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
	 * Find the product abc. 
	 */
	public Problem009() {
		run(500);
	}
	
	public static int run(int limit) {
		for (int a=1; a<limit; a++) {
			for (int b=a+1; b<limit; b++) {
				double c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2)); 
				if (c%1==0 && a < b && b < c) {
					//System.out.println(a+"^2 + "+b+"^2 = "+(int)c+"^2");
					if (a+b+c==1000) {
						System.out.println(a+"^2 + "+b+"^2 = "+(int)c+"^2");
						return a*b*(int)c;
					}
				}
			}
		}
		return -1;
	}
}
