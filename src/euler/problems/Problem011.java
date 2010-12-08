package euler.problems;
import euler.util.Constants;


public class Problem011 {
	
	/**
	 * @euler_problem Problem 11 
	 */
	public Problem011() {
		run(Constants.PROBLEM_11_GRID);
	}
	
	public static long run(String[][] grid) {
		int product = 0;
		for (int row=0; row<grid.length; row++) {
			for (int col=0; col<grid[row].length; col++) {
				int temp = 0;

				//Test across
				try {
					temp = Integer.valueOf(grid[row][col])*Integer.valueOf(grid[row][col+1])*Integer.valueOf(grid[row][col+2])*Integer.valueOf(grid[row][col+3]);
					if (temp > product) {product = temp;}
				} catch (ArrayIndexOutOfBoundsException e) {}
				
				//Test down
				try {
					temp = Integer.valueOf(grid[row][col])*Integer.valueOf(grid[row+1][col])*Integer.valueOf(grid[row+2][col])*Integer.valueOf(grid[row+3][col]);
					if (temp > product) {product = temp;}
				} catch (ArrayIndexOutOfBoundsException e) {}

				//Test diagonally (forward slash)
				try {
					temp = Integer.valueOf(grid[row][col])*Integer.valueOf(grid[row+1][col-1])*Integer.valueOf(grid[row+2][col-2])*Integer.valueOf(grid[row+3][col-3]);
					if (temp > product) {product = temp;}
				} catch (ArrayIndexOutOfBoundsException e) {}

				//Test diagonally (backslash)
				try {
					temp = Integer.valueOf(grid[row][col])*Integer.valueOf(grid[row+1][col+1])*Integer.valueOf(grid[row+2][col+2])*Integer.valueOf(grid[row+3][col+3]);
					if (temp > product) {product = temp;}
				} catch (ArrayIndexOutOfBoundsException e) {}
			}
		}
		return product;
	}
}
