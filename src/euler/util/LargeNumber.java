package euler.util;
import java.util.ArrayList;

public class LargeNumber {
	ArrayList<Integer> value;
	
	public LargeNumber() {
		this.value = new ArrayList<Integer>();
	}
	
	public LargeNumber(String value) {
		this();
		for (char c : value.toCharArray()) {
			this.value.add(Integer.valueOf(String.valueOf(c)));
		}
	}
	
	public LargeNumber(int value) {
		this(String.valueOf(value));
	}
	
	public LargeNumber(Long value) {
		this(String.valueOf(value));
	}
	
	public int digits() {
		return value.size();
	}
	
	public int digitAt(int index) {
		return value.get(index);
	}
	
	public void push(int number) {
		value.add(0, number);
	}
	
	public void queue(int number) {
		value.add(number);
	}
	
	public static LargeNumber subtract1(LargeNumber n) {
		LargeNumber result = new LargeNumber();
		
		return result;
	}
	
	public static LargeNumber add(ArrayList<LargeNumber> list) {
		LargeNumber sumTotal = new LargeNumber();
		for (LargeNumber l : list) {
			sumTotal = add(sumTotal, l);
		}
		return sumTotal;
	}
	
	public static LargeNumber add(LargeNumber n1, LargeNumber n2) {
		LargeNumber sum = new LargeNumber();
		LargeNumber biggerNumber, smallerNumber;
		int carry = 0;
		if (n1.digits()>n2.digits()) {
			biggerNumber = n1;
			smallerNumber = n2;
		} else {
			biggerNumber = n2;
			smallerNumber = n1;
		}
		int smallArrayCounter = smallerNumber.digits()-1;
		for (int i=biggerNumber.digits()-1; i>=0; i--) {
			int s1 = biggerNumber.digitAt(i);
			int s2;
			try {
				s2 = smallerNumber.digitAt(smallArrayCounter--);
			} catch (Exception e) {
				s2 = 0;
			}
			int temp = s1+s2+carry;
			if (temp > 9) {
				String s = String.valueOf(temp);
				carry = Integer.valueOf(s.substring(0, s.length()-1));
				temp = Integer.valueOf(String.valueOf(s.charAt(s.length()-1)));
			} else {
				carry = 0;
			}			
			sum.push(temp);
		}
		if (carry!=0) {
			sum.push(carry);
		}
		return sum;
	}
	
	public static LargeNumber multiply(ArrayList<LargeNumber> list) {
		LargeNumber productTotal = new LargeNumber(1);
		for (LargeNumber l : list) {
			productTotal = multiply(productTotal, l);
		}
		return productTotal;
	}
	
	public static LargeNumber multiply(LargeNumber n1, LargeNumber n2) {
		ArrayList<LargeNumber> product = new ArrayList<LargeNumber>();
		int carry=0;
		int counter = 0;
		for (int i=n1.digits()-1; i>=0; i--) {
			product.add(new LargeNumber());
			for (int z=0; z<counter; z++) {
				product.get(counter).push(0);
			}
			for (int j=n2.digits()-1; j>=0; j--) {
				int temp = n1.digitAt(i) * n2.digitAt(j) + carry;
				if (temp > 9) {
					String s = String.valueOf(temp);
					carry = Integer.valueOf(s.substring(0, s.length()-1));
					temp = Integer.valueOf(String.valueOf(s.charAt(s.length()-1)));
				} else {
					carry = 0;
				}
				product.get(counter).push(temp);
			}
			if (carry!=0) {
				product.get(counter).push(carry);
				carry=0;
			}
			counter++;
		}
		return add(product);
	}
	
	public int sumOfDigits() {
		int result = 0;
		for (Integer i : this.value) {
			result += i;
		}
		return result;
	}
	
	public String toString() {
		if (value.size()==0) {
			return "0";
		} else {
			String result = "";
			for (Integer i : value) {
				result += i;
			}
			return result;
		}
	}
}
