package euler.util;
import java.util.ArrayList;


public class EulerUtils {

	public static boolean isPrime(long n) {
		boolean prime = true;
		for (long i = 3; i <= Math.sqrt(n); i += 2)
			if (n % i == 0) {
				prime = false;
				break;
			}
		if (( n%2 !=0 && prime && n > 2) || n == 2) {
			return true;
		} else {
			return false;
		}
	}
	
	public static ArrayList<Integer> getPrimeFactors(Long n) {
		return null;
	}
}
