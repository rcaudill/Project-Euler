package euler.problems;

public class Problem017 {
	/**
	 * @euler_problem Problem 17
	 */
	public Problem017() {
		run();
	}
	
	public static void run() {
		String[] ones = new String[] {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		String[] teens = new String[] {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
		String[] tens = new String[] {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
		
		int charCounter = 0;
		
		for (int i=1; i<=1000; i++) {
			String number = "";
			String temp = String.valueOf(i);
			if (temp.length()==3) {
				number += ones[Integer.valueOf(temp.substring(0, 1))-1]+"hundred";
				temp = temp.substring(1,3);
				if (Integer.valueOf(temp)>9&&Integer.valueOf(temp)<20) {
					number+="and";
					number += teens[Integer.valueOf(temp)-10];
				} else {
					if (Integer.valueOf(temp.substring(0, 1))!=0) {
						number+="and";
						number+=tens[Integer.valueOf(temp.substring(0, 1))-2];
						if (Integer.valueOf(temp.substring(1, 2))!=0) {
							number+=ones[Integer.valueOf(temp.substring(1, 2))-1];
						}
					} else {
						if (Integer.valueOf(temp.substring(1, 2))!=0) {
							number+="and";
							number+=ones[Integer.valueOf(temp.substring(1, 2))-1];
						}
					}
				}
			} else if (temp.length()==2) {
				if (Integer.valueOf(temp)>9&&Integer.valueOf(temp)<20) {
					number += teens[Integer.valueOf(temp)-10];
				} else {
					if (Integer.valueOf(temp.substring(0, 1))!=0) {
						number+=tens[Integer.valueOf(temp.substring(0, 1))-2];
						if (Integer.valueOf(temp.substring(1, 2))!=0) {
							number+=ones[Integer.valueOf(temp.substring(1, 2))-1];
						}
					}
				}
			} else if (temp.length()==1) {
				if (Integer.valueOf(temp)!=0) {
					number+=ones[Integer.valueOf(temp)-1];
				}
			}
			System.out.println(number + " -> " + number.length());
			charCounter+=number.length();
		}
		System.out.println("Letters: " + charCounter);
	}
}
